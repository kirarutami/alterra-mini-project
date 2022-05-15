Feature: Beli

  Scenario: Buy without logged in
    Given android user on home page for buy
    When android user tap on Beli button
    And android user tap on Cart icon
    Then android user still on home page
