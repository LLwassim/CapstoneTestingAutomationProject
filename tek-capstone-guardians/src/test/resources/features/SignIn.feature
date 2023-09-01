@signIn
Feature: Test Sign in 
  
  Scenario: User Can Sign in
    When user clicks on sign in
    Then user is on sign in page
    And User enter email 'bro@gmail.com' and password 'Boomer@2023'
    And User click on login button
    Then User should be logged in into Account
    
   @createAccount 
   Scenario: Verify user can create an account into Retail Website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
    And User click on SignUp button
    Then User should be logged into account page