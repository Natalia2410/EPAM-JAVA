import java.util.ArrayList;

public class Root extends Vegetables {//корнеплоды
    private int sugar;

    public Root(VegetablesType type, int weight, int calories, int vitaminC, int sugar) {
        super(type, weight, calories, vitaminC);
        this.sugar = sugar;
    }

    public void prepare() {
        System.out.println(getType() + " wash, cook, clean, cut, add to salad");
    }

    public int getSugar() {
        return sugar;
    }

    public boolean equals(Object obj) {
        Root root = null;
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        root = (Root) obj;
        if ((getType() != null && this.getType().equals(root.getType())) && this.getWeight() == root.getWeight() && this.getCalories() == root.getCalories() && this.getVitaminC() == root.getVitaminC() && this.sugar == root.getSugar()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + getWeight();
        result = prime * result + getCalories();
        result = prime * result + getVitaminC();
        result = prime * result + getSugar();
        return result;
    }
}
