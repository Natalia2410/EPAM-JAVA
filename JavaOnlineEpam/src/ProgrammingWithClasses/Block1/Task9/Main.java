package ProgrammingWithClasses.Block1.Task9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book(1, "Философия Java", "Брюс Эккель", "М.: Питер", 2016, 809, 100, "целлофанированный"));
        list.add(new Book(2, "Руководство для начинающих", "Герберт Шилдт", "М.: Вильямс", 2015, 720, 85, "французский"));
        list.add(new Book(3, "Полное руководство", "Герберт Шилдт", "М.: Вильямс", 2014, 768, 60, "интегральный"));
        list.add(new Book(4, "Курс программирования", "Уолтер Савитч", " М.: Вильямс", 2015, 928, 120, "целлофанированный"));
        list.add(new Book(5, "WEB-программирование на Java и JavaScript", "Андрей Гарнаев", "Москва", 2017, 718, 95, "переплет 7Б"));
        ListBook books = new ListBook(list);
        System.out.println("all the books in the list:");
        books.print();

        String author = "Герберт Шилдт";
        System.out.println("\nthe books of " + author + ":");
        books.getBooksByAuthor(author);

        String publisher = "москва";
        System.out.println("\nthe books of publisher " + publisher + ":");
        books.getBooksByPublisher(publisher);

        int year = 2015;
        System.out.println("\nbooks issued after " + year + " year:");
        books.getBooksAfterYearPfPublication(year);
    }
}
