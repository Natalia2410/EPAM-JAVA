package StringsAndBasicsOfTextProcessing.Block1.Task3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(countDigit());
    }

    public static int countDigit() throws IOException {
        BufferedReader reader = null;
        int count = 0;
        try {
            reader = new BufferedReader(new FileReader("test"));
            String s = reader.readLine();
            while (s != null) {
                count += s.length() - s.replaceAll("\\d", "").length();
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
