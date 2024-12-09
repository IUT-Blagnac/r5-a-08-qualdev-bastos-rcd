package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private String today;
    private String answer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        this.today = "Sunday";
    }

    @Given("today is Friday")
    public void today_is_friday() {
        this.today = "Friday";
    }

    @Given("today is {string}")
    public void today_is(String string) {
        this.today = string;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_if_it_s_friday() {
        this.answer = IsItFriday.isItFriday(this.today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, this.answer);
    }

}

class IsItFriday {

    static String isItFriday(String today) {
        return today.equals("Friday") ? "TGIF" : "Nope";
    }
}
