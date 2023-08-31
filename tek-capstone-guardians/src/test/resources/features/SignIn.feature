@signIn
Feature: Test Sign in 
  
  Scenario: User is on Sign In page
    When user clicks on sign in
    Then user is on sign in page

  @LogIn
  Scenario: User Can Sign in
    And User enter email 'bro@gmail.com' and password 'Boomer@2023'
    And User click on login button
    Then User should be logged in into Account