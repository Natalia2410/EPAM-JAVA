package StringsAndBasicsOfTextProcessing.Block3.Task1;

import java.util.Comparator;

public class CountOfProposalComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        if (Main.countOfProposal(s1) > Main.countOfProposal(s2)) {
            return 1;
        } else if (Main.countOfProposal(s1) == Main.countOfProposal(s2)) {
            return 0;
        } else {
            return -1;
        }
    }
}
