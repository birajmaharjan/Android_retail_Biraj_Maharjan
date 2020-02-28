package com.e.androidretailapp.model;

public class ProductCategory {

    private String productName;
    private int productPhoto, views;
    private String sId;

    public ProductCategory(String productName, int productPhoto, int views, String sId) {
        this.productName = productName;
        this.productPhoto = productPhoto;
        this.views = views;
        this.sId = sId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public int getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(int productPhoto) {
        this.productPhoto = productPhoto;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
