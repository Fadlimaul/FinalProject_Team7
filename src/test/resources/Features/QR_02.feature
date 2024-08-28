Feature: QRI-02

  Scenario: TC-QR-012
    Given Im on the login page
    When I log in with valid credentials
    And I verify the OTP
    And I navigate to the QRIS menu
    And I select the QR logo
    And I enter the PIN
    Then I should see the QR Merchant text
