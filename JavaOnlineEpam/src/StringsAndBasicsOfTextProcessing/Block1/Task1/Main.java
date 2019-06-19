package StringsAndBasicsOfTextProcessing.Block1.Task1;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        print(changeString());
        writeInFile(changeString());
    }

    public static ArrayList<String> changeString() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test"));
            String s = reader.readLine();
            while (s != null) {
                char[] symbols = s.toCharArray();
                int n = symbols.length;
                int[] arrayInt = new int[n];
                for (int i = 0; i < n; i++) {
                    arrayInt[i] = (int) symbols[i];
                }
                String str = "";

                for (int i = 0; i < n; i++) {
                    if (arrayInt[i] < 65 || arrayInt[i] > 90) {
                        str = str + String.valueOf((char) arrayInt[i]);
                    } else {
                        str = str + "_" + String.valueOf((char) arrayInt[i]).toLowerCase();
                    }
                }
                list.add(str);
                s = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
        return list;
    }

    public static void print(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void writeInFile(ArrayList<String> list) throws IOException {
        int n = list.size();
        FileWriter fw = null;
        try {
            fw = new FileWriter("test1");
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
