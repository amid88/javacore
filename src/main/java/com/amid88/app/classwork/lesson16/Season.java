package com.amid88.app.classwork.lesson16;

/**
 * Created by dmitriy on 13.01.17.
 */
public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    public static void main(String[] args) {
        Season season = Season.SPRING;
        if (season == Season.SPRING)
            season = Season.SUMMER;
        System.out.println(season);
    }
}

