import java.util.Objects;

public class Tuber extends Vegetables {// клубнеплоды
    private int starch;//крахмал

    public Tuber(VegetablesType type, int weight, int calories, int vitaminC, int starch) {
        super(type, weight, calories, vitaminC);
        this.starch = starch;
    }

    public void prepare() {

        System.out.println(getType() + " wash, cook, clean, cut, add to salad");
    }

    public int getStarch() {

        return starch;
    }

    public boolean equals(Object obj) {
        Tuber tuber = null;
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        tuber = (Tuber) obj;
        if ((getType() != null && this.getType().equals(tuber.getType())) && this.getWeight() == tuber.getWeight() && this.getCalories() == tuber.getCalories() && this.getVitaminC() == tuber.getVitaminC() && this.starch == tuber.getStarch()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getWeight(), getCalories(), getVitaminC(), getStarch());
    }
}
