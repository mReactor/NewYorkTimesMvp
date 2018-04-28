package promobi.newyorkimes.com.newyorkmvp.ui.topStories;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import promobi.newyorkimes.com.newyorkmvp.data.DataManager;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.TopStoriesResponse;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ActivityContext;
import promobi.newyorkimes.com.newyorkmvp.di.scope.PerActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BasePresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.adapter.TopStoriesAdapter;
import promobi.newyorkimes.com.newyorkmvp.util.rx.SchedulerProvider;

/**
 * Created by mazeqube on 4/27/18.
 */

public class TopStoriesPresenter<V extends TopStoriesMvpView> extends BasePresenter<V> implements TopStoriesMvpPresenter<V> {


    @Inject
    public TopStoriesPresenter(DataManager dataManager, CompositeDisposable compositeDisposable, SchedulerProvider schedulerProvider) {
        super(dataManager, compositeDisposable, schedulerProvider);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);
    }

    @Override
    public void onDettach() {
        super.onDettach();
    }

    @Override
    public void onViewPrepared() {
        super.onViewPrepared();

        getMvpView().showLoading();

        getCompositeDisposable().add(getDataManager()

                .getTopStories()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<TopStoriesResponse>() {
                               @Override
                               public void accept(TopStoriesResponse topStoriesResponse) throws Exception {


                                   getDataManager().deleteAllRecord();
                                   insertTopStoriesIntoDataBase(topStoriesResponse.getResults());

                                   getMvpView().hideLoading();

                                   ((TopStories)getMvpView()).initilizeTopStoriesAdapter(topStoriesResponse.getResults());

                               }

                           }, new Consumer<Throwable>(){

                               @Override
                               public void accept(Throwable throwable) throws Exception {

                                   Log.i("Error Occured",throwable.getMessage());

                                   getMvpView().hideLoading();
                                   ((TopStories)getMvpView()).initilizeTopStoriesAdapter(getDataManager().getTopStorieDataBase().blockingSingle());

                               }
                           }
                )

        );

    }

    /**
     *
     * @param topStoriesResponse
     */
    public void insertTopStoriesIntoDataBase(List<Result> topStoriesResponse){


            getDataManager().saveTopStories(topStoriesResponse);

    }


}
