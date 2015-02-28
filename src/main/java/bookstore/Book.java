package bookstore;

public class Book {
    
    private String title;
    private int cost;
    
    public Book(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }
    
    public int getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }
    
}
