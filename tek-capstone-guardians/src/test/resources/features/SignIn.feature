@signIn
Feature: Test Sign in 
  
  Scenario: User is on Sign In page
    When user clicks on sign in
    Then user is on sign in page

  #@MakeAccount
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
