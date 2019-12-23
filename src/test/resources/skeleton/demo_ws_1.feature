Feature: demo_ws multilogin
do multiple logins.
Scenario Outline: valid logins
Given the test me hope page is opened
When i provide "<Login>" and "<Password>"
Then user should goto next

Examples:
|Login|Password|
|testuser9@mail.com|Password_2|
|testuser99@mail.com|Password_1|