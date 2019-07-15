package BasicsOfOOP.Task5.model;

import BasicsOfOOP.Task5.*;
import BasicsOfOOP.Task5.Enum.Color;
import BasicsOfOOP.Task5.Enum.FlowerType;
import BasicsOfOOP.Task5.Enum.PackageType;
import BasicsOfOOP.Task5.Exception.FlowerException;
import BasicsOfOOP.Task5.Factory.FlowerFactory;
import BasicsOfOOP.Task5.Factory.PackageFactory;
import BasicsOfOOP.Task5.Validator.ValidatorDataInFile;
import BasicsOfOOP.Task5.modelPackage.Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bouquet {
    private Package pacKage;
    private ArrayList<Flower> flowers;

    public Package getPacKage() {
        return pacKage;
    }

    public void setPacKage(Package pacKage) {
        this.pacKage = pacKage;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public ArrayList<Flower> createBouquet() throws IOException {
        FlowerFactory flowerFactory = new FlowerFactory();
        ArrayList<Flower> flowers = new ArrayList<>();
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("LogFileFlowers");
        logger.addHandler(fh);
        BufferedReader reader = new BufferedReader(new FileReader("flowers"));
        String line;
        String[] words;
        Flower flower = null;
        int count = 1;
        while ((line = reader.readLine()) != null) {
            ValidatorDataInFile validator = new ValidatorDataInFile();
            try {
                validator.validate(line);
                words = line.split("\\s+");
                flower = flowerFactory.createFlower(flowerFactory.getFlowerType(words[0].toLowerCase()), flowerFactory.getColor(words[1]), Integer.parseInt(words[2]), Integer.parseInt(words[3]));
                flowers.add(flower);
            } catch (FlowerException e) {
                System.out.println(e.getMessage() + "in string " + count);
                logger.log(Level.WARNING, e.getMessage());
            }
            count++;
        }
        return flowers;
    }

    public void printAll() {
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i));
        }
    }

    public Flower getFlowerForClient(FlowerType type, Color color, int count) throws Exception {
        Flower flower = null;
        FlowerFactory flowerFactory = new FlowerFactory();
        for (int i = 0; i < flowers.size(); i++) {
            if (!type.equals(null)) {
                if (!color.equals(null)) {
                    if (count != 0) {
                        if (flowers.get(i).getType().equals(type) && flowers.get(i).getColor().equals(color)) {
                            if (flowers.get(i).getCount() >= count) {
                                flower = flowerFactory.createFlower(flowers.get(i).getType(), flowers.get(i).getColor(), count, flowers.get(i).getPrice());
                                flowers.get(i).setCount(flowers.get(i).getCount() - count);
                                break;
                            } else {
                                System.out.println("There are " + flowers.get(i).getCount() + " flowers of this type in the store");
                            }
                        }
                    }
                }
            }
        }
        return flower;
    }

    public Package getPackageForFlowers(PackageType pacKage) {
        PackageFactory packageFactory = new PackageFactory();
        Package packageForFlowers = packageFactory.createPackage(pacKage, packageFactory.getPriceOfPackage(pacKage));
        return packageForFlowers;
    }

    public static void printForClient(ArrayList<Flower> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public int cost() {
        int cost = 0;
        for (int i = 0; i < flowers.size(); i++) {
            cost += flowers.get(i).costFlower();
        }
        return cost + pacKage.getPrice();
    }
}
