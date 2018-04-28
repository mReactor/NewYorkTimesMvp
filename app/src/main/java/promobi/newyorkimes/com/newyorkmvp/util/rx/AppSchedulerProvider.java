package promobi.newyorkimes.com.newyorkmvp.util.rx;


import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by mazeqube on 4/26/18.
 */

public class AppSchedulerProvider implements SchedulerProvider {


    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }
}
