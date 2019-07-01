package ProgrammingWithClasses.Block2.Task5.Validator;

import ProgrammingWithClasses.Block2.Task5.VoucherException;

import java.io.IOException;
;

public class ValidatorDataInFile {

    public void validate(String line) throws VoucherException {
        int count = 1;
        String[] words = line.split("\\s+");
        if (words.length != 5) {
            throw new VoucherException("Wrong the data in the file! Verify the data in the file ");
        } else {
            String country = words[0].toLowerCase();
            String diet = words[1].toLowerCase();
            String transport = words[2].toLowerCase();
            String daysQuantity = words[3];
            String price = words[4];
            switch (diet) {
                case "ro":
                case "bb":
                case "hb":
                case "hb+":
                case "fb":
                case "fb+":
                case "al":
                    break;
                default:
                    throw new VoucherException("Wrong the diet in the file! Verify the data in the file ");
            }
            switch (transport) {
                case "bus":
                case "air":
                    break;
                default:
                    throw new VoucherException("Wrong the transport in the file! Verify the data in the file ");
            }
            switch (country) {
                case "israel":
                case "germany":
                case "thailand":
                case "china":
                case "india":
                case "switzerland":
                case "belorussia":
                case "sweden":
                case "finland":
                case "norway":
                case "estonia":
                case "denmark":
                case "spain":
                case "england":
                case "usa":
                case "ukraine":
                case "russia":
                case "egypt":
                case "turkey":
                case "tunisia":
                case "italy":
                case "france":
                    break;
                default:
                    throw new VoucherException("Wrong the country in the file! Verify the data in the file ");
            }
            if (!daysQuantity.matches("[+]?\\d+")) {
                throw new VoucherException("Wrong the days quantity in the file! Verify the data in the file ");
            }
            if (!price.matches("[+]?\\d+")) {
                throw new VoucherException("Wrong the price in the file! Verify the data in the file ");
            }
        }
    }
}

