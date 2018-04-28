package promobi.newyorkimes.com.newyorkmvp.di.component;

import dagger.Component;
import promobi.newyorkimes.com.newyorkmvp.di.module.ActivityModule;
import promobi.newyorkimes.com.newyorkmvp.di.scope.PerActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.TopStoriesDetail.TopStoriesDetail;
import promobi.newyorkimes.com.newyorkmvp.ui.category.CategoryActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.splash.SplashActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.topStories.TopStories;

/**
 * Created by mazeqube on 4/26/18.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity splashActivity);

    void inject(CategoryActivity categoryActivity);

    void inject(TopStories topStories);

    void inject(TopStoriesDetail topStoriesDetail);
}
