package com.example.esunsocialmediahw.dto;

public class registerResponseDTO {
    private String status;
    private Long userID;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }
}
