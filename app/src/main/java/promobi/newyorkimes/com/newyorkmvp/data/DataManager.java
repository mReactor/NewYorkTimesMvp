package promobi.newyorkimes.com.newyorkmvp.data;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import promobi.newyorkimes.com.newyorkmvp.data.db.DbHelper;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.Result;
import promobi.newyorkimes.com.newyorkmvp.data.network.ApiHeader;
import promobi.newyorkimes.com.newyorkmvp.data.network.ApiHelper;

/**
 * Created by mazeqube on 4/26/18.
 */

public interface DataManager extends ApiHelper,DbHelper{


}
