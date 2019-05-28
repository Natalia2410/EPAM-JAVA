import java.util.Comparator;

public class VegetablesComparatorVitaminC implements Comparator<Vegetables> {

    public int compare(Vegetables vegetable1, Vegetables vegetable2) {
        if (vegetable1.getVitaminC() > vegetable2.getVitaminC()) {
            return -1;
        } else if (vegetable1.getVitaminC() == vegetable2.getVitaminC()) {
            return 0;
        } else {
            return 1;
        }
    }
}

