package com.amid88.app.classwork.lesson14;

/**
 * Created by dmitriy on 20.12.16.
 */
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    final public int setMark(){
        return 10;
    }
}
