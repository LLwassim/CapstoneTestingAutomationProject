@orderPage
Feature: Retail Order Page
​
@addItem
Scenario: Verify User can add an item to cart
    
    When User click on Sign in option
    And User enter email 'bro@gmail.com' and password 'Boomer@2023'
    And User click on login button
    And User should be logged in into Account
    And User change the category to "Smart Home"
    And User search for an item "kasa outdoor smart plug"
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'


@apexLegend    
Scenario: Verify User can place an order with Shipping address and payment Method on file
    
    When User click on Sign in option
    And User enter email 'bro@gmail.com' and password 'Boomer@2023'
    And User click on login button
    And User should be logged in into Account
    And User change the category to "Electronics" and User search for an item "Apex Legend"
    And User click on Search icon
    And User clicked on apex
    And User select quantity ‘5’
    And User click add to Cart button
    Then cart icon quantity should change to "5"
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then message for apex should be "Order Placed Successfully"
    
@cancelOrder    
Scenario: Verify User can cancel the order
   
    When User click on Sign in option
    And User enter email 'bro@gmail.com' and password 'Boomer@2023'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason "Bought wrong item"
    And Click Cancel
    Then a cancelation message should be displayed "Your Order Has Been Cancelled"
    
@return   
Scenario: Verify User can Return the order

    When User click on Sign in option
    And User enter email 'bro@gmail.com' and password 'Boomer@2023'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Return Items button
    And User select the Return Reason "Item damaged"
    And User select the drop off service "FedEx"
    And User check if theres a check box 
    And User click on Return Order button
    Then a cancel message should be displayed "Return was successful"
    
    
@review    
Scenario: Verify User can write a review on order placed

    When User click on Sign in option
    And User enter email 'bro@gmail.com' and password 'Boomer@2023'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Review button
    And User write Review headline "headline value" and "review text"
    And User click Add your Review button
    Then a review message should be displayed "Your review was added successfully"