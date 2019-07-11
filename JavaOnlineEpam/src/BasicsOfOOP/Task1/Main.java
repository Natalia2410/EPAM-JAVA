package BasicsOfOOP.Task1;

public class Main {
    public static void main(String[] args) throws Exception {
        Directory directory = new Directory("D:\\git\\nata\\JavaOnlineEpam");
        File file = new TextFile("file1", directory);
        String s = "Hello World!";
        file.createFile(s);
        file.renameFile("file2", s);
        file.addFile(" I love java!");
        file.addFile(" I love java! ");
        file.printFile();
        file.deleteData();
    }
}
