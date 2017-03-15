
package models;

import javax.validation.*;
import javax.persistence.*;
import play.db.jpa.*;
import play.data.validation.*;
import java.util.List;
import java.io.File;

/* Created by Sridevi Akondi*/


@Entity
@Table(name = "tb_collections")
@SuppressWarnings("FieldCanBeLocal")
public class Collection {

    @Id
    @Column(name="Collection_Type")
    private String ctype;

    @OneToMany
    @JoinColumn(name="Collection_Type", referencedColumnName="Collection_Type")
    private List<Restaurant> restaurants;

    @Column(name="Collection_Image_Url")
    private String collection_url;

   public Collection () {

    }

    public Collection (String ctype, String collection_url) {
        this.ctype = ctype;
        this.collection_url=collection_url;
    }

    public String getCollection() { return ctype; }
    public void setCollection(String ctype) {
        this.ctype = ctype;
    }

    public List<Restaurant> getRestaurants() { return restaurants; }

    public void setRestaurants(Restaurant restaurants) { this.restaurants.add(restaurants); }

    public String getCollectionUrl() { return collection_url; }
    public void setCollectionUrl(String collection_url) {this.collection_url = collection_url; }

}








