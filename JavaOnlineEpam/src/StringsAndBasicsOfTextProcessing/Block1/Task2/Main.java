package StringsAndBasicsOfTextProcessing.Block1.Task2;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        writeInFile(changeString());
    }

    public static ArrayList<String> changeString() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test"));
            String s = reader.readLine();
            while (s != null) {
                String newStr = s.replaceAll("word", "letter");
                list.add(newStr);
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
            fw = new FileWriter("test2");
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
