package StringsAndBasicsOfTextProcessing.Block1.Task5;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        writeInFile(deleteGap());
    }

    public static ArrayList<String> deleteGap() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test"));
            String s = reader.readLine();
            while (s != null) {
                s = s.trim();
                String ptrn = "\\s+";
                String replace = " ";
                Pattern pattern = Pattern.compile(ptrn);
                Matcher matcher = pattern.matcher(s);
                s = matcher.replaceAll(replace);
                list.add(s);
                s = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
        return list;
    }

    public static void writeInFile(ArrayList<String> list) throws IOException {
        int n = list.size();
        FileWriter fw = null;
        try {
            fw = new FileWriter("test5");
            for (int i = 0; i < n; i++) {
                fw.write(list.get(i) + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            fw.close();
        }
    }
}
