package com.example.androideatit.Model;

public class Category {
    private String food_name;
    private String food_detail;
    private String image;

    public Category() {
    }

    public Category(String food_name, String food_detail, String image) {
        this.food_name = food_name;
        this.food_detail = food_detail;
        this.image = image;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_detail() {
        return food_detail;
    }

    public void setFood_detail(String food_detail) {
        this.food_detail = food_detail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
