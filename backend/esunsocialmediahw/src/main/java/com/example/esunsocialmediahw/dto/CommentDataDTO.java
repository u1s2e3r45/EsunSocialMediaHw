package com.example.esunsocialmediahw.dto;

import java.sql.Timestamp;

public class CommentDataDTO {
    private Long commentID;
    private Long userID;
    private String userName;
    private String content;
    private Timestamp Created_At;

    public CommentDataDTO(Long commentID, Long userID, String userName, String content, Timestamp Created_At) {
        this.commentID = commentID;
        this.userID = userID;
        this.userName = userName;
        this.content = content;
        this.Created_At = Created_At;
    }

    public String getUserName() {
        return userName;
    }

    public Timestamp getCreated_At() {
        return Created_At;
    }

    public Long getCommentID() {
        return commentID;
    }

    public String getContent() {
        return content;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public void setCreated_At(Timestamp created_At) {
        this.Created_At = created_At;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
