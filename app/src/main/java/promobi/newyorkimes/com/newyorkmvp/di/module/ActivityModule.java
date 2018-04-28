package promobi.newyorkimes.com.newyorkmvp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import org.greenrobot.greendao.annotation.Property;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ActivityContext;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ApplicationContext;
import promobi.newyorkimes.com.newyorkmvp.di.scope.PerActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.TopStoriesDetail.TopStoriesDetailMvpView;
import promobi.newyorkimes.com.newyorkmvp.ui.TopStoriesDetail.TopStoriesDetailPresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.TopStoriesDetail.TopStoriesDetailPresenterMvpView;
import promobi.newyorkimes.com.newyorkmvp.ui.category.CategoryMvpPresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.category.CategoryMvpView;
import promobi.newyorkimes.com.newyorkmvp.ui.category.CategoryPresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.splash.SplashMvpPresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.splash.SplashMvpView;
import promobi.newyorkimes.com.newyorkmvp.ui.splash.SplashPresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.TopStoriesMvpPresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.TopStoriesMvpView;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.TopStoriesPresenter;
import promobi.newyorkimes.com.newyorkmvp.util.rx.AppSchedulerProvider;
import promobi.newyorkimes.com.newyorkmvp.util.rx.SchedulerProvider;

/**
 * Created by mazeqube on 4/26/18.
 */
@Module
public class ActivityModule  {

    private AppCompatActivity activity;

    public ActivityModule(AppCompatActivity appCompatActivity){

        activity = appCompatActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return activity;
    }

    @ActivityContext
    @Provides
    Context provideContext(){
        return activity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable(){

        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider getSchedulerProvider(){

        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView>
    provideSplashMvpPresenter(SplashPresenter<SplashMvpView> splashMvpPresenter ){

        return splashMvpPresenter;
    }

    @Provides
    @PerActivity
    CategoryMvpPresenter<CategoryMvpView>
    provideCategoryPresenter(CategoryPresenter<CategoryMvpView> categoryPresenter){

        return categoryPresenter;
    }

    @Provides
    @PerActivity
    TopStoriesMvpPresenter<TopStoriesMvpView>
    provideTopStoriesPresenter(TopStoriesPresenter<TopStoriesMvpView> topStoriesPresenter){
        return topStoriesPresenter;
    }

    @Provides
    @PerActivity
    TopStoriesDetailPresenterMvpView<TopStoriesDetailMvpView>
    provideTopStoriesPresenterDetail(TopStoriesDetailPresenter<TopStoriesDetailMvpView> topStoriesDetailPresenter ){
        return topStoriesDetailPresenter;
    }



}
