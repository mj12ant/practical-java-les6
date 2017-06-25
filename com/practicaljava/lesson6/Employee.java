package com.practicaljava.lesson6;
/**
 * Created by vladimir on 25.06.17.
 */
public class Employee extends Person implements Payable {
    public Employee(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. " + getName());
        return false;
    }
}
