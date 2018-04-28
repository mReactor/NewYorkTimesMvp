package promobi.newyorkimes.com.newyorkmvp.ui.TopStoriesDetail;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import promobi.newyorkimes.com.newyorkmvp.R;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BaseActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BasePresenter;

public class TopStoriesDetail extends BaseActivity implements TopStoriesDetailMvpView{


    @Inject
    TopStoriesDetailPresenterMvpView<TopStoriesDetailMvpView> topStoriesDetailPresenter;

    @BindView(R.id.slider_activity_top_stories_detail)
    SliderLayout sliderLayout;

    @BindView(R.id.detail_news_activity_top_stories_detail)
    TextView textView;

    @BindView(R.id.time_news_activity_top_stories_detail)
    TextView time;

    @BindView(R.id.back_image_activity_top_stories_detail)
    ImageView backImage;

    @BindView(R.id.auther_name_news_activity_top_stories_detail)
    TextView autherName;

    public static Intent getStartIntent(Context context){

        Intent intent = new Intent(context,TopStoriesDetail.class);
        return intent;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_stories_detail);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));

        topStoriesDetailPresenter.onAttach(TopStoriesDetail.this);
    }

    @Override
    protected void setUp() {

        initilizeSlider();

    }

    private void initilizeSlider() {
    }

    @OnClick(R.id.back_image_activity_top_stories_detail)
    public void backToPreviousActivity(){
        onBackPressed();
    }
}
