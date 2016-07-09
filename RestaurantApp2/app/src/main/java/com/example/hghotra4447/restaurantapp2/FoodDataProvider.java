package com.example.hghotra4447.restaurantapp2;

/**
 * Created by Hghotra4447 on 6/14/2016.
 */
public class FoodDataProvider {
    private int food_poster_resource;
    private String food_title;
    private String food_price;

    public int getFood_poster_resource() {
        return food_poster_resource;
    }

    public void setFood_poster_resource(int food_poster_resource) {
        this.food_poster_resource = food_poster_resource;
    }

    public String getFood_title() {
        return food_title;
    }

    public void setFood_title(String food_title) {
        this.food_title = food_title;
    }

    public String getFood_price() {
        return food_price;
    }
    public FoodDataProvider(int food_poster_resource,String food_title,String food_price){
        this.setFood_poster_resource(food_poster_resource);
        this.setFood_title(food_title);
        this.setFood_price(food_price);
    }

    public void setFood_price(String food_price) {
        this.food_price = food_price;
    }
}
