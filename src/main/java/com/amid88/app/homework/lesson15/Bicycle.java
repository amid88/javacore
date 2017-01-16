package com.amid88.app.homework.lesson15;

/**
 * Created by dstrashko on 1/16/17.
 */
public abstract class Bicycle {
    public void ride() {
        System.out.println("Wroom!");
    }
    public abstract int setSpeed(int speed);
    public abstract int setGear(int gear);

}
