import java.util.ArrayList;
import java.util.Optional;

public abstract class Vegetables {

    private VegetablesType type;
    private int calories;
    private int weight;
    private int vitaminC;

    public Vegetables(VegetablesType type, int weight, int calories, int vitaminC) {
        this.type = type;
        this.weight = weight;
        this.calories = calories;
        this.vitaminC = vitaminC;
    }

    public int getVitaminC() {

        return vitaminC;
    }

    public VegetablesType getType() {

        return type;
    }

    public abstract void prepare();

    public int getValue() {

        return weight * calories/100;
    }

    public int getCalories() {

        return calories;
    }

    public int getWeight() {

        return weight;
    }
}
