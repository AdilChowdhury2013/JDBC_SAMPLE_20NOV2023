@DbloginFeature
Feature:  Codefios login page functionality validation

Background:
Given User is on the codefios login page

@DbScenario1
Scenario: Other Scenario- user should be able to login with valid credentials 
When User enters the "username" from mySQL database
When User enters the "password" from mySQL database


When User clicks on the signin button
Then User should land on Codefios dashboard page

