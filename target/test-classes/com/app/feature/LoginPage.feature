Feature: LoginPage testing

    @asMap
  Scenario: Enter correct form details
 		Given launch the url
    When fillin the form details
      | firstname | Thillai                   |
      | lastname  | rajan                     |
      | email     | thillairajan619@gmail.com |
   
   
   @tag2
  Scenario: Enter correct forget login
 		Given launch the url
    When fillin the form details
      | firstname | Thillai                   |
      | lastname  | rajan                     |
      | email     | thillairajan619@gmail.com |  