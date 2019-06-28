package ProgrammingWithClasses.Block2.Task1;

public class Word {
    private String word;

    @Override
    public String toString() {
        return word;
    }

    public Word(String str){
        this.word = str ;
    }

    public String getWord() {
        return word;
    }
}
