package com.amid88.runners.classwork;

import java.io.IOException;

/**
 * Created by dmitriy on 13.12.16.
 */
public class Lesson12Runner {

    public static void main(String[] args) throws IOException {

        //com.amid88.app.classwork.lesson12.Exception.fileReader();
        /*BufferedReader reader = new BufferedReader(new FileReader("/home/dmitriy/Kit/javacore/input.txt"));
        String line;
        String stringToCompare = "Hello world!";

        for (int i = 0; i < 2 ; i++) {
            line = reader.readLine();
            if (line.equals(stringToCompare)) System.out.println("OK");
        }
        reader.close();*/

        /*String firstLine = "The first line";
        String secondLine = "The second line";

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("/home/dmitriy/Kit/javacore/output.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();


        com.amid88.app.classwork.lesson12.Exception.fileReader2();*/

        com.amid88.app.classwork.lesson12.Exception.polindromToFile();


    }
}
