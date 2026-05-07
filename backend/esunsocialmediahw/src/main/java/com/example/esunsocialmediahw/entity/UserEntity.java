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
    private String Email;
    private String phone;
    private String password;
    private String CoverImage;
    private String Biography;
    private Timestamp Created_At;

    public String getPassword() {
        return password;
    }
}
