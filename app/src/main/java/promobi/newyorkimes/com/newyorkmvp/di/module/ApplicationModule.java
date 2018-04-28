package promobi.newyorkimes.com.newyorkmvp.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import promobi.newyorkimes.com.newyorkmvp.R;
import promobi.newyorkimes.com.newyorkmvp.data.AppDataManager;
import promobi.newyorkimes.com.newyorkmvp.data.DataManager;
import promobi.newyorkimes.com.newyorkmvp.data.db.AppDbHelper;
import promobi.newyorkimes.com.newyorkmvp.data.db.DbHelper;
import promobi.newyorkimes.com.newyorkmvp.data.network.ApiHelper;
import promobi.newyorkimes.com.newyorkmvp.data.network.AppApiHelper;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ApiInfo;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ApplicationContext;
import promobi.newyorkimes.com.newyorkmvp.di.scope.DatabaseInfo;
import promobi.newyorkimes.com.newyorkmvp.util.AppConstant;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by mazeqube on 4/26/18.
 */

@Module()
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application){

        this.application = application;
    }

    @Provides
    public Application provideApplication() {
        return application;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return application;
    }


    @Provides
    @ApiInfo
    public String provideApiKey(){
        return "d932bc4a2ef9425b8f3ca23cc93cfc02";
    }


    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstant.DB_NAME;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager){
        return appDataManager;
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }



}
