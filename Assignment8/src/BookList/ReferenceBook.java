package BookList;

public class ReferenceBook extends Book {
    String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String publisher) {
        this.publisher = publisher;
    }

    public ReferenceBook(String publisher, String ID, String title, double basePrice) {
        super(ID, title, basePrice);
        this.publisher = publisher;
    }
    
    @Override
    public double calculatePrice() {
        return super.getBasePrice() * 1.2;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(publisher);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
}
