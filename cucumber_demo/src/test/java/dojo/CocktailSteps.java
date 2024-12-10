package dojo;

import java.util.List;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {

    private Order order;

    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String string) {
        this.order = new Order();
        this.order.declareOwner(string);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_Juliette(String string) {
        this.order.declareTarget(string);
    }

    @Then("there is {int} cocktail in the order")
    public void there_is_no_cocktail_in_the_order(int number) {
        List<String> cocktails = this.order.getCocktails();
        assertEquals(number, cocktails.size());
    }

}
