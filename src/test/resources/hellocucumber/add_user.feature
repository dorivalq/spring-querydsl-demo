Feature: Add user Feature

  Scenario: Add user
    Given I have a user name "Jack" sure name "Bauer"
    When I search for user id 1
    Then I should have a user firt name "Jack"
