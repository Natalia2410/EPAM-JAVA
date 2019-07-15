package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String line1 = "scrap them all";
        String line2 = "s1cr23ap 4 t5hem6 all789";
        System.out.println(line1);
        System.out.println(reverse(line1));
        System.out.println(line2);
        System.out.println(getDigit(line2));
        System.out.println(getNotDigit(line2));
        System.out.println("count gap = " + countGap(line1));
    }

    public static StringBuffer reverse(String s) {
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        return buffer;
    }

    public static String getDigit(String s) {
        String digits = "";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String str = matcher.group();
            digits += str;
        }
        return digits;
    }
    public static String getNotDigit(String s) {
        String notDigits = "";
        Pattern pattern = Pattern.compile("\\D+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String str = matcher.group();
            notDigits += str;
        }
        String result = notDigits.replaceAll("\\s+"," ");
        return result;
    }

    public static int countGap(String s){
        int count = 0;
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
