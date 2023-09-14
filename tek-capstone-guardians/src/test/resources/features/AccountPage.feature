@accountPage
Feature: Account Page
​
Background:
    When user clicks on sign in
    And User enter email 'bro@gmail.com' and password 'Boomer@2023'
    And User click on login button
    And User should be logged in into Account
    
Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name ‘NameValue’ and Phone ‘PhoneValue’
    And User click on Update button
    Then user profile information should be updated
    
Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
    #|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    #|value     | value    |value          |value         |value       |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

@editCard  
Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
    |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    |value     | value    |9          |27         |445      |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’
    
Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed
@addAddy   
Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
    |fullName|phoneNumber|streetAddress|apt       |city     | state |zipCode   |
    | sir  | value     | randomst      | 101  | Arlington   | Texas | value    |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’
    
@editAddy   
Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user can update new address form with below information
    |fullName|phoneNumber|streetAddress|  apt    |city     | state |zipCode   |
    | sir yes sir  | value     | randomstreet      |  202  | FallsChurch  | Virginia| value    |
    And User click update Your Address button
    Then a message should be displayed "Address Updated Successfully"
    
Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed