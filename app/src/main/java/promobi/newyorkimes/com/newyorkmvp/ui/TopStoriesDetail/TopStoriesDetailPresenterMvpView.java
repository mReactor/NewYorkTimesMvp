package promobi.newyorkimes.com.newyorkmvp.ui.TopStoriesDetail;

import promobi.newyorkimes.com.newyorkmvp.di.scope.PerActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BasePresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.base.MvpPresenter;

/**
 * Created by mazeqube on 4/28/18.
 */

@PerActivity
public interface TopStoriesDetailPresenterMvpView<V extends TopStoriesDetailMvpView> extends MvpPresenter<V> {
}
