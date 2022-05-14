Feature: Logout

  Scenario: Logout an account
    Given I am on the login page for logout
    When I input valid email for logout
    And I input valid password for logout
    And I click on login button for logout
    And I am on the home page for logout
    And I click on profile icon
    And I click on logout
    Then I am on login page after logout