package StringsAndBasicsOfTextProcessing.Block2.Task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "abc cde def cdet hfhkjnv dfdfdfdfdfdfdfd dfblbfdvfj";
        System.out.println(wordMaxLength(s));
    }

    public static String wordMaxLength(String s) {
        String[] words = s.split("\\s");
        Map<String, Integer> map = new HashMap<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            map.put(words[i], words[i].length());
        }
        int max = 0;
        String wordMaxLength = "";
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() > max) {
                max = pair.getValue();
                wordMaxLength = pair.getKey();
            }
        }
        return wordMaxLength;
    }
}
