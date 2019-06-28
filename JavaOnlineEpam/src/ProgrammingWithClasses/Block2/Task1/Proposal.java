package ProgrammingWithClasses.Block2.Task1;

public class Proposal {
    private Word[] words;

    public Proposal(Word... words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str += words[i].getWord() + " ";
        }
        return str;
    }
}
