Feature: Order

  Scenario: Order without login
    Given I am on the home page for order
    When I click on Beli button on a product
    And I click on Cart button
    And I click on Bayar button
    Then I am directed to Login page

  Scenario: Order normally
    Given I am on the login page for order
    When I input valid email for order
    And I input valid password for order
    And I click on login button for order
    And I am on the home page for order
    And I click on Beli button on a product
    And I click on Cart button
    And I click on Bayar button
    Then I am on the Transaction page

  Scenario: Order and reduce the product quantity
    Given I am on the login page for order
    When I input valid email for order
    And I input valid password for order
    And I click on login button for order
    And I am on the home page for order
    And I click on Beli button on a product
    And I click on Cart button
    And I click on reduce button
    Then The order is empty message showed


