package ProgrammingWithClasses.Block2.Task5;

import ProgrammingWithClasses.Block2.Task5.model.*;

public class VoucherFactory {
    public static Voucher createVoucher(VoucherType type, String country, String transport, String diet, int daysQuantity, int price) {
        Voucher voucher = null;
        switch (type) {
            case cruise:
                voucher = new CruiseVoucher(type, country, transport, diet, daysQuantity, price);
                break;
            case health:
                voucher = new HealthVoucher(type, country, transport, diet, daysQuantity, price);
                break;
            case shopping:
                voucher = new ShoppingVoucher(type, country, transport, diet, daysQuantity, price);
                break;
            case excursion:
                voucher = new ExcursionVoucher(type, country, transport, diet, daysQuantity, price);
                break;
            case relax:
                voucher = new RelaxVoucher(type, country, transport, diet, daysQuantity, price);
                break;
        }
        return voucher;
    }

    public VoucherType getVoucherType(String type){
        VoucherType voucherType = null;
        switch (type) {
            case "israel":
            case "germany":
            case "thailand":
            case "china":
            case "india":
            case "switzerland":
            case "belorussia":
                voucherType = VoucherType.health;
                break;
            case "sweden":
            case "finland":
            case "norway":
            case "estonia":
            case "denmark":
                voucherType = VoucherType.cruise;
                break;
            case "spain":
            case "england":
            case "usa":
            case "ukraine":
            case "russia":
                voucherType = VoucherType.excursion;
                break;
            case "egypt":
            case "turkey":
            case "tunisia":
                voucherType = VoucherType.relax;
                break;
            case "italy":
            case "france":
                voucherType = VoucherType.shopping;
                break;
        }
        return voucherType;
    }
}