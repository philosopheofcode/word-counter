package it.phil.words.serenity.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.Assert;

public class Steps extends UIInteractions {
    @Given("I see a word counting form")
    public void iSeeAWordCountingForm() {
        openUrl("http://localhost:5173/");//TODO this should be an external property
    }

    @When("I put the words {string}")
    public void iPutTheWords(String words) {
        $("#input-counter").sendKeys(words);
    }

    @And("I ask to calculate the number of words")
    public void iAskToCalculateTheNumberOfWords() {
        $("#button-counter").click();
    }

    @Then("I see that the count number is {int}")
    public void iSeeThatTheCountNumberIs(int numberOfWords) {
        String text = $("#show-count > p:nth-child(1)").getText();

        int numberOfWordsActual = Integer.parseInt(text.replaceAll("[\\D]", ""));

        Serenity.reportThat("The keyword should appear in the sidebar heading", () -> Assert.assertEquals(numberOfWords, numberOfWordsActual));
    }


}
