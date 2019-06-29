package ProgrammingWithClasses.Block2.Task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 40;
        int max = 200;
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        i+=min;

        City brest = new City("Brest", 350616, 146, false, true);
        City vitebsk = new City("Vitebsk", 378459, 134, false, true);
        City gomel = new City("Gomel", 535229, 139, false, true);
        City grodno = new City("Grodno", 373547, 142, false, true);
        City minsk = new City("Minsk", 1992685, 348, true, true);
        City mogilev = new City("Mogilev", 383313, 118, false, true);
        City orsha = new City("Orsha", 115052, 33, false, false);
        City borisov = new City("Borisov", 143051, 46, false, false);
        City polotsk = new City("Polotsk", 84597, 40, false, false);
        City rechitsa = new City("Rechitsa", 65432, 45, false, false);
        City baranovichi = new City("Baranovichi", 64552, 67, false, false);

        District district1 = new District("Baranovichskiy", new City[]{baranovichi, rechitsa});
        District district2 = new District("Brestsiy", new City[]{brest, borisov});
        District district3 = new District("Kobrinsky", new City[]{polotsk, orsha});
        District district4 = new District("Minsky", new City[]{minsk});
        District district5 = new District("Mogilevsky", new City[]{mogilev, vitebsk});
        District district6 = new District("Gomelsky", new City[]{gomel, grodno});

        Region region1 = new Region("Minskaya", new District[]{district1, district2, district3});
        Region region2 = new Region("Gomelskaya", new District[]{district4, district5, district6});

        State belorussia = new State("Belorussia", new Region[]{region1, region2});
        belorussia.printCapital();
        belorussia.printCountRegions();
        belorussia.printArea();
        System.out.println("The regionals centers of " + belorussia.getName() + ":");
        belorussia.printRegionalCenter();
    }
}
