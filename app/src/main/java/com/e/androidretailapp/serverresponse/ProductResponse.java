package com.e.androidretailapp.serverresponse;

public class ProductResponse {

    private String Status;
    private String token;


    public ProductResponse(String status, String token) {
        Status = status;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
