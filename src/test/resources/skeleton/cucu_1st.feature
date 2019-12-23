Feature: login
this feature allows a registered user into the home page.
Scenario: valid login 
Given the user is on the testme app homepage
When the user gives valid login and valid password
Then user should goto next page