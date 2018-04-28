package promobi.newyorkimes.com.newyorkmvp.ui.topStories;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import promobi.newyorkimes.com.newyorkmvp.R;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BaseActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.adapter.TopStoriesAdapter;

public class TopStories extends BaseActivity implements TopStoriesMvpView {

    @Inject
    TopStoriesMvpPresenter<TopStoriesMvpView> topStoriesMvpPresenter;

    @BindView(R.id.top_stories_activity_top_stories)
    RecyclerView topStoriesList;


    public static Intent getstartIntent(Context context){

        Intent intent = new Intent(context,TopStories.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_stories);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        topStoriesMvpPresenter.onAttach(TopStories.this);
        topStoriesMvpPresenter.onViewPrepared();


    }

    @Override
    public void detailContent() {

    }

    @Override
    protected void setUp() {

    }

    /**
     *
     * @param topStoriesResponse
     */
    protected void initilizeTopStoriesAdapter(List<Result> topStoriesResponse) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        TopStoriesAdapter topStoriesAdapter = new TopStoriesAdapter(this,topStoriesResponse);

        topStoriesList.setLayoutManager(layoutManager);
        topStoriesList.setAdapter(topStoriesAdapter);


    }

    @OnClick(R.id.back_image_activity_top_stories)
    public void backToCategory(){
        onBackPressed();
    }


}
