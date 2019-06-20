package StringsAndBasicsOfTextProcessing.Block2.Task3;

public class Main {
    public static void main(String[] args) {
        if (isPalindrome("qwerrrrewq")) {
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        String reverseStr = "";
        char[] symbols = s.toCharArray();
        for (int i = symbols.length - 1; i >= 0; i--) {
            reverseStr += symbols[i];
        }
        return s.equalsIgnoreCase(reverseStr);
    }
}
