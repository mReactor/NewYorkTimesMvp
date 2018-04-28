package promobi.newyorkimes.com.newyorkmvp.ui.category;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import promobi.newyorkimes.com.newyorkmvp.data.DataManager;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BasePresenter;
import promobi.newyorkimes.com.newyorkmvp.util.rx.SchedulerProvider;

/**
 * Created by mazeqube on 4/27/18.
 */

public class CategoryPresenter<V extends CategoryMvpView > extends BasePresenter<V> implements CategoryMvpPresenter<V> {


    @Inject
    public CategoryPresenter(DataManager dataManager, CompositeDisposable compositeDisposable, SchedulerProvider schedulerProvider) {
        super(dataManager, compositeDisposable, schedulerProvider);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);

        initializeCategoryList();


    }

    private void initializeCategoryList() {


    }

    @Override
    public void onDettach() {
        super.onDettach();
    }


}
