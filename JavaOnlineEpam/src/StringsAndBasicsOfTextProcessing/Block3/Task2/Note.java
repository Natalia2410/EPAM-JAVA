package StringsAndBasicsOfTextProcessing.Block3.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note {
    String name;
    ArrayList<Note> notes;

    public static void parse(BufferedReader reader) throws IOException {
        String s = reader.readLine();
        Pattern pattern = Pattern.compile("<[a-z]>");
        Matcher matcher = pattern.matcher(s);
        String readedString = "";
        if (matcher.find()) {
            readedString = matcher.group();
            String name = readedString.substring(1, readedString.length() - 1);
            Note note = new Note();
            note.name = name;
        }
    }

}
