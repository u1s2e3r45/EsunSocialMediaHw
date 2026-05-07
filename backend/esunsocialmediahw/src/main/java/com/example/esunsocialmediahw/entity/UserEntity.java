package com.example.esunsocialmediahw.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

//user table
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private Long userID;//PK
    private String userName;
    private String email;
    private String phone;
    private String password;
    private String CoverImage;
    private String Biography;
    private Timestamp Created_At;

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreated_At() {
        return Created_At;
    }

    public Long getUserID() {
        return userID;
    }

    public String getPhone() {
        return phone;
    }

    public String getBiography() {
        return Biography;
    }

    public String getCoverImage() {
        return CoverImage;
    }

    public void setCreated_At(Timestamp created_At) {
        this.Created_At = created_At;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public void setBiography(String biography) {
        this.Biography = biography;
    }

    public void setCoverImage(String coverImage) {
        this.CoverImage = coverImage;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
