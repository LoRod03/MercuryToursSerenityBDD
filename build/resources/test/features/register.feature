Feature: register
  I want to register me in the web application and to use the functions and features that give me.

  Scenario Outline: register in Mercury Tours
    Given the user is on the registration page
    When the user enters the personal information
      | firstName   | lastName   | phoneNumber   | emailAddress   | username   | password   |
      | <firstName> | <lastName> | <phoneNumber> | <emailAddress> | <username> | <password> |
    Then could see the welcome text
    Examples:
      | firstName | lastName | phoneNumber | emailAddress    | username | password |
      | Maria     | Florez   | 3143234     | maria@gmail.com | maflo    | 123*     |
      | Orlando   | Lima     | 3207564     | orli@gmail.com  | orlii    | 6354#    |
      | Pedro     | Castro   | 3176547     | pecas@gmail.com | pequitas | 9836##   |

