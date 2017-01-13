package com.amid88.app.classwork.lesson16;

/**
 * Created by dmitriy on 13.01.17.
 */
public enum Holidays {
    NEW_YEAR(1, "January", "New Year"),
    WOOMEN_DAY(8, "March", "Woomen Day"),
    MEN_DAY(9, "March", "Men Day");


    private int date;
    private String month;
    private String name;
    private  Holidays(int date, String month, String name){
        this.date = date;
        this.month = month;
        this.name = name;
    }
    public int getDate(){
        return date;
    }
    public String getMonth(){
        return month;
    }
    public String getName(){
        return name;
    }



}
