Feature: Contact Us Form - Positive Scenarios
  @PositiveTest @ContactTest @AppliTest
  Scenario Outline: Verify the functionality of Contact Us Page 
    Given I am present on the home page of the WebDriver University
    When I click the Contact Us page
    And I switch to the new tab
    And Enter the "<First Name>" as firstname, "<Last Name>" as lastname, "<Email>" as email and "<Message>" as message
    Then The user should get success message
  Examples:
  | First Name | Last Name | Email | Message |
  | Jatin | Thacker | mail.jatint@gmail.com | Thanks for building such a wonderful application! | 
  | Kali | Linux | sudo@kalilinux.com | Taking it a step further! | 
  
  
    