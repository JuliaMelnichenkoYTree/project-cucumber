Feature: Google News page

  Scenario: checking weather and number of news
    When Google News page is open
    Then News Page is successfully loaded
    And I see the weather in P'yatykhats'kyi district
    And  I see the number of news is more than 1