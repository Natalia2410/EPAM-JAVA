package ProgrammingWithClasses.Block2.Task5.model;

import ProgrammingWithClasses.Block2.Task5.VoucherType;

public class RelaxVoucher extends Voucher {
    public RelaxVoucher(VoucherType type, String country, String transport, String diet, int daysQuantity, int price) {
        super(type, country, transport, diet, daysQuantity, price);
    }
}
