package BookList;

public abstract class Book implements IBook{
    private String ID, title;
    private double basePrice;

    public Book() {}

    public Book(String ID, String title, double basePrice) {
        this.ID = ID;
        this.title = title;
        this.basePrice = basePrice;
    }   
    
    @Override
    public abstract double calculatePrice();
    
    @Override
    public void displayDetails() {
        System.out.println(ID);
        System.out.println(title);
        System.out.println(calculatePrice());
    }
    
    double getBasePrice() {
        return basePrice;
    }
    
    String getID() {
        return ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
