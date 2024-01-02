Feature: Register User

  Scenario: Register on the web page
    Given The user is on the home page
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters name "Krupali"
    When The user enters email "krupali@gmail.com"
    And The user clicks Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
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
    And The user clicks Dismiss button
    Then Verify that Logged in as username is visible
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED is visible
    And The user clicks Other Continue button