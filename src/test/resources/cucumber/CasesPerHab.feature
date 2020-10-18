Feature: Cases per hab

  Scenario: Country without cases
    Given A country with name "Argentina" with 1000 hab and 0 cases
    Then Country cases per hab of "Argentina" should be 0

  Scenario: Country with cases
    Given A country with name "Argentina" with 40000000 hab and 123300 cases
    Then Country cases per hab of "Argentina" should be 0.0030825