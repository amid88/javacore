package com.amid88.runners;

import com.amid88.app.classwork.lesson13.Student;

/**
 * Created by dmitriy on 15.12.16.
 */
public class Lesson13Runner {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Ivan");
        student1.setSurname("Ivanov");
        student1.setScore(10);

        student2.setName("Petr");
        student2.setSurname("Petrov");
        student2.setScore(20);

        System.out.println(student1.getName() + " " + student1.getSurname() + " " +
                student1.getScore());
        System.out.println(student2.getName() + " " + student2.getSurname() + " " +
                student2.getScore());




    }
}
