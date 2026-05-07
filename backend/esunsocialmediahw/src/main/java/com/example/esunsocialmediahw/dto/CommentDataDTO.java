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
}
