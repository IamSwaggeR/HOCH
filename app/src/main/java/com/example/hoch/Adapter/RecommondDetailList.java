package com.example.hoch.Adapter;

public class RecommondDetailList {

    private String titile,size;
    private int image,qty;

    public RecommondDetailList(String titile, String size, int image, int qty) {
        this.titile = titile;
        this.size = size;
        this.image = image;
        this.qty = qty;
    }


    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


}
