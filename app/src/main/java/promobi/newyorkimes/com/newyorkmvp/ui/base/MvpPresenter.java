package promobi.newyorkimes.com.newyorkmvp.ui.base;

/**
 * Created by mazeqube on 4/26/18.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);
    void onDettach();
    void onViewPrepared();
}
