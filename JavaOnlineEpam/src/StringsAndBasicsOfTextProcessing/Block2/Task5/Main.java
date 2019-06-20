package StringsAndBasicsOfTextProcessing.Block2.Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(countA("mhkbtаааmknmraaalhgtaaamlh    lkvmgfbkfgka"));
    }

    public static int countA(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("a|а");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
