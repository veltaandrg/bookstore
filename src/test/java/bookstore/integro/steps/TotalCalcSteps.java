package bookstore.integro.steps;

import bookstore.Shelf;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class TotalCalcSteps {
    
    Shelf shelf;
    
    @Given("has book $title for $cost dollars")
    public void given(String title, int cost) {
        if (shelf == null) {
            shelf = new Shelf();
        }
        shelf.addBook(title, cost);
    }
    
    @When("sold book $title")
    public void when(String title) {
        shelf.buyBook(title);
    }
    
    @Then("total should be $total dollars")
    public void then(int totalValue) {
        Assert.assertEquals(totalValue, shelf.calcRemainingValue());
    }
}
