package StringsAndBasicsOfTextProcessing.Block2.Task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "dndfkjvnf. q! knvekfnk? dlgnsjn. dkvnvkkjn; kjnkjdnk. knfknh";
        System.out.println("count of proposal = " + countOfProposal(s));
    }

    public static int countOfProposal(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("(\\w+\\.)|(\\w+\\!)|(\\w+\\?)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
