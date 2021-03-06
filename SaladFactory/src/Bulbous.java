import java.util.Objects;

public class Bulbous extends Vegetables {//луковичные

    public Bulbous(VegetablesType type, int weight, int calories, int vitaminC) {
        super(type, weight, calories, vitaminC);
    }

    public void prepare() {
        System.out.println(getType() + " peel, cut, add to salad");
    }

    @Override

    public boolean equals(Object obj) {
        Bulbous bulbous = null;
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        bulbous = (Bulbous) obj;
        if ((getType() != null && this.getType().equals(bulbous.getType())) && this.getWeight() == bulbous.getWeight() && this.getCalories() == bulbous.getCalories() && this.getVitaminC() == bulbous.getVitaminC()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getWeight(), getCalories(), getVitaminC());
    }
}
