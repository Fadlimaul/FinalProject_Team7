Feature: LOG-02

  Scenario: TC-LOG-002
    Given The user is on the RupiApp login page
    When The user enters username "testing2"
    And The user enters password "Fadli798@"
    And The user clicks the login button
    And The user clicks the ok button
    And The user enters the OTP code "1" "2" "3" "4" "5" "6"
    And The user clicks send otp
    Then the text dashboard should be displayed

  Scenario: TC-LOG-003
    Given The user is on the RupiApp login page
    When The user enters username "testing2"
    And The user enters password "Fadli798@"
    And The user clicks the login button
    And The user clicks the ok button
    And The user click send new code
    Then I should see a success message

  Scenario: TC-LOG-004
    Given The user is on the RupiApp login page
    When The user enters username "testing2"
    And The user enters password "Fadli798@"
    And The user clicks the login button
    And The user clicks the ok button
    And The user enters the OTP code "1" "2" "3" "4" "5" "5"
    And The user clicks send otp
    Then the app logo should be displayed

  Scenario: TC-LOG-005
    Given The user is on the RupiApp login page
    When The user enters username "testing2"
    And The user enters password "Fadli798@"
    And The user clicks the login button
    And The user clicks the ok button
    And The user clicks send otp
    Then the app logo should be displayed

  Scenario: TC-LOG-006
    Given The user is on the RupiApp login page
    When The user enters username "testing2aaaa"
    And The user enters password "Fadli798@"
    And The user clicks the login button
    Then I should remain on the login page

  Scenario: TC-LOG-007
    Given The user is on the RupiApp login page
    When The user enters username "testing2"
    And The user enters password "aaaaaaaaaa"
    And The user clicks the login button
    Then I should remain on the login page

  Scenario: TC-LOG-008
    Given The user is on the RupiApp login page
    When The user enters password "Fadli798@"
    And The user clicks the login button
    Then I should see a warning message for the username field

  Scenario: TC-LOG-009
    Given The user is on the RupiApp login page
    When The user enters username "testing2"
    And The user enters password ""
    And The user clicks the login button
    Then I should see a warning message for the password field

  Scenario: TC-LOG-010
    Given The user is on the RupiApp login page
    When The user enters username ""
    And The user enters password ""
    And The user clicks the login button
    Then I should see a warning message for the username and password field

  Scenario: TC-LOG-011
    Given The user is on the RupiApp login page
    When The user enters username ""
    And The user enters password "Anggit"
    And the user clicks the eye icon to reveal the password
    Then the password should be displayed in the password field