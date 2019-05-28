import java.util.Objects;

public class Sheet extends Vegetables {//листовые

    public Sheet(VegetablesType type, int weight, int calories, int vitaminC) {
        super(type, weight, calories, vitaminC);
    }

    public void prepare() {
        System.out.println(getType() + " wash, cut, add to salad");
    }

    @Override
    public boolean equals(Object obj) {
        Sheet sheet = null;
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        sheet = (Sheet) obj;
        if ((getType() != null && this.getType().equals(sheet.getType())) && this.getWeight() == ((Sheet) obj).getWeight() && this.getCalories() == sheet.getCalories() && this.getVitaminC() == sheet.getVitaminC()) {
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


