package ProgrammingWithClasses.Task9;

import java.util.ArrayList;

public class ListBook {
    private ArrayList<Book> books;

    public ListBook(ArrayList<Book> list) {
        this.books = list;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void print() {
        for (Book item : books) {
            System.out.println(item + " ");
        }
    }

    public void getBooksByAuthor(String author) {
        int n = books.size();
        boolean isContains = false;
        for (int i = 0; i < n; i++) {
            if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                System.out.println(books.get(i) + " ");
                isContains = true;
            }
        }
        if (!isContains) {
            System.out.println("this author is not listed");
        }
    }

    public void getBooksByPublisher(String publisher) {
        int n = books.size();
        boolean isContains = false;
        for (int i = 0; i < n; i++) {
            if (books.get(i).getPublisher().equalsIgnoreCase(publisher)) {
                System.out.println(books.get(i) + " ");
                isContains = true;
            }
        }
        if (!isContains) {
            System.out.println("this publisher is not listed");
        }
    }

    public void getBooksAfterYearPfPublication(int yearPfPublication) {
        int n = books.size();
        for (int i = 0; i < n; i++) {
            if (books.get(i).getYearOfPublication() > yearPfPublication) {
                System.out.println(books.get(i) + " ");
            }
        }
    }
}
