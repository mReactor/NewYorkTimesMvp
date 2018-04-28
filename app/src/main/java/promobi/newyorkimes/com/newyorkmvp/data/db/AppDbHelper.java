package promobi.newyorkimes.com.newyorkmvp.data.db;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.DaoMaster;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.DaoSession;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.TopStoriesResponse;

/**
 * Created by mazeqube on 4/27/18.
 */
@Singleton
public class AppDbHelper implements DbHelper {

    private final DaoSession daoSession;

    @Inject
    public AppDbHelper(DbOpenHelper dbOpenHelper){

        this.daoSession = new DaoMaster(dbOpenHelper.getReadableDb()).newSession();
    }


    @Override
    public void saveTopStories(final List<Result> result) {
         daoSession.getResultDao().insertInTx(result);
    }

    @Override
    public Observable<List<Result>> getTopStorieDataBase() {
        return Observable.fromCallable(new Callable<List<Result>>() {
            @Override
            public List<Result> call() throws Exception {
                return daoSession.getResultDao().loadAll();
            }
        });
    }


    @Override
    public void deleteAllRecord() {
        daoSession.getResultDao().deleteAll();
    }
}
