package Interfaces;

public class TestJuicy {
    public static void main(String[] args) {

        Object[] objectsFruits = {new Apples(), new Bananas(), new Oranges(), new Lemons(), new GrapeFruits()};

        for(int i=0; i<objectsFruits.length;i++){
            if(objectsFruits[i] instanceof Juicy){
                System.out.println(((Juicy)objectsFruits[i]).makeFresh());
            }
        }
    }
}
