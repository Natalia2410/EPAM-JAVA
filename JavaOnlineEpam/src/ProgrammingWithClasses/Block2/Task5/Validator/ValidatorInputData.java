package ProgrammingWithClasses.Block2.Task5.Validator;

import ProgrammingWithClasses.Block2.Task5.VoucherType;

import java.io.IOException;

public class ValidatorInputData {
    public VoucherType getVoucherTypeForClient(String type){
        VoucherType voucherType = null;
        switch (type.toLowerCase()) {
            case "health":
                voucherType = VoucherType.health;
                break;
            case "cruise":
                voucherType = VoucherType.cruise;
                break;
            case "excursion":
                voucherType = VoucherType.excursion;
                break;
            case "relax":
                voucherType = VoucherType.relax;
                break;
            case "shopping":
                voucherType = VoucherType.shopping;
                break;
        }
        return voucherType;
    }

    public String getTransportForClient(String transport) {
        String transportForClient = "";
        switch (transport.toLowerCase()) {
            case "air":
            case "bus":
                transportForClient = transport;
                break;
        }
        return transportForClient;
    }

    public String getDietForClient(String diet) {
        String dietForClient = "";
        switch (diet.toLowerCase()) {
            case "ro":
            case "bb":
            case "hb":
            case "hb+":
            case "fb":
            case "fb+":
            case "al":
                dietForClient = diet;
                break;
        }
        return dietForClient;
    }

    public int getDaysQuantityForClient(String daysQuantity) {
        int daysQuantityForClient = 0;
        if (daysQuantity.matches("\\d+")) {
            daysQuantityForClient = Integer.parseInt(daysQuantity);
        }
        return daysQuantityForClient;
    }
}
