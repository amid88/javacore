package com.amid88.app.classwork.lesson12;

import java.io.*;

/**
 * Created by dmitriy on 13.12.16.
 */
public class Exception {

    public static void fileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/dmitriy/Kit/javacore/input.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }

    public static void fileReader2(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/dmitriy/Kit/javacore/input.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }

    public static void polindromToFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/dmitriy/Kit/javacore/inputPolindrom.txt"));

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("/home/dmitriy/Kit/javacore/outputPolindrom.txt")));

        String line;

        while ((line = reader.readLine()) != null){

            StringBuilder builder = new StringBuilder(line);

            if (builder.toString().equals(builder.reverse().toString())) {
                writer.append(line);
                writer.close();
            }
        }

    }






}
