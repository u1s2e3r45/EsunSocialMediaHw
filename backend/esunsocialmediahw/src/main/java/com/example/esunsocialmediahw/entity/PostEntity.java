package com.example.esunsocialmediahw.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
@Entity
@Table(name = "post")
//post table
public class PostEntity {
    @Id
    private Long postID;//PK
    private Long userID;
    private String Content;
    private String Image;
    private Timestamp Created_At;

    public Long getPostId() {
        return postID;
    }

    public void setPostId(Long postId) {
        this.postID = postId;
    }

    public Long getUserId() {
        return userID;
    }

    public void setUserId(Long userId) {
        this.userID = userId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        this.Image = image;
    }

    public Timestamp getTimestamp() {
        return Created_At;
    }

    public void setTimestamp(Timestamp created_at) {
        this.Created_At = created_at;
    }


}

