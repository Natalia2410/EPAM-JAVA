package BasicsOfOOP.Task5;

import BasicsOfOOP.Task5.Validator.ValidatorInputData;
import BasicsOfOOP.Task5.model.Bouquet;
import BasicsOfOOP.Task5.model.Flower;
import BasicsOfOOP.Task5.modelPackage.Package;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ValidatorInputData validatorInputData = new ValidatorInputData();
        Bouquet bouquet = new Bouquet();
        bouquet.setFlowers(bouquet.createBouquet());
        System.out.println("Welcome to our flowers company!");
        System.out.println("You can search bouquet with your preferences:");
        System.out.println("All flowers in company:");
        bouquet.printAll();
        ArrayList<Flower> bouquetForClients = new ArrayList<>();
        Package pacKage = null;
        boolean bool = false;
        try {
            while (true) {
                System.out.println("\nEntered type of flowers (rouse, tulip, voilet):");
                String s = reader.readLine();
                System.out.println("Enter color(red, green, yellow):");
                String s1 = reader.readLine();
                System.out.println("Enter count flowers:");
                String s2 = reader.readLine();
                String s3 = "";
                if (!bool) {
                    System.out.println("choose packaging for flowers:(box, film, paper)");
                    s3 = reader.readLine();
                    pacKage = bouquet.getPackageForFlowers(validatorInputData.getPackage(s3));
                    bool = true;
                }
                Flower flower = bouquet.getFlowerForClient(validatorInputData.getFlowerTypeForClient(s), validatorInputData.getColortForClient(s1), validatorInputData.getCountFlowersForClient(s2));
                if (flower != null) {
                    bouquetForClients.add(flower);
                }
                System.out.println("Do you want to add more flowers to the bouquet?(1 - Yes, 2 - No)");
                String s4 = reader.readLine();
                if (s4.equals("2")) {
                    break;
                } else {
                    System.out.println("Flowers in the presence of:");
                    bouquet.printAll();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error! Enter the correct data");
        } finally {
            if (bouquetForClients.size() >= 1) {
                System.out.println("The bouquet consists of:");
                Bouquet.printForClient(bouquetForClients);
                System.out.println("Package is " + pacKage);
                System.out.println("The cost of the bouquet:");
                bouquet.setFlowers(bouquetForClients);
                if (pacKage != null) {
                    bouquet.setPacKage(pacKage);
                }
                System.out.println(bouquet.cost());
            }
        }
    }
}
