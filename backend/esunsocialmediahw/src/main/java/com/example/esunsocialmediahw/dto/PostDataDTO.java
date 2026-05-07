package com.example.esunsocialmediahw.dto;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PostDataDTO {
    private Long postID;
    private Long userID;
    private String userName;
    private String content;
    private Timestamp Created_At;
    private String Image;

    private List<CommentDataDTO> comment = new ArrayList<>();

    public PostDataDTO(Long postID, Long userID, String userName,  String content, Timestamp Created_At, String Image) {
        this.postID = postID;
        this.userID = userID;
        this.userName = userName;
        this.content = content;
        this.Created_At=Created_At;
        this.Image = Image;
    }

    public Long getPostID() {
        return postID;
    }

    public Long getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getCreated_At() {
        return Created_At;
    }

    public String getImage() {
        return Image;
    }

    public List<CommentDataDTO> getComments() {
        return comment;
    }
}
