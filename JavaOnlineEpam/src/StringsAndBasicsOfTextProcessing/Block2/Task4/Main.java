package StringsAndBasicsOfTextProcessing.Block2.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(getWord());
    }

    public static String getWord() {
        String cake = "торт";
        String informatika = "информатика";
        ArrayList<String> symbols = new ArrayList<>();
        Pattern pattern = Pattern.compile("(т)|(о)|(р)");
        Matcher matcher = pattern.matcher(informatika);
        while (matcher.find()) {
            String symb = matcher.group();
            if (symb.equals("т")) {
                for (int i = 0; i < 2; i++) {
                    symbols.add(symb);
                }
            } else {
                symbols.add(symb);
            }
        }
        String word = "";
        for (String item : symbols) {
            word += item;
        }
        while (!word.equals(cake)) {
            word = "";
            Collections.shuffle(symbols);
            for (String item : symbols) {
                word += item;
            }
        }
        return word;
    }
}
