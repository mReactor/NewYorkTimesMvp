package promobi.newyorkimes.com.newyorkmvp.ui.base;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import promobi.newyorkimes.com.newyorkmvp.data.DataManager;
import promobi.newyorkimes.com.newyorkmvp.util.rx.SchedulerProvider;

/**
 * Created by mazeqube on 4/26/18.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V>  {

    private final DataManager dataManager;
    private final CompositeDisposable compositeDisposable;
    private final SchedulerProvider schedulerProvider;

    private V mvpView;

    @Inject
    public BasePresenter(DataManager dataManager, CompositeDisposable compositeDisposable,
                         SchedulerProvider schedulerProvider){

        this.dataManager = dataManager;
        this.compositeDisposable = compositeDisposable;
        this.schedulerProvider = schedulerProvider;
    }


    @Override
    public void onAttach(V mvpView) {

        this.mvpView = mvpView;
    }

    @Override
    public void onViewPrepared() {

    }

    public DataManager getDataManager() {
        return dataManager;
    }

    public CompositeDisposable getCompositeDisposable() {
        return compositeDisposable;
    }

    public SchedulerProvider getSchedulerProvider() {
        return schedulerProvider;
    }

    public V getMvpView() {
        return mvpView;
    }

    public boolean isViewAttached(){
        return mvpView != null;
    }

    @Override
    public void onDettach() {

        compositeDisposable.dispose();
        mvpView = null;
    }
}
