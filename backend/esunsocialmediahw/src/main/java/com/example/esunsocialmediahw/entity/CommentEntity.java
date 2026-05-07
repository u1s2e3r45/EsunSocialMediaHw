package com.example.esunsocialmediahw.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
@Entity
@Table(name = "comment")
//comment table
public class CommentEntity {
    @Id
    private Long commentID;//PK
    private Long userID;
    private Long postID;
    private String content;
    private Timestamp Created_At;

    public Long getUserID() {
        return userID;
    }

    public Long getCommentID() {
        return commentID;
    }

    public Long getPostID() {
        return postID;
    }

    public Timestamp getCreated_At() {
        return Created_At;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public void setCreated_At(Timestamp created_At) {
        Created_At = created_At;
    }
}
