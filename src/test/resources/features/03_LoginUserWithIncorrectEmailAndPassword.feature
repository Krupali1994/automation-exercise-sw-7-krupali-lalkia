Feature: Login User with incorrect email and password

  Scenario: Login User with incorrect email and password
    Given The user is on the home page
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters correct email address "krupali@gmail.com"
    When The user enters correct password "Krupali123!"
    And The user clicks login button
    Then Verify error Your email or password is incorrect is visible