package promobi.newyorkimes.com.newyorkmvp.ui.TopStoriesDetail;

import com.daimajia.slider.library.SliderAdapter;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import javax.inject.Inject;

import butterknife.OnClick;
import io.reactivex.disposables.CompositeDisposable;
import promobi.newyorkimes.com.newyorkmvp.NewYorkTimesApplication;
import promobi.newyorkimes.com.newyorkmvp.R;
import promobi.newyorkimes.com.newyorkmvp.data.DataManager;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Multimedium;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BaseActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BasePresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.TopStories;
import promobi.newyorkimes.com.newyorkmvp.util.rx.SchedulerProvider;

/**
 * Created by mazeqube on 4/28/18.
 */

public class TopStoriesDetailPresenter<V extends TopStoriesDetailMvpView> extends BasePresenter<V> implements TopStoriesDetailPresenterMvpView<V> {

    private Result result;


    @Inject
    public TopStoriesDetailPresenter(DataManager dataManager, CompositeDisposable compositeDisposable, SchedulerProvider schedulerProvider) {
        super(dataManager, compositeDisposable, schedulerProvider);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);

       initilizeSliderLayoutAndContent();

    }


    private void initilizeSliderLayoutAndContent() {

        result = NewYorkTimesApplication.getInstance().getResults();
        TextSliderView textSliderView  = new TextSliderView(((TopStoriesDetail)getMvpView()));



        if(result.getMultimedia() != null) {
            for (Multimedium multimedium :
                    result.getMultimedia()) {

                textSliderView.image(multimedium.getUrl());

            }
        }else{

            textSliderView.image(R.drawable.nytimes);
        }

        ((TopStoriesDetail)getMvpView()).sliderLayout.addSlider(textSliderView);

        ((TopStoriesDetail)getMvpView()).textView.setText(result.getAbstract());

        ((TopStoriesDetail)getMvpView()).time.setText(result.getPublishedDate());

        ((TopStoriesDetail)getMvpView()).autherName.setText(result.getByline());




    }

    @Override
    public void onDettach() {
        super.onDettach();
    }


}
