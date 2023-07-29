Feature: Login to a website

  Scenario: Success login to my website
    Given I am on the login page
    When I enter valid username and password
    And click on login button
    Then I should be logged in
