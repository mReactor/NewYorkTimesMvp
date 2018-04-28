package promobi.newyorkimes.com.newyorkmvp.data.network;

import com.rx2androidnetworking.Rx2AndroidNetworking;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Maybe;
import io.reactivex.Single;
import promobi.newyorkimes.com.newyorkmvp.data.db.model.TopStoriesResponse;
import promobi.newyorkimes.com.newyorkmvp.util.AppConstant;

/**
 * Created by mazeqube on 4/26/18.
 */
@Singleton
public class AppApiHelper implements ApiHelper {


    private ApiHeader apiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader){

        this.apiHeader = apiHeader;
    }


    @Override
    public ApiHeader getAPiHeader() {
        return apiHeader;
    }

    @Override
    public Single<TopStoriesResponse> getTopStories() {
        return Rx2AndroidNetworking.get(ApiEndPoint.BASE_URL)
                .build()
                .getObjectSingle(TopStoriesResponse.class);

    }
}
