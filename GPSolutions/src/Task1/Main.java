package Task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file2", false);
        fw.write("<touristInfo>\n");
        BufferedReader reader = new BufferedReader(new FileReader("file"));
        String line;
        String[] words = null;
        String[] wordsInner = null;
        while ((line = reader.readLine()) != null) {
            fw.write("     <touristGroup>\n");
            words = line.split("\\|");
            for (int i = 0; i < words.length - 1; i++) {
                wordsInner = words[i].split("\\/");
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(wordsInner[0]);
                if (matcher.find()) {
                    String num = matcher.group();
                    int touristcType = Integer.parseInt(num);
                    if (touristcType == 10) {
                        fw.write("          <tourist type='ADT'>\n");
                    } else if (touristcType == 8) {
                        fw.write("          <tourist type='CHD'>" + " " + "birthDate='" + wordsInner[1] + "'>\n");
                    } else {
                        fw.write("          <tourist type='INF'>" + " " + "birthDate='" + wordsInner[1] + "'>\n");
                    }
                }
                fw.write("               <prefix>" + wordsInner[4] + "/<prefix>\n" );
                fw.write("               <name>" + wordsInner[3] + "/<name>\n");
                fw.write("               <surname>" + wordsInner[2] + "/<surname>\n");
                fw.write("          </tourist>\n");
            }
        }
        fw.write("     </touristGroup>\n");
        fw.write("</touristInfo>\n");
        fw.close();
    }
}