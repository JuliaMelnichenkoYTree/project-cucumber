Feature: Google News page
Background:
  Given Google News page is open
    Scenario: checking weather and number of news
      When News Page is successfully loaded
      Then I see the weather in "Dnipro"
      And  I see the number of news is more than "1"