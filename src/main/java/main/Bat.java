package main;

import java.time.LocalDate;


public class Bat {


    //////////Attributes//////////


    //////////Constructors////////



    //////////Methods/////////////

    public String flying(boolean windy) {
        if (windy == true) {
            return "Flying because it's not windy";
        } else {
            return "It is windy so i am not flying";
        }
    }

    //@Override
    public void reproduce() {

    }
}