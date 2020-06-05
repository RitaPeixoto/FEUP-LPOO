import java.util.ArrayList;

public class StringBar extends Bar {
    private boolean happyHour;

    public StringBar(){
        this.happyHour = false;
        this.observers = new ArrayList<>();
    }

    public void startHappyHour(){
        setHappyHour(true);
        notifyObservers();
    }
    public void endHappyHour(){
         setHappyHour(false);
         notifyObservers();
    }

    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    public void setHappyHour(boolean happyHour) {
        this.happyHour = happyHour;
    }

    public void order (StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }
}
