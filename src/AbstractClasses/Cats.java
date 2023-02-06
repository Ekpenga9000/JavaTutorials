package AbstractClasses;

public class Cats extends Animals{

    private String meowing;

    public Cats(){
        super();
    }

    public Cats(String meowing){
        this.meowing = meowing;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "meowing='" + meowing + '\'' +
                "} " + super.toString();
    }

    public Cats(String meowing, String walk, String eat, String cuddle){
        super(eat,walk,cuddle);
        setCuddle(cuddle);
        setEat(eat);
        setWalk(walk);
    }

    public String getMeowing() {
        return meowing;
    }


    @Override
    public String animalDescription() {
        return "Finds boxes to fit in!";
    }

    public void setMeowing(String meowing) {
        this.meowing = meowing;
    }


}
