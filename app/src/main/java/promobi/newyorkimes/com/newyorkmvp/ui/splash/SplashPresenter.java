package promobi.newyorkimes.com.newyorkmvp.ui.splash;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import promobi.newyorkimes.com.newyorkmvp.data.DataManager;
import promobi.newyorkimes.com.newyorkmvp.ui.base.BasePresenter;
import promobi.newyorkimes.com.newyorkmvp.util.rx.SchedulerProvider;

/**
 * Created by mazeqube on 4/27/18.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V>  {


    @Inject
    public SplashPresenter(DataManager dataManager, CompositeDisposable compositeDisposable, SchedulerProvider schedulerProvider) {
        super(dataManager, compositeDisposable, schedulerProvider);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);

        downloadRequiredData();

    }

    private void downloadRequiredData() {


        Observable.timer(3,TimeUnit.SECONDS)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Long aLong) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                        getMvpView().openCategory();
                    }
                });

    }


}
