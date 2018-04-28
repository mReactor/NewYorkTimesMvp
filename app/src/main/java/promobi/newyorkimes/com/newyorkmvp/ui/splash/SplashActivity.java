package promobi.newyorkimes.com.newyorkmvp.ui.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import javax.inject.Inject;

import butterknife.ButterKnife;
import promobi.newyorkimes.com.newyorkmvp.R;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BaseActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.category.CategoryActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView {


    @Inject
    SplashMvpPresenter<SplashMvpView> splashMvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        splashMvpPresenter.onAttach(SplashActivity.this);

       // splashMvpPresenter.onViewPrepared();

    }

    @Override
    public void openCategory() {

        Intent intent = CategoryActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void setUp() {
    }
}
