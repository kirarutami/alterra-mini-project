Feature: Register
  As user I want to register so I can have an account

  Scenario: register with valid data
    Given I am on the register page
    When I input valid full name
    And I input valid email for register
    And I input valid password for register
    And I click on register button
    Then I am on the login page after register

  Scenario: register with an email that already registered
    Given I am on the register page
    When I input valid full name
    And I input valid email that already registered
    And I input valid password
    And I click on register button
    Then I am still on the register page

  Scenario: register with a full name that already registered
    Given I am on the register page
    When I input valid full name that already registered
    And I input valid email
    And I input valid password
    And I click on register button
    Then I am on the login page

  Scenario: register with different email and the password has a space on it
    Given I am on the register page
    When I input valid full name
    And I input valid email
    And I input invalid password with space
    And I click on register button
    Then I am still on the register page