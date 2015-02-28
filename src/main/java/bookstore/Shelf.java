package bookstore;

import java.util.HashMap;
import java.util.Map;

public class Shelf {
    
    private Map<String, Book> books = new HashMap<>();
    
    public void addBook(String title, int cost) {
        books.put(title, new Book(title, cost));
    }
    
    public void buyBook(String title) {
        if (!books.containsKey(title)) {
            throw new RuntimeException("No such book!");
        }
        books.remove(title);
    }
    
    public int calcRemainingValue() {
        int sum = 0;
        for (Book b : books.values()) {
            sum += b.getCost();
        }
        return sum;
    }
    
    public int getCount() {
        return books.size();
    }
}
