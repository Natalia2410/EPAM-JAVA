package BasicsOfOOP.Task4;

import BasicsOfOOP.Task4.model.TreasureList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreasureList treasureList = new TreasureList();
        treasureList.setTreasures(treasureList.createTreasureList());
        System.out.println("ALL treasures in the dragon cave:");
        treasureList.printAll();
        System.out.println("");
        System.out.println(treasureList.maxPrice());
        System.out.println("Enter the amount for which you want to get the treasure:");
        String s = reader.readLine();
        int sum = Integer.parseInt(s);
        System.out.println("Treasures in a given range:");
        treasureList.printTreasureLessInputSum(treasureList.getListTreasure(sum));
    }
}
