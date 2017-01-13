package com.amid88.runners.classwork;

import com.amid88.app.classwork.lesson14.Student;
import com.amid88.app.classwork.lesson14.Teacher;
import com.amid88.app.homework.lesson13.Human;

/**
 * Created by dmitriy on 20.12.16.
 */
public class Lesson14Runner {

    public static void main(String[] args) {
        Student student1 = new Student("Petr", "KPI");
        Student student2 = new Student("Ivan", "NAU");
        Student student3 = new Student("Oleg", "KNEU");
        Student student4 = new Student("Vladimir", "PTU");

        Human teacher1 = new Teacher(90,"Mariya Ivanovna");

        student1.getResponse("What is your name?");
        System.out.println(student1);

        StringBuilder builder = new StringBuilder();
        String stringStudents;
        String[] arrayStudents = new String[4];

        /*for (int i = 0; i < arrayStudents.length; i++){
            arrayStudents[i] = student1.toString();
        }*/

        stringStudents = builder.append(student1).append(student2).append(student3).append(student4).toString();
        System.out.println(stringStudents);

        //teacher1.setMark();
    }
}
