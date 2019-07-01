package ProgrammingWithClasses.Block2.Task5;

import ProgrammingWithClasses.Block2.Task5.Validator.ValidatorInputData;
import ProgrammingWithClasses.Block2.Task5.model.Voucher;
import ProgrammingWithClasses.Block2.Task5.model.VoucherList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ValidatorInputData validatorInputData = new ValidatorInputData();
        VoucherList voucherList = new VoucherList();
        voucherList.setVouchers(voucherList.createVoucherList());
        System.out.println("Welcome to our touristic company!");
        System.out.println("You can search touristic tour with your preferences:");
        System.out.println("All vouchers in company:");
        voucherList.printAll();
        System.out.println("Entered type of your tour (cruise, excursion, health, relax, shopping):");
        String s = reader.readLine();
        System.out.println("Enter transport(air, bus):");
        String s1 = reader.readLine();
        System.out.println("Enter eating type(RO, BB, HB, HB+, FB, FB+, AL:");
        String s2 = reader.readLine();
        System.out.println("Enter daysQuantity:");
        String s3 = reader.readLine();
        ArrayList<Voucher> vouchersForClients = new ArrayList<>();
        try {
            System.out.println("\nPossible tour options:");
            vouchersForClients = voucherList.getVoucherListForClient(validatorInputData.getVoucherTypeForClient(s), validatorInputData.getTransportForClient(s1), validatorInputData.getDietForClient(s2), validatorInputData.getDaysQuantityForClient(s3));
            VoucherList.printForClient(vouchersForClients);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (vouchersForClients.size() > 1) {
            VoucherList.sort(vouchersForClients);
            System.out.println("\nAfter sorting by price:");
            VoucherList.printForClient(vouchersForClients);
        }
    }
}
