import java.util.Comparator;

public class VegetablesComparatorCalories implements Comparator<Vegetables> {

    public int compare(Vegetables vegetable1, Vegetables vegetable2) {
        if (vegetable1.getCalories() > vegetable2.getCalories()) {
            return 1;
        } else if (vegetable1.getCalories() == vegetable2.getCalories()) {
            return 0;
        } else {
            return -1;
        }
    }
}

