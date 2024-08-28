Feature: LOG-03

  Scenario: TC_LOG_012
    Given the user is on the login page
    When the user enters "M" as username and "Mmmmmmmmm" as password
    And the user clicks on the "Forgot Password" link
    And the user enters "testing2" as username in the forgot password page
    And the_user clicks on the "Send" button
    And the user clicks on the "Ok" button on the success_page
    And the user enters the verification code "1", "2", "3", "4", "5", "6"
    And the user clicks on_the "Continue" button
    And the user filling new password form "Fadli798@"
    And the user filling confirm password form "Fadli798@"
    And the user click lanjutkan
    Then the success message should be displayed

  Scenario: TC_LOG_013
    Given the user is on the login page
    When the user enters "M" as username and "Mmmmmmmmm" as password
    And the user clicks on the "Forgot Password" link
    And the user enters "testing2" as username in the forgot password page
    And the_user clicks on the "Send" button
    And the user clicks on the "Ok" button on the success_page
    And the user enters the verification code "1", "2", "3", "4", "5", "6"
    And the user clicks on_the "Continue" button
    And the user filling new password form "Fadli798@"
    And the user filling confirm password form "Fadli798@"
    And the user click lanjutkan
    Then the success message should be displayed

  Scenario: TC_LOG_014
    Given the user is on the login page
    When the user enters "M" as username and "Mmmmmmmmm" as password
    And the user clicks on the "Forgot Password" link
    And the user enters "testing2" as username in the forgot password page
    And the_user clicks on the "Send" button
    And the user clicks on the "Ok" button on the success_page
    And the user enters the verification code "1", "2", "2", "3", "4", "2"
    And the user clicks on_the "Continue" button
    Then the verification logo should be displayed

  Scenario: TC_LOG_015
    Given the user is on the login page
    When the user enters "M" as username and "Mmmmmmmmm" as password
    And the user clicks on the "Forgot Password" link
    And the user enters "testing2" as username in the forgot password page
    And the_user clicks on the "Send" button
    And the user clicks on the "Ok" button on the success_page
    And the user clicks on_the "Continue" button
    Then the verification logo should be displayed

  Scenario: TC_LOG_016
    Given the user is on the login page
    When the user enters "M" as username and "Mmmmmmmmm" as password
    And the user clicks on the "Forgot Password" link
    And the user enters "testing2" as username in the forgot password page
    And the_user clicks on the "Send" button
    And the user clicks on the "Ok" button on the success_page
    And the user enters the verification code "1", "2", "3", "4", "5", "6"
    And the user clicks on_the "Continue" button
    And the user filling confirm password form "Fadli798@"
    And the user click lanjutkan
    Then the title page should be displayed

  Scenario: TC_LOG_017
    Given the user is on the login page
    When the user enters "M" as username and "Mmmmmmmmm" as password
    And the user clicks on the "Forgot Password" link
    And the user enters "testing2" as username in the forgot password page
    And the_user clicks on the "Send" button
    And the user clicks on the "Ok" button on the success_page
    And the user enters the verification code "1", "2", "3", "4", "5", "6"
    And the user clicks on_the "Continue" button
    And the user filling new password form "Fadli798@"
    And the user click lanjutkan
    Then the title page should be displayed

  Scenario: TC_LOG_018
    Given the user is on the login page
    When the user enters "M" as username and "Mmmmmmmmm" as password
    And the user clicks on the "Forgot Password" link
    And the user enters "testing2" as username in the forgot password page
    And the_user clicks on the "Send" button
    And the user clicks on the "Ok" button on the success_page
    And the user enters the verification code "1", "2", "3", "4", "5", "6"
    And the user clicks on_the "Continue" button
    And the user click lanjutkan
    Then the title page should be displayed

  Scenario: TC_LOG_019
    Given the user is on the login page
    When the user enters "M" as username and "Mmmmmmmmm" as password
    And the user clicks on the "Forgot Password" link
    And the user enters "testing2" as username in the forgot password page
    And the_user clicks on the "Send" button
    And the user clicks on the "Ok" button on the success_page
    And the user enters the verification code "1", "2", "3", "4", "5", "6"
    And the user clicks on_the "Continue" button
    And the user filling new password form "Fadli798@"
    And the user filling confirm password form "Fadli79899@"
    And the user click lanjutkan
    Then the title page should be displayed


