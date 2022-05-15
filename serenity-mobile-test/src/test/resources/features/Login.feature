Feature: Login

  Scenario: Android user can login
    Given android user on home page
    When android user click on login icon
    And android user input email
    And android user input password
    And android user tap on login button
    Then android user on home page after login