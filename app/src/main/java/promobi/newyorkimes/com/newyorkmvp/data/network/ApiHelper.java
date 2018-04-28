package promobi.newyorkimes.com.newyorkmvp.data.network;

import java.util.List;

import io.reactivex.Maybe;
import io.reactivex.Single;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.TopStoriesResponse;

/**
 * Created by mazeqube on 4/26/18.
 */

public interface ApiHelper {

    ApiHeader getAPiHeader();

    Single<TopStoriesResponse> getTopStories();

}
