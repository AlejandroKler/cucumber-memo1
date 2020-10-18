Feature: Real time counter

  Scenario: New country register cases
    Given A country with name "Argentina" with 1000 hab and 0 cases
    When I add 123 cases to country "Argentina"
    Then Should be 123 cases in "Argentina"

  Scenario: Add cases to country
    Given A country with name "Argentina" with 1000 hab and 500 cases
    When I add 300 cases to country "Argentina"
    Then Should be 800 cases in "Argentina"

  Scenario: Remove cases to country
    Given A country with name "Argentina" with 1000 hab and 500 cases
    When I remove 56 cases to country "Argentina"
    Then Should be 444 cases in "Argentina"