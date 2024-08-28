Feature: TR-01

  Scenario: TC-TR-001
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 5000 and note "Beli Seblak"
    And I confirm the transfer
    And I input PIN "1" "2" "3" "4" "5" "6"
    And I click send pin
    Then I should see a transfer success message

  Scenario: TC-TR-002
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I click continue
    Then I should see a logo displayed

  Scenario: TC-TR-003
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "1234567899"
    And I click continue
    Then I should see a logo displayed

  Scenario: TC-TR-004
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 5000 and note "Beli Seblak"
    And I confirm the transfer
    And I input PIN "1" "2" "3" "4" "5" "6"
    And I click send pin
    And I click bukti transfer
    Then I should see a bukti transfer

  Scenario: TC-TR-005
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 5000 and note "Beli Seblak"
    And I confirm the transfer
    And I input PIN "1" "2" "3" "4" "5" "6"
    And I click send pin
    And I click bukti transfer
    And I click download button
    Then I shouldnt see a bukti transfer

  Scenario: TC-TR-006
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 5000 and note "Beli Seblak"
    And I confirm the transfer
    And I input PIN "1" "2" "3" "4" "5" "6"
    And I click send pin
    And I click bukti transfer
    And I click share button
    Then I shouldnt see a bukti transfer

  Scenario: TC-TR-007
    Given I am on the login page
    When I log in with username "ilham" and password "Ilham123@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I click star icon
#    Then I shouldnt see a no favorite text
    Then I should see a no favorite text


  Scenario: TC-TR-008
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 0 and note "Beli Seblak"
    Then I should see a text catatan transfer

  Scenario: TC-TR-009
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 5000 and note ""
    Then I should see a text catatan transfer

  Scenario: TC-TR-010
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 0 and note ""
    Then I should see a text catatan transfer

  Scenario: TC-TR-011
    Given I am on the login page
    When I log in with username "ilham" and password "Ilham123@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "0882739192"
    And I click continue
    And I enter amount 100000000 and note "Beli Seblak"
    And I confirm the transfer
    And I input PIN "1" "2" "3" "4" "5" "6"
    And I click send pin
    Then I should see a failed transaction

  Scenario: TC-TR-012
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 5000 and note "Beli Seblak"
    And I confirm the transfer
    And I input PIN "1" "2" "3" "4" "5" "5"
    And I click send pin
    Then I should see a Title page text

  Scenario: TC-TR-013
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I cick add acc number
    And I add an account with number "9319470400"
    And I click continue
    And I enter amount 5000 and note "Beli Seblak"
    And I confirm the transfer
    And I click send pin
    Then I should see a Title page text

  Scenario: TC-TR-014
    Given I am on the login page
    When I log in with username "testing2" and password "Fadli798@"
    And I verify the OTP with code
    And I navigate to the transfer menu
    And I click existing account
    And I enter amount 5000 and note "Beli Seblak"
    And I confirm the transfer
    And I input PIN "1" "2" "3" "4" "5" "6"
    And I click send pin
    Then I should see a transfer success message
