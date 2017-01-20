package com.amid88.app.classwork.lesson16;

/**
 * Created by dmitriy on 13.01.17.
 */
public class BpxPrinter<T> {
    private T val;
    //public BoxPrinter(T arg) {val = arg;}
    public String toString() {
        return "{" + val + "}";
    }
    public  T getValue() {return val;}

}
