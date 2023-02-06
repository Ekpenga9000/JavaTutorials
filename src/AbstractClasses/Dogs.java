package AbstractClasses;

public class Dogs extends Animals{

    private String barking;

    public Dogs(){
        super();
    }
    public Dogs(String barking) {
        this.barking = barking;
    }

    public Dogs(String walk, String eat, String cuddle, String barking) {
        super(walk, eat, cuddle);
        this.barking = barking;
        setEat(eat);
        setWalk(walk);
        setCuddle(cuddle);
    }

    public String getBarking() {
        return barking;
    }

    public void setBarking(String barking) {
        this.barking = barking;
    }

    @Override
    public String animalDescription() {
        return "Usually guards the house!";
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "barking='" + barking + '\'' +
                "} " + super.toString();
    }
}
