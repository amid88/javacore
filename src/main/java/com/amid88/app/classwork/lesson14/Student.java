package com.amid88.app.classwork.lesson14;

/**
 * Created by dmitriy on 20.12.16.
 */
public class Student extends Person {

    @Override
    public String toString() {
        return   getName() + university + response;
    }


    private String university;
    private String response = "What is your name?";

    public Student(String name, String university){
        super(name);
        this.university = university;
    }

    public String getResponse(String question){
        return response;
    }





}
