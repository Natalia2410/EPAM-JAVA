package StringsAndBasicsOfTextProcessing.Block3.Task1;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> readFile = readFile();
        System.out.println("\nsort by number of sentences in a paragraph:\n");
        print(sortByCountOfProposals(readFile));
        writeInFile(sortByCountOfProposals(readFile));
        System.out.println("\nsort by length of words in sentences:\n");
        print(getSortedListOfProposalFromText(sortByCountOfProposals(readFile)));
        writeInFile(getSortedListOfProposalFromText(sortByCountOfProposals(readFile)));
        System.out.println("\nsort descending the number of occurrences of a given character or alphabetically:\n");
        String a = "a";
        print(getSortedListByCountSymbols(sortByCountOfProposals(readFile), a));
        writeInFile(getSortedListByCountSymbols(sortByCountOfProposals(readFile), a));
    }

    public static ArrayList<String> readFile() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test"));
            String s = reader.readLine();
            while (s != null) {
                list.add(s);
                s = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
        return list;
    }

    public static ArrayList<String> sortByCountOfProposals(ArrayList<String> list) {
        Collections.sort(list, new CountOfProposalComparator());
        return list;
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

    public static ArrayList<String> getSortedListOfProposalFromText(ArrayList<String> list) {
        ArrayList<String> sortedString = new ArrayList<>();
        ArrayList<String> paragraph = new ArrayList<>();
        int n = list.size();
        String str = "";
        for (int i = 0; i < n; i++) {
            Pattern pattern = Pattern.compile(".+?(\\.|\\?|\\!)");
            Matcher matcher = pattern.matcher(list.get(i));
            while (matcher.find()) {
                sortedString.add(sortProposalByLengthWord(matcher.group()));
            }
            int m = sortedString.size();
            for (int j = 0; j < m; j++) {
                str = str + sortedString.get(j);
            }
            paragraph.add(str);
            str = "";
            sortedString.clear();
        }
        return paragraph;
    }

    public static String sortProposalByLengthWord(String s) {
        int m = s.length();
        String newStr = s.substring(0, m - 1);
        String lastSymbol = s.substring(m - 1, m);
        String[] words = newStr.split("\\s");
        Arrays.sort(words, new LengthComparator());
        String str = "";
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                str += words[i];
            } else {
                str += words[i] + " ";
            }
        }
        str += lastSymbol;
        return str;
    }

    public static ArrayList<String> getSortedListByCountSymbols(ArrayList<String> list, String symbol) {
        ArrayList<String> sortedString = new ArrayList<>();
        ArrayList<String> paragraph = new ArrayList<>();
        int n = list.size();
        String str = "";
        String str1 = "";
        for (int i = 0; i < n; i++) {
            Pattern pattern = Pattern.compile(".+?(\\.|\\?|\\!)");
            Matcher matcher = pattern.matcher(list.get(i));
            while (matcher.find()) {
                String match = matcher.group();
                String newMatch = match.trim();
                int m = newMatch.length();
                String newStr = newMatch.substring(0, m - 1);
                String lastSymbol = newMatch.substring(m - 1, m);
                String[] words = newStr.split("\\s");
                int count = countSymbolsInString(words[0], symbol);
                for (int j = 1; j < words.length; j++) {
                    int countSymb = countSymbolsInString(words[j], symbol);
                    if (countSymb != count) {
                        sortedString.add(sortProposalByCountSymbols(newMatch, symbol));
                        break;
                    } else {
                        if (j == words.length - 1) {
                            Arrays.sort(words);
                            String stri = "";
                            int k = words.length;
                            for (int l = 0; l < k; l++) {
                                if (l == k - 1) {
                                    stri += words[l];
                                } else {
                                    stri += words[l] + " ";
                                }
                            }
                            stri += lastSymbol + " ";
                            sortedString.add(stri);
                        }
                    }
                }
            }
            int m = sortedString.size();
            for (int j = 0; j < m; j++) {
                str = str + sortedString.get(j);
            }
            paragraph.add(str);
            str = "";
            sortedString.clear();
        }
        return paragraph;
    }

    public static String sortProposalByCountSymbols(String s, String symbol) {
        int m = s.length();
        String newStr = s.substring(0, m - 1);
        String lastSymbol = s.substring(m - 1, m);
        String[] words = newStr.split("\\s");
        Arrays.sort(words, new CountSymbolsComparator(symbol));
        String str = "";
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                str += words[i];
            } else {
                str += words[i] + " ";
            }
        }
        str += lastSymbol + " ";
        return str;
    }

    public static int countSymbolsInString(String s, String symbol) {
        int count = 0;
        Pattern pattern = Pattern.compile(symbol);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void print(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void writeInFile(ArrayList<String> list) throws IOException {
        int n = list.size();
        FileWriter fw = null;
        try {
            fw = new FileWriter("test6", true);
            for (int i = 0; i < n; i++) {
                fw.write(list.get(i) + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            fw.close();
        }
    }
}
