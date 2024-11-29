package BookList;

public class TextBook extends Book {
    private String subject;

    public TextBook() {
    }

    public TextBook(String subject) {
        this.subject = subject;
    }
    
    public TextBook(String subject, String ID, String title, double basePrice) {
        super(ID, title, basePrice);
        this.subject = subject;
    }
    
    @Override 
    public double calculatePrice() {
        return super.getBasePrice() * 1.1;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(subject);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }    
}
