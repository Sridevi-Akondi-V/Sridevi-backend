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

    @Column(name= "u_fid")
    private int user_fkid;

    @Column(name= "r_fid")
    private int rest_fkid;

    public Rating() {

    }

    public Rating(int id, Double rating, int user_fkid, int rest_fkid) {
        this.id = id;
        this.rating = rating;
        this.user_fkid = user_fkid;
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

    public int getUser_fkid() {
        return user_fkid;
    }

    public void setUser_fkid(int user_fkid) {
        this.user_fkid = user_fkid;
    }

    public int getRest_fkid() {
        return rest_fkid;
    }

    public void setRest_fkid(int rest_fkid) {
        this.rest_fkid = rest_fkid;
    }
}
