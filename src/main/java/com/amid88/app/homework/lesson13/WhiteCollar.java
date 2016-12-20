package com.amid88.app.homework.lesson13;

/**
 * Created by dmitriy on 18.12.16.
 */
public class WhiteCollar extends Human{

    String companyName;

    public WhiteCollar(int age, String name, String companyName){
        super(age, name);
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ- ,";
        boolean flag = false;

        for (int i = 0; i < companyName.length(); i++) {
            flag = false;
            for (int j = 0; j < alphabet.length(); j++) {
                if (companyName.charAt(i) == alphabet.charAt(j)) flag = true;
            }
            if (!flag) {
                System.out.println("Company name is invalid");
                break;
            }
        }
        if (flag) this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
