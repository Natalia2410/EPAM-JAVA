package StringsAndBasicsOfTextProcessing.Block2.Task2;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(replace("I love java!"));
    }

    public static String replace(String s){
        String ptrn = "a";
        String replace = "ab";
        Pattern pattern = Pattern.compile(ptrn);
        Matcher matcher = pattern.matcher(s);
        String str = matcher.replaceAll(replace);
        return str;
    }
}
