package com.practicaljava.lesson6;

/**
 * Created by vladimir on 26.06.17.
 */
public class ForeignContractor extends Person{

    public ForeignContractor(String name){
        super(name);
    }
    public boolean increasePay(int percent){
        System.out.println("I'm just a foreign worker");
        return true;
    }
}
