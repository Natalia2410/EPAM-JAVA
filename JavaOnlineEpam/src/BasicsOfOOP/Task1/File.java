package BasicsOfOOP.Task1;

public abstract class File {
    private String name;
    private Directory directory;


    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Directory getDirectory() {

        return directory;
    }

    public void setDirectory(Directory directory) {

        this.directory = directory;
    }

    public abstract void createFile(String s);

    public abstract void renameFile(String name, String s);

    public abstract void printFile();

    public abstract void addFile(String s);

    public abstract void deleteData();
}
