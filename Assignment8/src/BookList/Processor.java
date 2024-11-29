package BookList;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;
        do {
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    String IDTextBook = sc.nextLine();
                    String titleTextBook = sc.nextLine();
                    double basePriceTextBook = sc.nextDouble();
                    sc.nextLine();
                    String subjectTextBook = sc.nextLine();
                    bookList.addBook(new TextBook(subjectTextBook, IDTextBook, titleTextBook, basePriceTextBook));
                    break;
                case 2:
                    sc.nextLine();
                    String IDReferenceBook = sc.nextLine();
                    String titleReferenceBook = sc.nextLine();
                    double basePriceReferenceBook = sc.nextDouble();
                    sc.nextLine();
                    String publisherReferenceBook = sc.nextLine();
                    bookList.addBook(new ReferenceBook(publisherReferenceBook, IDReferenceBook, titleReferenceBook, basePriceReferenceBook));
                    break;
                case 3:
                    String IDToUpdate = sc.next();
                    if (bookList.updateBookById(IDToUpdate) == true) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Invalid ID");
                    }
                    break;
                case 4:
                    String IDToDelete = sc.next();
                    System.out.println(bookList.deleteBookById(IDToDelete));
                    break;
                case 5:
                    String IDToFind = sc.next();
                    Book bookToFind = bookList.findBookById(IDToFind);
                    if (bookToFind != null) {
                        bookToFind.displayDetails();
                    } else {
                        System.out.println("Invalid ID");
                    }
                    break;
                case 6:
                    bookList.displayAllBooks();
                    break;
                case 7:
                    Book mostExpensiveBook = bookList.findMostExpensiveBook();
                    if (mostExpensiveBook != null) {
                        mostExpensiveBook.displayDetails();
                    } else {
                        System.out.println("Invalid ID");
                    }
                    break;
                case 8:
                    bookList.countBooks();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice
                != 9);
    }
}
