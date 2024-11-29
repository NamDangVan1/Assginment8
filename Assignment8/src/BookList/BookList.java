package BookList;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    ArrayList<Book> bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public BookList() {
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String ID) {
        for (Book book : bookList) {
            if (book.getID().equals(ID)) {
                if (book instanceof TextBook) {
                    String title = sc.nextLine();
                    double basePrice = sc.nextDouble();
                    sc.nextLine();
                    String subject = sc.nextLine();
                    book.setTitle(title);
                    book.setBasePrice(basePrice);
                    ((TextBook) book).setSubject(subject);
                } else if (book instanceof ReferenceBook) {
                    String title = sc.nextLine();
                    double basePrice = sc.nextDouble();
                    sc.nextLine();
                    String publisher = sc.nextLine();
                    book.setTitle(title);
                    book.setBasePrice(basePrice);
                    ((ReferenceBook) book).setPublisher(publisher);
                } else {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookById(String ID) {
        return bookList.remove(findBookById(ID));
    }

    public Book findBookById(String ID) {
        for (Book book : bookList) {
            if (book.getID().equals(ID)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : bookList) {
            book.displayDetails();
        }
    }

    public Book findMostExpensiveBook() {
        Book mostExpensiveBook = null;
        double maxPrice = 0.0;

        for (Book book : bookList) {
            if (book.calculatePrice() > maxPrice) {
                maxPrice = book.calculatePrice();
                mostExpensiveBook = book;
            }
        }
        return mostExpensiveBook;
    }

    public void countBooks() {
        System.out.println(bookList.size());
    }
}
