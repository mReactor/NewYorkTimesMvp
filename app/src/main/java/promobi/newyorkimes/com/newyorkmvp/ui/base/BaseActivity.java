package promobi.newyorkimes.com.newyorkmvp.ui.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.Unbinder;
import promobi.newyorkimes.com.newyorkmvp.NewYorkTimesApplication;
import promobi.newyorkimes.com.newyorkmvp.di.component.ActivityComponent;
import promobi.newyorkimes.com.newyorkmvp.di.component.DaggerActivityComponent;
import promobi.newyorkimes.com.newyorkmvp.di.module.ActivityModule;

/**
 * Created by mazeqube on 4/26/18.
 */

public abstract class BaseActivity extends AppCompatActivity implements MvpView{

    private ProgressDialog progressDialog;
    private ActivityComponent activityComponent;
    private Unbinder unbinder;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((NewYorkTimesApplication) getApplication()).getComponent())
                .build();

    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    @Override
    public void showLoading() {

        hideLoading();
        if(progressDialog == null){
            progressDialog = new ProgressDialog(this);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setCancelable(true);
        }

        progressDialog.show();

    }

    @Override
    public void hideLoading() {

        if(progressDialog != null && progressDialog.isShowing()){

            progressDialog.dismiss();
        }
    }


    public void setUnBinder(Unbinder unBinder){

        this.unbinder = unBinder;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(unbinder != null){
            unbinder.unbind();
        }
    }

    protected abstract void setUp();
}
