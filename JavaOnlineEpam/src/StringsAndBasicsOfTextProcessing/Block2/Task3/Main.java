package StringsAndBasicsOfTextProcessing.Block2.Task3;

public class Main {
    public static void main(String[] args) {
        String str = "Hello word drow olleh";
        String reverseStr = "";
        char[] symbols = str.toCharArray();
        for (int i = symbols.length - 1; i >= 0; i--) {
            reverseStr += symbols[i];
        }
        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println("word is palindrome");
        } else {
            System.out.println("word is not palindrome");
        }
    }
}
