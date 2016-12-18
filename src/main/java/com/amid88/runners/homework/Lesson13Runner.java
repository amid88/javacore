package com.amid88.runners.homework;

import com.amid88.app.homework.lesson13.WhiteCollar;

/**
 * Created by dmitriy on 18.12.16.
 */
public class Lesson13Runner {

    public static void main(String[] args) {

        WhiteCollar whiteCollar1 = new WhiteCollar(10, "Petr", "Ciklum");

        whiteCollar1.setAge(30);
        whiteCollar1.setName("Ivan");
        whiteCollar1.setCompanyName("Kit");

        System.out.println("WhiteCollar worker #1: " + whiteCollar1.getName() +
        " " + whiteCollar1.getAge() + " " + whiteCollar1.getCompanyName());
    }
}
