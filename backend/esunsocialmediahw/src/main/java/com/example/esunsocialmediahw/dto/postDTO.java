package com.example.esunsocialmediahw.dto;
//recieve data from frontend
public class postDTO {
    private Long userID;
    private String Content;
    private String Image;

    public Long getUserId() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
