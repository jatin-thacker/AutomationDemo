Feature: Broken Links
  @ResponseTest
  Scenario: Verify the broken links from the WebDriver University home page 
    Given I am present on the home page of the WebDriver
    When I check all the links 
    Then All the links should return a succcess return code