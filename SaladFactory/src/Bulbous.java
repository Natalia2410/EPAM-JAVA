public class Bulbous extends Vegetables {//луковичные

    public Bulbous(VegetablesType type, int weight, int calories, int vitaminC) {
        super(type, weight, calories, vitaminC);
    }

    public void prepare() {
        System.out.println(getType() + " peel, cut, add to salad");
    }

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

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + getWeight();
        result = prime * result + getCalories();
        result = prime * result + getVitaminC();
        return result;
    }
}
