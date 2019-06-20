package StringsAndBasicsOfTextProcessing.Block2.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "I love Java";
        String ptrn = "a";
        String replace = "ab";
        Pattern pattern = Pattern.compile(ptrn);
        Matcher matcher = pattern.matcher(str);
        String s = matcher.replaceAll(replace);
        System.out.println(str);
        System.out.println(s);
    }
}
