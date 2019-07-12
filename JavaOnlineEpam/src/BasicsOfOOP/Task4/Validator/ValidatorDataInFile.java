package BasicsOfOOP.Task4.Validator;

import BasicsOfOOP.Task4.TreasureException;

public class ValidatorDataInFile {
    public void validate(String line) throws TreasureException {
        int count = 1;
        String[] words = line.split("\\s+");
        String metal = words[0].toLowerCase();
        String price = words[1];
        switch (metal) {
            case "gold":
            case "silver":
            case "platinum":
            case "copper":
            case "aluminum":
                break;
            default:
                throw new TreasureException("Wrong the diet in the file! Verify the data in the file ");
        }
        if (!price.matches("[+]?\\d+")) {
            throw new TreasureException("Wrong the price in the file! Verify the data in the file ");
        }
    }
}


