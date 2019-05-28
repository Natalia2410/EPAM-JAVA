public class Sheet extends Vegetables {//листовые

    public Sheet(VegetablesType type, int weight, int calories, int vitaminC) {
        super(type, weight, calories, vitaminC);
    }

    public void prepare() {
        System.out.println(getType() + " wash, cut, add to salad");
    }

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


