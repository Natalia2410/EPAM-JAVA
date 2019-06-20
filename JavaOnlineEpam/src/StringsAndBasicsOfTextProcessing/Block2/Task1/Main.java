package StringsAndBasicsOfTextProcessing.Block2.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxCountGap());
    }

    public  static int maxCountGap(){
        int max = 0;
        StringBuilder sb = new StringBuilder(new String("Hello world          Hello worldHello worldHello world  Hello world"));
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()){
            String s = matcher.group();
            int length = s.length();
            if(length > max){
                max = length;
            }
        }
        return max;
    }
}
