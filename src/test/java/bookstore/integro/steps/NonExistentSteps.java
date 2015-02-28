package bookstore.integro.steps;

import bookstore.Shelf;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class NonExistentSteps {
    
    Shelf shelf;
    Exception exception;
    
    @Given("has book $title for $cost dollars")
    public void given(@Named("cost") int cost, @Named("title") String title) {
        if (shelf == null) {
            shelf = new Shelf();
        }
        shelf.addBook(title, cost);
    }
    
    @When("sold book $title")
    public void when(String title) {
        try {
            shelf.buyBook(title);
            exception = null;
        } catch (Exception e) {
            exception = e;
        }
    }
    
    @Then("count should be $count books")
    public void then(int count) {
        Assert.assertEquals(count, shelf.getCount());
    }
    
    @Then("should get exception")
    public void thenException() {
        Assert.assertNotNull(exception);
    }
}
