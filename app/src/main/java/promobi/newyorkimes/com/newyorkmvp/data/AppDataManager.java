package promobi.newyorkimes.com.newyorkmvp.data;

import android.content.Context;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import promobi.newyorkimes.com.newyorkmvp.data.db.DbHelper;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.TopStoriesResponse;
import promobi.newyorkimes.com.newyorkmvp.data.network.ApiHeader;
import promobi.newyorkimes.com.newyorkmvp.data.network.ApiHelper;
import promobi.newyorkimes.com.newyorkmvp.di.scope.ApplicationContext;

/**
 * Created by mazeqube on 4/26/18.
 */
@Singleton
public class AppDataManager implements DataManager {

    private final Context context;
    private final ApiHelper apiHelper;
    private final DbHelper dbHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context, ApiHelper apiHelper, DbHelper dbHelper){

        this.context = context;
        this.apiHelper = apiHelper;
        this.dbHelper = dbHelper;
    }


    @Override
    public ApiHeader getAPiHeader() {
        return apiHelper.getAPiHeader();
    }

    @Override
    public Single<TopStoriesResponse> getTopStories() {
        return apiHelper.getTopStories();
    }

    @Override
    public Observable<List<Result>> getTopStorieDataBase() {
        return dbHelper.getTopStorieDataBase();
    }

    @Override
    public void saveTopStories(List<Result> result) {
         dbHelper.saveTopStories(result);
    }

    @Override
    public void deleteAllRecord() {

        dbHelper.deleteAllRecord();
    }
}
