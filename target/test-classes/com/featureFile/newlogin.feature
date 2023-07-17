
Feature:login functionality check
  Scenario Outline: user login to application
    Given launch the application
    When user enters the "<username>" in the username field
    And user enters the "<password>" in the password field
    Then user click on the login button
 
 
Examples:
|username|password|
|chittu|vishnu|
|raj|aditya|