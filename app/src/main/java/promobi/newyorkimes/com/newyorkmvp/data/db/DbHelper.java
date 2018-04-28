package promobi.newyorkimes.com.newyorkmvp.data.db;

import java.util.List;

import io.reactivex.Observable;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;

/**
 * Created by mazeqube on 4/27/18.
 */

public interface DbHelper {

    void saveTopStories(List<Result> result);
    Observable<List<Result>> getTopStorieDataBase();
    void deleteAllRecord();
}
