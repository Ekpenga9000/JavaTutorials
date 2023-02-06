package Objects.RickAndMorty;

public class Rick {
    /*
    * A class has attributes
    * A default constructor where the default values for the variables would be defined.
    * Constructor
    * Methods
    * */
    public boolean isDrinking;
    public boolean isNaggingJerry;
    public boolean isOnAdventure;

    public Rick(){
        isDrinking = true;
        isNaggingJerry = true;
        isOnAdventure = false;
    }

    public Rick(Boolean isDrinking, Boolean isNaggingJerry, Boolean isOnAdventure){
        this.isDrinking = isDrinking;
        this.isNaggingJerry = isNaggingJerry;
        this.isOnAdventure = isOnAdventure;
    }

    public boolean isDrinking() {
        return isDrinking;
    }

    public void setDrinking(boolean drinking) {
        isDrinking = drinking;
    }

    public boolean isNaggingJerry() {
        return isNaggingJerry;
    }

    public void setNaggingJerry(boolean naggingJerry) {
        isNaggingJerry = naggingJerry;
    }

    public boolean isOnAdventure() {
        return isOnAdventure;
    }

    public void setOnAdventure(boolean onAdventure) {
        isOnAdventure = onAdventure;
    }

    @Override
    public String toString() {
        return "Rick{" +
                "isDrinking=" + isDrinking +
                ", isNaggingJerry=" + isNaggingJerry +
                ", isOnAdventure=" + isOnAdventure +
                '}';
    }
}
