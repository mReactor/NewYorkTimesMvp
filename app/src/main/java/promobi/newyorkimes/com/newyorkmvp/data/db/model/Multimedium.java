
package promobi.newyorkimes.com.newyorkmvp.data.db.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
@Entity(nameInDb = "Multimedium")
public class Multimedium {


    @Id(autoincrement = true)
    private Long id;

    @NotNull
    private Long multiMediaId;

    @SerializedName("url")
    @Expose
    @Property(nameInDb = "url")
    private String url;
    @SerializedName("format")
    @Expose
    @Property(nameInDb = "format")
    private String format;
    @SerializedName("height")
    @Expose
    @Property(nameInDb = "height")
    private Integer height;

    @SerializedName("width")
    @Expose
    @Property(nameInDb = "width")
    private Integer width;
    @SerializedName("type")
    @Expose
    @Property(nameInDb = "type")
    private String type;
    @SerializedName("subtype")
    @Expose
    @Property(nameInDb = "subtype")
    private String subtype;
    @SerializedName("caption")
    @Expose
    @Property(nameInDb = "caption")
    private String caption;
    @SerializedName("copyright")
    @Expose
    @Property(nameInDb = "copyright")
    private String copyright;

    @Generated(hash = 427455229)
    public Multimedium(Long id, @NotNull Long multiMediaId, String url,
            String format, Integer height, Integer width, String type,
            String subtype, String caption, String copyright) {
        this.id = id;
        this.multiMediaId = multiMediaId;
        this.url = url;
        this.format = format;
        this.height = height;
        this.width = width;
        this.type = type;
        this.subtype = subtype;
        this.caption = caption;
        this.copyright = copyright;
    }

    @Generated(hash = 102889691)
    public Multimedium() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMultiMediaId() {
        return multiMediaId;
    }

    public void setMultiMediaId(Long multiMediaId) {
        this.multiMediaId = multiMediaId;
    }
}
