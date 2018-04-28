package promobi.newyorkimes.com.newyorkmvp.ui.category;

import promobi.newyorkimes.com.newyorkmvp.di.scope.PerActivity;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BasePresenter;
import promobi.newyorkimes.com.newyorkmvp.ui.base.MvpPresenter;

/**
 * Created by mazeqube on 4/27/18.
 */
@PerActivity
public interface CategoryMvpPresenter<V extends CategoryMvpView>  extends MvpPresenter<V> {


}
