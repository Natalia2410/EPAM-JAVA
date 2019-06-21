package StringsAndBasicsOfTextProcessing.Block2.Task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "abc cde def cdet";
        String str = deleteGap(s);
        System.out.println(deleteDoubleSymbols(str));
    }

    public static String deleteDoubleSymbols(String s) {
        char[] symbols = s.toCharArray();
        int n = symbols.length;
        String str = "";
        for (int i = 0; i < n; i++) {
            if (!str.contains(String.valueOf(symbols[i]))) {
                str += symbols[i];
            }
        }
        return str;
    }

    public static String deleteGap(String s) {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(s);
        String str = matcher.replaceAll("");
        return str;
    }
}

