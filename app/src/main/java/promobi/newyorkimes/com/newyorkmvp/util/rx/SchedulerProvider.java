package promobi.newyorkimes.com.newyorkmvp.util.rx;


import io.reactivex.Scheduler;

/**
 * Created by mazeqube on 4/26/18.
 */

public interface SchedulerProvider {

        Scheduler ui();

        Scheduler io();

        Scheduler computation();


}
