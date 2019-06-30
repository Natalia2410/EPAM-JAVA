package ProgrammingWithClasses.Block2.Task4;

import java.util.Comparator;

public class AccountComparatorBalance implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        double dollarRate = 2.04;
        double euroRate = 2.33;
        double realBalance1 = o1.getBalance();
        if (o1.getCurrency().equalsIgnoreCase("euro")) {
            realBalance1 *= euroRate;
        } else if (o1.getCurrency().equalsIgnoreCase("dollar")) {
            realBalance1 *= dollarRate;
        }
        double realBalance2 = o2.getBalance();
        if (o2.getCurrency().equalsIgnoreCase("euro")) {
            realBalance2 *= euroRate;
        } else if (o2.getCurrency().equalsIgnoreCase("dollar")) {
            realBalance2 *= dollarRate;

        }
        return (int) realBalance1 - (int) realBalance2;
    }
}
