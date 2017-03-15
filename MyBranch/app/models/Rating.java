package models;


import javax.persistence.*;

/* Created By Sridevi Akondi*/
@Entity
@Table(name = "tb_ratings")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "Rating", precision = 2, scale = 1)
    private Double rating;

    @Column(name= "uname_fid")
    private String username_fkid;

    @Column(name= "r_fid")
    private int rest_fkid;

    @Column(name = "User_Reviews")
    private String user_reviews;

    public Rating() {

    }

    public Rating(int id, Double rating, String username_fkid, int rest_fkid) {
        this.id = id;
        this.rating = rating;
        this.username_fkid = username_fkid;
        this.rest_fkid = rest_fkid ;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getRest_fkid() {
        return rest_fkid;
    }

    public void setRest_fkid(int rest_fkid) {
        this.rest_fkid = rest_fkid;
    }

    public String getUsername_fkid() {
        return username_fkid;
    }

    public void setUsername_fkid(String username_fkid) {
        this.username_fkid = username_fkid;
    }

    public String getUser_reviews() {
        return user_reviews;
    }

    public void setUser_reviews(String user_reviews) {
        this.user_reviews = user_reviews;
    }
}
