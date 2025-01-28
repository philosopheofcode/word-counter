package it.phil.words.serenity.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("I see a word counting form")
    public void iSeeAWordCountingForm() {
        System.out.println("I see a word counting form");
    }

    @When("I put the words {string}")
    public void iPutTheWords(String words) {
        System.out.println("I put the words " + words);
    }

    @Then("I see that the count number is {int}")
    public void iSeeThatTheCountNumberIs(int numberOfWords) {
        System.out.println("I see that the count number is " + numberOfWords);
    }
}
