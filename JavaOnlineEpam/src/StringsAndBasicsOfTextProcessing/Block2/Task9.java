package StringsAndBasicsOfTextProcessing.Block2;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String s = "werty JGSDFGHYTR";
        System.out.println("Count lowercase = " + countLowerCase(s));
        System.out.println("Count uppercase = " + countUpperCase(s));
    }

    public static int countLowerCase(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static int countUpperCase(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
