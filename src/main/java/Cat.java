import java.time.LocalDate;


public class Cat<String, LocalDate> extends Mammal {

    private static final java.lang.Object LocalDate = null;
    //////////////////Attributes///////////////////////////
    private String breed;
    private LocalDate dateOfBirth;
    private String name;

    /////////////////Constructors//////////////////////////
    public Cat() {
        this((String) "Moggy");
    }

    public Cat(String name) {
        // this(name, LocalDate.now());
    }

    public <LocalDate> Cat(String name, LocalDate dOB) {
       // this(name, LocalDate.now(), "DSH");
    }

    public Cat(String name, LocalDate dOB, String breed) {
        this.name = name;
        this.dateOfBirth = dOB;
        this.breed = breed;
    }

    @Override
    public void breathe() {
        
    }

    @Override
    public void reproduce() {

    }


    private Object System;
}