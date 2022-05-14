Feature: Login
  As user I want to login so I can go to home page

  Scenario: Login with valid email and password
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click on login button
    Then I am on the home page

  Scenario: Login with valid email and invalid password
    Given I am on the login page
    When I input valid email
    And I input invalid password
    And I click on login button
    Then I am still on the login page

  Scenario: Login with invalid email and valid password
    Given I am on the login page
    When I input invalid email
    And I input valid password
    And I click on login button
    Then I am still on the login page

  Scenario: Login with invalid email and password
    Given I am on the login page
    When I input invalid email
    And I input invalid password
    And I click on login button
    Then I am still on the login page