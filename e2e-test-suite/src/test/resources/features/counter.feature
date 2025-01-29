Feature: # Form for word counting
  # user-facing form that counts the number of words in a block of text

  Scenario: # The form contains exactly 1 word
    Given I see a word counting form
    When I put the words "test"
    And I ask to calculate the number of words
    Then I see that the count number is 1