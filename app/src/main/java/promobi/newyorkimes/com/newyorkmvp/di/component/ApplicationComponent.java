package promobi.newyorkimes.com.newyorkmvp.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import promobi.newyorkimes.com.newyorkmvp.NewYorkTimesApplication;
import promobi.newyorkimes.com.newyorkmvp.data.DataManager;
import promobi.newyorkimes.com.newyorkmvp.data.db.DbHelper;
import promobi.newyorkimes.com.newyorkmvp.di.module.ApplicationModule;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ApplicationContext;

/**
 * Created by mazeqube on 4/26/18.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(NewYorkTimesApplication newYorkTimesApplication);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();


}
