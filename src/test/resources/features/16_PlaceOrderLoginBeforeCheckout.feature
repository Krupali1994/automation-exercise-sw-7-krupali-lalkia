Feature: Place Order Login before Checkout

  Scenario: Login before Checkout
    Given The user is on the home page
    When The user clicks Signup Login menu button
    And The user enters correct email address "krupali@gmail.com"
    And The user enters correct password "Krupali123!"
    And The user clicks login button
    Then Verify that Logged in as username is visible
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks Cart menu button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
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
    #Then Verify success message Your order has been placed successfully!
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED! is visible
    And The user clicks Continue button