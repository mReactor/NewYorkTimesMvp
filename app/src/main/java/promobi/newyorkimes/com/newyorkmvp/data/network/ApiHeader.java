package promobi.newyorkimes.com.newyorkmvp.data.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.inject.Inject;
import javax.inject.Singleton;

import promobi.newyorkimes.com.newyorkmvp.di.scope.ApiInfo;

/**
 * Created by mazeqube on 4/26/18.
 */
@Singleton
public class ApiHeader {

    private PublicApiHeader publicApiHeader;

    @Inject
    public ApiHeader(PublicApiHeader publicApiHeader){

        this.publicApiHeader = publicApiHeader;
    }

    public PublicApiHeader getPublicApiHeader() {
        return publicApiHeader;
    }

    public static final class PublicApiHeader{

        @Expose
        @SerializedName("api-key")
        String apiKey;

        @Inject
        public PublicApiHeader(@ApiInfo String apiKey){
            this.apiKey = apiKey;
        }

        public String getApiKey() {
            return "d932bc4a2ef9425b8f3ca23cc93cfc02";
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }
    }
}
