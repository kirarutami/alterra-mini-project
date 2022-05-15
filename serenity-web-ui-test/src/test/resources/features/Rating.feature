Feature: Ratings

  Scenario: Logout an account
    Given I am on the login page for rating
    When I input valid email for rating
    And I input valid password for rating
    And I click on login button for rating
    And I am on the home page for rating
    And I click Detail button on a product for rating
    And I click star icon for rating
    Then I am still on Product Page
