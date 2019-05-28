import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    String name;
    ArrayList<Vegetables> ingridients;

    public Salad(String name, ArrayList<Vegetables> ingridients) {
        this.name = name;
        this.ingridients = ingridients;
    }

    public int getValueAll() {
        int countCalories = 0;
        for (Vegetables vegetable : ingridients) {
            countCalories = countCalories + vegetable.getValue();
        }
        return countCalories;
    }

    public void getListIngridients() {
        for (Vegetables vegetable : ingridients) {
            System.out.print(vegetable.getType() + " ");
        }
    }

    public ArrayList<Vegetables> getListIngridientsInRange(int minCalories, int maxCalories) {
        ArrayList<Vegetables> vegetablesInRange = new ArrayList<>();
        for (Vegetables vegetable : ingridients) {
            if (vegetable.getCalories() > minCalories && vegetable.getCalories() < maxCalories) {
                vegetablesInRange.add(vegetable);
            }
        }
        return vegetablesInRange;
    }

    public void sort() {
        Collections.sort(ingridients, new VegetablesComparatorCalories().thenComparing(new VegetablesComparatorVitaminC()));
    }
}
