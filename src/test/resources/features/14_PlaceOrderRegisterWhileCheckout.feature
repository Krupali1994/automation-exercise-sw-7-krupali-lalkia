Feature: Place Order Register while Checkout

  Scenario: Register while Checkout
    Given The user is on the home page
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks Cart menu button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    And The user clicks Register-Login button
    And The user enters name "Krupali"
    And The user enters email "krupali@gmail.com"
    And The user clicks Signup button
    When User selects Miss
    When User Enters Password "Krupali123!"
    When User Selects Day "1"
    When User Selects Month "Jan"
    When User Selects Year "1995"
    When User Enters First Name "Krupali"
    When User Enters Last Name "Lalkia"
    When User Enters Address "15 Covent Garden"
    When User Enters Country "UK"
    When User Enters State "London"
    When User Enters City "London"
    When User Enters Zipcode "SL0 8RA"
    When User Enters Mobile "07894561230"
    And The user clicks Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    When The user clicks Continue button
    And Verify that Logged in as username is visible
    When The user clicks Cart menu button
    And The user clicks Proceed To Checkout button
    Then Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    When The user enters description in comment text area "thanks"
    And Click Place Order button
    And The user enters payment details Name on Card "Miss Krupali"
    And The user enters payment details Card Number "1234567890123456"
    And The user enters payment details CVC "555"
    And The user enters payment details Expiration month "01"
    And The user enters payment details Expiration year "2025"
    When The user clicks Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    And The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED is visible
    And The user clicks Other Continue button