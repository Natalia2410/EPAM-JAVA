package StringsAndBasicsOfTextProcessing.Block3.Task1;

import java.util.Comparator;

public class CountSymbolsComparator implements Comparator<String> {
    String symbol;

    public CountSymbolsComparator(String symbol) {
        this.symbol = symbol;
    }

    public int compare(String s1, String s2) {
        return Main.countSymbolsInString(s2, symbol) - Main.countSymbolsInString(s1, symbol);
    }
}

