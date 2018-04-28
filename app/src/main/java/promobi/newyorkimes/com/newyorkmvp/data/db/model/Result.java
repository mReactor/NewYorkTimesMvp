
package promobi.newyorkimes.com.newyorkmvp.data.db.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.Property;

import java.util.List;

import javax.inject.Inject;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "Result")
public class Result {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "section")
    @SerializedName("section")
    @Expose
    private String section;
    @Property(nameInDb = "subsection")
    @SerializedName("subsection")
    @Expose
    private String subsection;
    @Property(nameInDb = "title")
    @SerializedName("title")
    @Expose
    private String title;
    @Property(nameInDb = "abstract")
    @SerializedName("abstract")
    @Expose
    private String _abstract;
    @Property(nameInDb = "url")
    @SerializedName("url")
    @Expose
    private String url;
    @Property(nameInDb = "thumbnail_standard")
    @SerializedName("thumbnail_standard")
    @Expose
    private String thumbnailStandard;
    @Property(nameInDb = "short_url")
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @Property(nameInDb = "byline")
    @SerializedName("byline")
    @Expose
    private String byline;
    @Property(nameInDb = "item_type")
    @SerializedName("item_type")
    @Expose
    private String itemType;
    @Property(nameInDb = "updated_date")
    @SerializedName("updated_date")
    @Expose
    private String updatedDate;
    @Property(nameInDb = "created_date")
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @Property(nameInDb = "published_date")
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @Property(nameInDb = "material_type_facet")
    @SerializedName("material_type_facet")
    @Expose
    private String materialTypeFacet;
    @Property(nameInDb = "kicker")
    @SerializedName("kicker")
    @Expose
    private String kicker;
//    @Property(nameInDb = "des_facet")
//    @SerializedName("des_facet")
//    @Expose
//    private List<String> desFacet = null;
//    @Property(nameInDb = "org_facet")
//    @SerializedName("org_facet")
//    @Expose
//    private List<String> orgFacet = null;
//    @Property(nameInDb = "per_facet")
//    @SerializedName("per_facet")
//    @Expose
//    private List<String> perFacet = null;
//    @Property(nameInDb = "geo_facet")
//    @SerializedName("geo_facet")
//    @Expose
//    private List<String> geoFacet = null;
//    @Property(nameInDb = "section")
    @ToMany(referencedJoinProperty = "multiMediaId")
    @SerializedName("multimedia")
    @Expose
    private List<Multimedium> multimedia = null;
//    @Property(nameInDb = "section")
//    @SerializedName("related_urls")
//    @Expose
//    private List<RelatedUrl> relatedUrls = null;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1557637596)
    private transient ResultDao myDao;

    @Generated(hash = 2025078922)
    public Result(Long id, String section, String subsection, String title,
            String _abstract, String url, String thumbnailStandard, String shortUrl,
            String byline, String itemType, String updatedDate, String createdDate,
            String publishedDate, String materialTypeFacet, String kicker) {
        this.id = id;
        this.section = section;
        this.subsection = subsection;
        this.title = title;
        this._abstract = _abstract;
        this.url = url;
        this.thumbnailStandard = thumbnailStandard;
        this.shortUrl = shortUrl;
        this.byline = byline;
        this.itemType = itemType;
        this.updatedDate = updatedDate;
        this.createdDate = createdDate;
        this.publishedDate = publishedDate;
        this.materialTypeFacet = materialTypeFacet;
        this.kicker = kicker;
    }

    @Generated(hash = 1176609929)
    public Result() {
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailStandard() {
        return thumbnailStandard;
    }

    public void setThumbnailStandard(String thumbnailStandard) {
        this.thumbnailStandard = thumbnailStandard;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getMaterialTypeFacet() {
        return materialTypeFacet;
    }

    public void setMaterialTypeFacet(String materialTypeFacet) {
        this.materialTypeFacet = materialTypeFacet;
    }

    public String getKicker() {
        return kicker;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String get_abstract() {
        return this._abstract;
    }

    public void set_abstract(String _abstract) {
        this._abstract = _abstract;
    }

//    public List<String> getDesFacet() {
//        return desFacet;
//    }
//
//    public void setDesFacet(List<String> desFacet) {
//        this.desFacet = desFacet;
//    }
//
//    public List<String> getOrgFacet() {
//        return orgFacet;
//    }
//
//    public void setOrgFacet(List<String> orgFacet) {
//        this.orgFacet = orgFacet;
//    }
//
//    public List<String> getPerFacet() {
//        return perFacet;
//    }
//
//    public void setPerFacet(List<String> perFacet) {
//        this.perFacet = perFacet;
//    }
//
//    public List<String> getGeoFacet() {
//        return geoFacet;
//    }
//
//    public void setGeoFacet(List<String> geoFacet) {
//        this.geoFacet = geoFacet;
//    }
//
    @Keep
    public List<Multimedium> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<Multimedium> multimedia) {
        this.multimedia = multimedia;
    }
//
//    public List<RelatedUrl> getRelatedUrls() {
//        return relatedUrls;
//    }
//
//    public void setRelatedUrls(List<RelatedUrl> relatedUrls) {
//        this.relatedUrls = relatedUrls;
//    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1544423439)
    public synchronized void resetMultimedia() {
        multimedia = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1713721960)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getResultDao() : null;
    }




}
