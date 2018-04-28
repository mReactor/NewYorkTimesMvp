package promobi.newyorkimes.com.newyorkmvp.ui.topStories;

import promobi.newyorkimes.com.newyorkmvp.di.scope.PerActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.base.MvpPresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.base.MvpView;

/**
 * Created by mazeqube on 4/27/18.
 */
@PerActivity
public interface TopStoriesMvpPresenter<V extends TopStoriesMvpView> extends MvpPresenter<V> {

}
