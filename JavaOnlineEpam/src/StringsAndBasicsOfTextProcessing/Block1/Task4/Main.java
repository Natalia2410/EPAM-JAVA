package StringsAndBasicsOfTextProcessing.Block1.Task4;

import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("count numbers " + countNumber());
    }

    public static int countNumber() throws IOException {
        BufferedReader reader = null;
        int count = 0;
        try {
            reader = new BufferedReader(new FileReader("test"));
            String s = reader.readLine();
            while (s != null) {
                Pattern pattern = Pattern.compile("\\d{2,}");
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()) {
                    String str = matcher.group();
                    count++;
                    System.out.println(str);
                }
                s = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
        return count;
    }
}
