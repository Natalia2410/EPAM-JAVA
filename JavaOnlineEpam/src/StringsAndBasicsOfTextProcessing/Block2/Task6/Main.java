package StringsAndBasicsOfTextProcessing.Block2.Task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleString("Hello World!"));
    }

    public static String doubleString(String s) {
        char[] symbols = s.toCharArray();
        int n = symbols.length;
        ArrayList<Character> doubleSymbols = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                doubleSymbols.add(symbols[i]);
            }
        }
        String str = "";
        for (Character item : doubleSymbols) {
            str += String.valueOf(item);
        }
        return str;
    }
}
