package com.amid88.app.classwork.lesson13;

/**
 * Created by dmitriy on 15.12.16.
 */
public class Car {

    String color;
    int speed;

    private String brand;

    @Override
    public String toString(){
        return color + speed;
    }
    public Car(){
        this.color = "red";
        this.speed = 100;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
