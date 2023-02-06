package Inheritance;

public class TestAnimals {
    public static void main(String[] args) {

        Dogs germanShepard = new Dogs();
        germanShepard.setCuddle("Cuddling");
        germanShepard.setWalk("Running");
        germanShepard.setBarking("Let me do it for you...");
        germanShepard.setEat("Let me do it for you ... Kermie...");

//        System.out.println(germanShepard.toString());

        Dogs smallDog = new Dogs();

        smallDog.setBarking("Too small to bark!");

//        System.out.println(smallDog.toString());

        Cats littleKitty = new Cats();
        littleKitty.setMeowing("Meeeoooow");

//        System.out.println(littleKitty.toString());

        displayAnimals(germanShepard);
        displayAnimals(smallDog);
        displayAnimals(littleKitty);

        Dogs inkita = new Dogs();
        inkita.setBarking("Funny Barking");
        inkita.setCuddle("Never Cuddles");
        inkita.setWalk("Walks everywhere");
        inkita.setEat("Eats everything");

        displayAnimals(inkita);
    }

    private static void displayAnimals(Animals animalObj){
        System.out.println(animalObj.toString());
    }
}
