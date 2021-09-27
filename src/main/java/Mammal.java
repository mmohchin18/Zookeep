
    public abstract class Mammal<String> extends Animal {

            /////////////////////////Attributes////////////////

            String colour;

            ////////////////////////Constructors///////////////////////




            //////////////////////////Methods/////////////////////////
            public void breathe(){
                System.out.println("Breathe in... breathe out");
            }

            @Override
            public void reproduce() {
                System.out.println("I do a Live Birth");
            }
        }




