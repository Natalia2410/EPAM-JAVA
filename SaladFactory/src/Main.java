import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static VegetablesFactory vegetablesFactory = new VegetablesFactory();
    static ArrayList<Vegetables> ingridients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("LogFile");
        logger.addHandler(fh);
        BufferedReader reader = new BufferedReader(new FileReader("ingridients"));
        String line;
        String[] words;
        Vegetables vegetable = null;
        while ((line = reader.readLine()) != null) {
            words = line.split("\\s");
            try {
                vegetable = vegetablesFactory.getVegetables(vegetablesFactory.getVegetablesType(words[0].toLowerCase()));
                vegetable.prepare();
                ingridients.add(vegetable);
            } catch (SaladException e) {
                logger.log(Level.WARNING, e.getMessage());
            }
        }
        System.out.println("");
        Salad salad = new Salad("Olivier", ingridients);
        System.out.println("salad consists of: ");
        salad.getListIngridients();
        System.out.println("\n");
        System.out.println("calories " + salad.getValueAll());
        System.out.println("");
        ArrayList<Vegetables> ingridientsInRange = salad.getListIngridientsInRange(10, 35);
        System.out.println("vegetables in the range of given calories: ");
        for (Vegetables veg : ingridientsInRange) {
            System.out.print(veg.getType() + " ");
        }
        System.out.println("");
        System.out.println("before sort:");
        for (Vegetables veg : ingridients) {
            System.out.println(veg.getType() + " " + veg.getCalories() + " " + veg.getVitaminC());
        }
        System.out.println("");
        System.out.println("after sort:");//сначала выводятся ингридиенты с меньшим количеством калорий и большим содержанием витамина С
        salad.sort();
        for (Vegetables veg : ingridients) {
            System.out.println(veg.getType() + " " + veg.getCalories() + " " + veg.getVitaminC());
        }
    }
}
