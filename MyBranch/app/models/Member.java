package models;

import javax.validation.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import play.db.jpa.*;
import play.data.validation.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.io.File;
import java.sql.Time;

/* Edited by Sridevi Akondi */

@Entity
@Table(name = "tb_member")

@SuppressWarnings("FieldCanBeLocal")
public class Member {


    public enum Role {
        ADMIN, USER
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Column(name = "Username",unique = true)
    private String uname;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String pwd;

    @Column(name = "Role")
    private Role role;


    @Column(name="Auth_Token")
    private String authToken;

    @Column(name="Expiration_Time")
    @JsonIgnore
    private Timestamp expTime;

    @Column(name = "DOB")
    private Date dob;

    @Column(name = "User_Address")
    private String User_Address;

    public Member() {

    }


    public Member(int uid, String uname, String email, String pwd, Role role, Date dob, String User_Adress) {
        this.uid=uid;
        this.uname = uname;
        this.email = email;
        this.pwd = pwd;
        this.role = role;
        this.dob = dob;
        this.User_Address =User_Adress;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() { return uname; }
    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        this.email = email;
    }


    public String getPwd() { return pwd; }
    public void setPwd(String pwd) {
        this.pwd= pwd;
    }

    public Role getRole() { return role; }
    public void setRole(Role role) {
        this.role = role; }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() { return authToken; }

    public Timestamp getExpTime() { return expTime; }

    public void setExpTime(Timestamp expTime) { this.expTime = expTime; }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getUser_Address() {
        return User_Address;
    }

    public void setUser_Address(String user_Address) {
        User_Address = user_Address;
    }

}