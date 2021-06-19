Feature: Contact Us Form - Negative Scenarios 
@NegativeTest @ContactTest
  Scenario Outline: Verify the functionality of Contact Us Page 
    Given I am present on the home page of the WebDriver University
    When I click the Contact Us page
    And I switch to the new tab
    And Enter the "<First Name>" as firstname, "<Last Name>" as lastname, "<Email>" as email and "<Message>" as message
    Then The user should get error message as "<error_message>"
  Examples:
  | First Name | Last Name | Email | Message | error_message | 
  | Jatin | Thacker |  | Thanks for building such a wonderful application! | Error: all fields are required |
  | Jatin |  | mail.jatint@gmail.com | Thanks for building such a wonderful application! | Error: all fields are required |
  |  | Thacker | mail.jatint@gmail.com | Thanks for building such a wonderful application! | Error: all fields are required |
  | Jatin | Thacker | mail.jatint@gmail.com |  | Error: all fields are required |
  | Jatin  | Thacker | mail.jatint@ | Thanks for building such a wonderful application! | Error: Invalid email address |
  | Jatin  | Thacker | mail.jatint | Thanks for building such a wonderful application! | Error: Invalid email address |
  | Jatin  | Thacker | mail.jatint@.com | Thanks for building such a wonderful application! | Error: Invalid email address |
  | Jatin  | Thacker | @gmail.com | Thanks for building such a wonderful application! | Error: Invalid email address |
  

    