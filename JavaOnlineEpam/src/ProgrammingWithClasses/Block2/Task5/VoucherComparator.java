package ProgrammingWithClasses.Block2.Task5;

import ProgrammingWithClasses.Block2.Task5.model.Voucher;

import java.util.Comparator;

public class VoucherComparator implements Comparator<Voucher> {
    @Override
    public int compare(Voucher o1, Voucher o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
