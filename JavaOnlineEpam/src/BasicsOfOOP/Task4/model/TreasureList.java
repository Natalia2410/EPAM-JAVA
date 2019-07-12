package BasicsOfOOP.Task4.model;

import BasicsOfOOP.Task4.Main;
import BasicsOfOOP.Task4.TreasureException;
import BasicsOfOOP.Task4.TreasureFactory;
import BasicsOfOOP.Task4.Validator.ValidatorDataInFile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TreasureList {
    private ArrayList<Treasure> treasures;

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public ArrayList<Treasure> createTreasureList() throws IOException {
        TreasureFactory treasureFactory = new TreasureFactory();
        ArrayList<Treasure> treasures = new ArrayList<>();
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("LogFileTreasure");
        logger.addHandler(fh);
        BufferedReader reader = new BufferedReader(new FileReader("treasures"));
        String line;
        String[] words;
        Treasure treasure = null;
        int count = 1;
        while ((line = reader.readLine()) != null) {
            ValidatorDataInFile validator = new ValidatorDataInFile();
            try {
                validator.validate(line);
                words = line.split("\\s+");
                treasure = treasureFactory.createTreasure(treasureFactory.getTypeTreasure(words[0].toLowerCase()), words[0], Integer.parseInt(words[1]), treasureFactory.getPriceGram(words[0]));
                treasures.add(treasure);
            } catch (TreasureException e) {
                System.out.println(e.getMessage() + "in string " + count);
                logger.log(Level.WARNING, e.getMessage());
            }
            count++;
        }
        return treasures;
    }

    public void printAll() {
        for (int i = 0; i < treasures.size(); i++) {
            System.out.println(treasures.get(i));
        }
    }

    public String maxPrice() {
        int maxValue = 0;
        Treasure maxTreasure = null;
        for (int i = 0; i < treasures.size(); i++) {
            if (treasures.get(i).getValue() > maxValue) {
                maxValue = treasures.get(i).getValue();
                maxTreasure = treasures.get(i);
            }
        }
        return "The most precious treasure in the dragon cave: " + maxTreasure + " it's price is: " + maxValue;
    }

    public ArrayList<Treasure> getListTreasure(int sum) {
        ArrayList<Treasure> list = new ArrayList<>();
        for (int i = 0; i < treasures.size(); i++) {
            if(treasures.get(i).getValue()< sum){
                list.add(treasures.get(i));
            }
        }
        return list;
    }

    public void printTreasureLessInputSum(ArrayList<Treasure> list){
        for(Treasure item: list){
            System.out.println(item);
        }
    }
}
