Feature: ST-01

  Scenario: TC-ST-001
    Given The user is on login page
    When The user enters a valid username and password
    And The user clicks on the login button
    And The user enters the verification code
    And The user navigates to the deposit page
    And user confirms deposit
    And The user enters the PIN "1" "2" "3" "4" "5" "6"
    And The user click lanutkan
    Then The deposit is successful

  Scenario: TC-ST-002
    Given The user is on login page
    When The user enters a valid username and password
    And The user clicks on the login button
    And The user enters the verification code
    And The user navigates to the deposit page
    And user confirms deposit
    And The user enters the PIN "1" "2" "3" "4" "5" "5"
    And The user click lanutkan
    Then The user should see the PIN confirmation page

  Scenario: TC-ST-003
    Given The user is on login page
    When The user enters a valid username and password
    And The user clicks on the login button
    And The user enters the verification code
    And The user navigates to the deposit page
    And user confirms deposit
    And The user click lanutkan
    Then The user should see the PIN confirmation page
