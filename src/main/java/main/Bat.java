package main;

import java.time.LocalDate;

public class Bat {
    public String Mammal;
    //////////Attributes//////////
    private boolean windy;
    private String breed;
    private LocalDate dateOfBirth;
    private String name;

    public Bat(String name, String mammal) {

        Mammal = mammal;
    }

    public Bat(String moggy, String bat, LocalDate now) {

    }

    public Bat(double v, String sphinx, int i) {

    }

    //////////Constructors////////
    public void Weather(String Weather) {
        // this.windy = windy;
    }

    public Bat(String mammal) {

        this((String) "Moggy", mammal);
        //this.name = true;
    }


    public Bat() {
        this.breed = Mammal;
    }

    //////////Methods/////////////
    public boolean isWindy() {
        return windy;
    }

    public void setWeather(boolean windy) {
        this.windy = windy;
    }


    public String flying() {
        if (this.windy == true) {
            return "Flying because it's not windy";
        } else {
            return "It is windy so i am not flying";
        }
    }

    //@Override
    public void reproduce() {

    }
}