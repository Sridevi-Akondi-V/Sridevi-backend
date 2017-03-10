
package models;

import javax.validation.*;
import javax.persistence.*;
import play.db.jpa.*;
import play.data.validation.*;
import java.util.List;
import java.io.File;

/* Edited by Sridevi Akondi */


@Entity
@Table(name = "tb_images")
@SuppressWarnings("FieldCanBeLocal")
public class Images {

    @Id
    @Column(name="Image_Type")
    private String itype;

    @Column(name="ImagesUrl")
    private String imagesurl;

    public Images() {

    }

    public Images (String itype, String imagesurl) {
        this.itype = itype;
        this.imagesurl=imagesurl;
    }

    public String getImages() { return itype; }
    public void setImages(String itype) {
        this.itype = itype;
    }

    public String getImagesUrl() { return imagesurl; }
    public void setImagesUrl(String imagesurl) {this.imagesurl = imagesurl; }

}









