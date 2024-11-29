package BookList;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;
        do{
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
                    bookList.updateBookById(IDToUpdate);
                    break;
                case 4:
                    String IDToDelete = sc.next();
                    System.out.println(bookList.deleteBookById(IDToDelete));
                    break;
                case 5:
                    String IDToFind = sc.next();
                    bookList.findBookById(IDToFind).displayDetails();
                    break;
                case 6:
                    bookList.displayAllBooks();
                    break;
                case 7:
                    bookList.findMostExpensiveBook().displayDetails();
                    break;
                case 8:
                    bookList.countBooks();
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Invalid Choice!");
            }
        } while(choice != 9);
    }
}
