package promobi.newyorkimes.com.newyorkmvp;

import android.app.Application;
import android.widget.LinearLayout;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.interceptors.HttpLoggingInterceptor;

import java.util.List;

import javax.inject.Inject;

import promobi.newyorkimes.com.newyorkmvp.data.DataManager;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;
import promobi.newyorkimes.com.newyorkmvp.di.component.ApplicationComponent;
import promobi.newyorkimes.com.newyorkmvp.di.component.DaggerApplicationComponent;
import promobi.newyorkimes.com.newyorkmvp.di.module.ApplicationModule;
import promobi.newyorkimes.com.newyorkmvp.util.AppLogger;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by mazeqube on 4/26/18.
 */

public class NewYorkTimesApplication extends Application {

    @Inject
    DataManager dataManager;

    private ApplicationComponent applicationComponent;

    @Inject
    protected CalligraphyConfig mCalligraphyConfig;

    private static NewYorkTimesApplication instance;


    private Result results;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        applicationComponent.inject(this);

        AppLogger.init();

        AndroidNetworking.initialize(getApplicationContext());
        if (BuildConfig.DEBUG) {
            AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY);
        }

        CalligraphyConfig.initDefault(mCalligraphyConfig);

        instance = this;

    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        applicationComponent = applicationComponent;
    }

    public void setResults(Result results) {
        this.results = results;
    }

    public Result getResults() {
        return results;
    }

    public static NewYorkTimesApplication getInstance() {
        return instance;
    }
}
