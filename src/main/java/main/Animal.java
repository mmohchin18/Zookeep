package main;

import java.time.LocalDate;

public abstract class Animal {
    private java.lang.Object System;

    ////////////////Attributes///////////////////////////////////

    private String breed;
    private LocalDate dateOfBirth;
    private String name;



    //////////////////Constructors//////////////////////////////



    //////////////////Methods/////////////////////////////////
    public abstract void breathe();


    public void sleep(){

    }

//    public void die(){
//
//        System.out.println("I am dead");
//    }

    public abstract void reproduce();

    // public abstract java.lang.Object getClass();
}
