
package promobi.newyorkimes.com.newyorkmvp.data.db.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
@Entity(nameInDb = "RelatedUrl")
public class RelatedUrl {

    @Id(autoincrement = true)
    private Long id;

    @SerializedName("suggested_link_text")
    @Property(nameInDb = "suggested_link_text")
    @Expose
    private String suggestedLinkText;
    @SerializedName("url")
    @Property(nameInDb = "url")
    @Expose
    private String url;

    @Generated(hash = 1049251946)
    public RelatedUrl(Long id, String suggestedLinkText, String url) {
        this.id = id;
        this.suggestedLinkText = suggestedLinkText;
        this.url = url;
    }

    @Generated(hash = 1838085353)
    public RelatedUrl() {
    }

    public String getSuggestedLinkText() {
        return suggestedLinkText;
    }

    public void setSuggestedLinkText(String suggestedLinkText) {
        this.suggestedLinkText = suggestedLinkText;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
