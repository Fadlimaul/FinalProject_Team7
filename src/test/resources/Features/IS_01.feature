Feature: IS-01
  Scenario: TS-IS-001
    Given The user on the login
    When The user log in with username "testing2" password "Fadli798@"
    And The user complete OTP
    And The user directed to the "Info Saldo"
    And The user click eye icon
    Then The info saldo should be hidden

  Scenario: TS-IS-002
    Given The user on the login
    When The user log in with username "testing2" password "Fadli798@"
    And The user complete OTP
    Then The user click copy icon

  Scenario: TS-IS-003
    Given The user on the login
    When The user log in with username "testing2" password "Fadli798@"
    And The user complete OTP
    And The user directed to the "Info Saldo"
    And The user click change month
    Then The pie chart shouldnt be displayed

  Scenario: TS-IS-004
    Given The user on the login
    When The user log in with username "testing2" password "Fadli798@"
    And The user complete OTP
    And The user directed to the "Info Saldo"
    And The user click pengeluaran
    Then The text total pengeluaran should be displayed

  Scenario: TS-IS-005
    Given The user on the login
    When The user log in with username "testing2" password "Fadli798@"
    And The user complete OTP
    And The user directed to the "Info Saldo"
    And The user click transfer rupiah
    Then The text info should be displayed