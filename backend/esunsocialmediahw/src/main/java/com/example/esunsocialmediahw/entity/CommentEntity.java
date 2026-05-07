package com.example.esunsocialmediahw.entity;

import jakarta.persistence.Id;

import java.sql.Timestamp;

//comment table
public class CommentEntity {
    @Id
    private Long commentID;//PK
    private Long userID;
    private Long postID;
    private String Content;
    private Timestamp Created_At;
}
