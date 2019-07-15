package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file3"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
        String line1 = list.get(0);
        String line2 = list.get(1);
        String line3 = list.get(2);
        String line4 = list.get(3);
        System.out.println(line1);
        System.out.println(reverse(line1));
        System.out.println(line2);
        System.out.println(getDigit(line2));
        System.out.println(line3);
        System.out.println(getNotDigit(line3));
        System.out.println("count gap = " + countGap(line4));
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
        String result = notDigits.replaceAll("\\s+", " ");
        return result;
    }

    public static int countGap(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
