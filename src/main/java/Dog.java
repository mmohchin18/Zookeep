public class Dog extends Mammal{


        //////////// Attributes ////////////

        private String name;
        private String breed;
        private int legs;

        //////////// Constructors ////////////

        public Dog (String name, String breed, int legs){
            this.name = name;
            this.breed = breed;
            this.legs= legs;
        }

        //////////// Methods /////////////////

        public String woof(){
            return "woof";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public int getLegs() {
            return legs;
        }

    @Override
    public void breathe() {

    }

    @Override
    public void reproduce() {

    }
}

