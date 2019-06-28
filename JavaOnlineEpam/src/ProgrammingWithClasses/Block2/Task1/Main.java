package ProgrammingWithClasses.Block2.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Word word = new Word("It's header");
        Word word1 = new Word("Hello");
        Word word2 = new Word("world.");
        Word word3 = new Word("I love");
        Word word4 = new Word("Java.");
        Word word5 = new Word("How are");
        Word word6 = new Word("you?");
        Word word7 = new Word("What is your");
        Word word8 = new Word("name?");
        Proposal proposal = new Proposal(word);
        Proposal proposal1 = new Proposal(word1, word2);
        Proposal proposal2 = new Proposal(word3, word4);
        Proposal proposal3 = new Proposal(word5, word6);
        ArrayList<Proposal> list = new ArrayList<>();
        list.add(proposal1);
        list.add(proposal2);
        list.add(proposal3);
        Text text = new Text(proposal, list);
        Text.print(text);
        System.out.println("\nafter adding text:");
        Proposal proposal4 = new Proposal(word7, word8);
        text.addText(proposal4);
        Text.print(text);
        System.out.println("\nheader:");
        text.printHeader();
    }
}
