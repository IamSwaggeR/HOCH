package com.example.hoch.Adapter.Constructor;

public class KhmerFoodDessertConstructor {
    private String title;
    private int image,price;

    public KhmerFoodDessertConstructor(String title, int image, int price) {
        this.title = title;
        this.image = image;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
