package ProgrammingWithClasses.Block2.Task1;

import java.util.ArrayList;

public class Text {
    private Proposal header;
    private ArrayList<Proposal> proposals;

    public Text(Proposal header, ArrayList<Proposal> proposals) {
        this.header = header;
        this.proposals = proposals;
    }

    public Proposal getHeader() {
        return header;
    }

    public ArrayList<Proposal> getProposals() {
        return proposals;
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < proposals.size(); i++) {
            for (int j = 0; j < proposals.get(i).getWords().length; j++) {
                text += proposals.get(i).getWords()[j].toString() + " ";
            }
        }
        return text;
    }

    public static void print(Text text) {
        System.out.println(text);
    }

    public void addText(Proposal proposal) {
        proposals.add(proposal);
    }

    public void printHeader() {
        System.out.println(header);
    }
}
