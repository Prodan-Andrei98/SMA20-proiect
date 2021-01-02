package com.example.foodapp.model;

public class AmericanFood {
    String name;
    String price;
    Integer imageURL;
    String rating;
    String restaurantname;

    public AmericanFood(String name, String price, Integer imageURL, String rating, String restaurantname) {
        this.name = name;
        this.price = price;
        this.imageURL = imageURL;
        this.rating = rating;
        this.restaurantname = restaurantname;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageURL() {
        return imageURL;
    }

    public void setImageURL(Integer imageURL) {
        this.imageURL = imageURL;
    }
}
