Feature: TT-01
  Scenario: TC-TT-001
    Given The user is on the login
    When The user log in with username "testing2" and password "Fadli798@"
    And The user completes the OTP
    And The user navigates to the menu
    And The user enters an amount of "50000" and name token "Penarikan Pertama"
    And The user click lanjutkan button
    And The user confirms the withdrawal
    And The user enter PIN "1" "2" "3" "4" "5" "6"
    And The user click lanjutkan button pin
    Then The withdrawal should be successful

  Scenario: TC-TT-002
    Given The user is on the login
    When The user log in with username "testing2" and password "Fadli798@"
    And The user completes the OTP
    And The user navigates to the menu
    And The user enters an amount of "" and name token "Penarikan Pertama"
    Then The withdrawal should be successful

  Scenario: TC-TT-003
    Given The user is on the login
    When The user log in with username "testing2" and password "Fadli798@"
    And The user completes the OTP
    And The user navigates to the menu
    And The user enters an amount of "50000" and name token ""
    And The user click lanjutkan button
    And The user confirms the withdrawal
    And The user enter PIN "1" "2" "3" "4" "5" "6"
    And The user click lanjutkan button pin
    Then The withdrawal should be successful

  Scenario: TC-TT-004
    Given The user is on the login
    When The user log in with username "testing2" and password "Fadli798@"
    And The user completes the OTP
    And The user navigates to the menu
    And The user click lanjutkan button
    Then The withdrawal should be successful

  Scenario: TC-TT-005
    Given The user is on the login
    When The user log in with username "testing2" and password "Fadli798@"
    And The user completes the OTP
    And The user navigates to the menu
    And The user enters an amount of "40000" and name token "Penarikan Pertama"
    Then The withdrawal should be successful

  Scenario: TC-TT-006
    Given The user is on the login
    When The user log in with username "testing2" and password "Fadli798@"
    And The user completes the OTP
    And The user navigates to the menu
    And The user enters an amount of "50000" and name token "Beli seblak"
    And The user click lanjutkan button
    And The user confirms the withdrawal
    And The user click lanjutkan button pin
    Then The withdrawal should be successful

  Scenario: TC-TT-007
    Given The user is on the login
    When The user log in with username "testing2" and password "Fadli798@"
    And The user completes the OTP
    And The user navigates to the menu
    And The user enters an amount of "50000" and name token "Penarikan Pertama"
    And The user click lanjutkan button
    And The user confirms the withdrawal
    And The user enter PIN "1" "2" "3" "4" "5" "5"
    And The user click lanjutkan button pin
    Then The withdrawal should be successful

  Scenario: TC-TT-008
    Given The user is on the login
    When The user log in with username "testing2" and password "Fadli798@"
    And The user completes the OTP
    And The user navigates to the menu
    And The user enters an amount of "5000000000" and name token "Penarikan Pertama"
    And The user click lanjutkan button
    And The user confirms the withdrawal
    And The user enter PIN "1" "2" "3" "4" "5" "6"
    And The user click lanjutkan button pin
    Then The withdrawal should be successful