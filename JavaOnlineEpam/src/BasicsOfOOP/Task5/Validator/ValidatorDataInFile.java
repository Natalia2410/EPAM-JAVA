package BasicsOfOOP.Task5.Validator;

import BasicsOfOOP.Task5.Exception.FlowerException;

public class ValidatorDataInFile {
    public void validate(String line) throws FlowerException {
        int count = 1;
        String[] words = line.split("\\s+");
        String type = words[0].toLowerCase();
        String color = words[1].toLowerCase();
        String countFlowers = words[2];
        String price = words[3];
        switch (type) {
            case "rouse":
            case "voilet":
            case "tulip":
                break;
            default:
                throw new FlowerException("Wrong the diet in the file! Verify the data in the file ");
        }
        switch (color) {
            case "red":
            case "yellow":
            case "green":
                break;
            default:
                throw new FlowerException("Wrong the transport in the file! Verify the data in the file ");
        }
        if (!countFlowers.matches("[+]?\\d+")) {
            throw new FlowerException("Wrong the days quantity in the file! Verify the data in the file ");
        }
        if (!price.matches("[+]?\\d+")) {
            throw new FlowerException("Wrong the price in the file! Verify the data in the file ");
        }
    }
}
