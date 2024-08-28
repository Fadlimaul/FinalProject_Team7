Feature: NA-01

  Scenario: TC-NA-001
    Given I on the login page
    When I log in
    And I verify OTP
    And I click notifikasi icon
    And I click All notifikasi button
    Then I should see the title page text

