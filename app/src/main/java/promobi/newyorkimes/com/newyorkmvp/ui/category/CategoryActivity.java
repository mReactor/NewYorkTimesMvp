package promobi.newyorkimes.com.newyorkmvp.ui.category;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import promobi.newyorkimes.com.newyorkmvp.R;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BaseActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.category.adapter.CategoryAdapter;

public class CategoryActivity extends BaseActivity implements CategoryMvpView {

    @Inject
    CategoryMvpPresenter<CategoryMvpView> categoryPresenter;

    @BindView(R.id.category_list_activity_catrgory)
    RecyclerView categoryList;

    public static Intent getStartIntent(Context context){

        Intent intent = new Intent(context,CategoryActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        categoryPresenter.onAttach(CategoryActivity.this);

        setUp();

    }


    @Override
    public void startTopStories() {

    }

    @Override
    protected void setUp() {

        initializeCategory();

    }

    private void initializeCategory() {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        CategoryAdapter categoryAdapter  = new CategoryAdapter(this,initializeDummyCategory());

        categoryList.setLayoutManager(layoutManager);
        categoryList.setAdapter(categoryAdapter);

    }

    private List<String> initializeDummyCategory() {

        List<String> category = new ArrayList<>();
        category.add("Top Stories");
        category.add("News");
        category.add("Sports");
        category.add("World");
        category.add("Politics");
        category.add("Internet");
        category.add("Finance");
        return category;

    }
}
