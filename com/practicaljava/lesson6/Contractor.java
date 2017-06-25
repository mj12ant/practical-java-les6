package com.practicaljava.lesson6;

/**
 * Created by vladimir on 25.06.17.
 */
public class Contractor extends Person implements Payable {
    public Contractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent <= INCREASE_CAP) {
            System.out.println("Increasing salary by " + percent + "%. " + getName());
        } else {
            System.out.println("Sorry, can't increase hourly rate by more than 20%. " + getName());
        }
        return false;
    }
}
