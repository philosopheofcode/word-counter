Feature: # Form for word counting
  # user-facing form that counts the number of words in a block of text

  Scenario: # The form contains exactly 1 word
    Given I see a word counting form
    When I put the words "test"
    And I ask to calculate the number of words
    Then I see that the count number is 1

  Scenario: # The form is empty
    Given I see a word counting form
    And I ask to calculate the number of words
    Then I see the following error message "Warning: some text input is required"