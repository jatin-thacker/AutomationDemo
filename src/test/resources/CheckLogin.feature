Feature: Login Functionality - Positive Scenarios
  @LoginTest
  Scenario Outline: Verify the functionality of login page 
    Given I am present on the home page of the WebDriver University
    When I click the login button
    And I switch to the new tab
    And Enter the "<uname>" as username and "<pwd>" as password
    Then The user should get a pop-up
    
  Examples:
  | uname | pwd |
  | admin | admin | 
  | admin | password |
  | Username | password |
  | Username | Password |
  | username | password |
  | username | Password |