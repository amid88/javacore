package com.amid88.app.homework.lesson15;

/**
 * Created by dstrashko on 1/16/17.
 */
public class CustomBicycle extends Bicycle {

    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }

    @Override
    public int setSpeed(int speed) {
        System.out.println("The speed is.. " + speed);
        return speed;
    }

    @Override
    public int setGear(int gear){
        System.out.println("The gear is.. " + gear);
        return gear;
    }

}
