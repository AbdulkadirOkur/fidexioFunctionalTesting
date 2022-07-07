@wip
Feature:As a user, I should be able to log in so that I can land on homepage.
  AC1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)
  AC2-"Wrong login/password" should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials
  AC3-"Please fill out this field" message should be displayed if the password or username is empty
  AC4-User land on the ‘reset password’ page after clicking on the "Reset password" link
  AC5-User should see the password in bullet signs by default
  AC6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.

  Background:
    Given user is on the Login page

  @FIDEXI-505 @wip
  Scenario Outline:Login as PosManager with valid credentials
    When User enter username "<username>"
    And User enter password "<password>"
    And User click login button
    Then User should Login and see "Odoo" in the title
    Examples:Valid Credential list
      | username              | password   |
      | posmanager10@info.com | posmanager |
      | posmanager21@info.com | posmanager |
      | posmanager25@info.com | posmanager |
      | posmanager32@info.com | posmanager |
      | posmanager42@info.com | posmanager |

  @FIDEXI-506 @wip
  Scenario Outline:Login as SalesManager with valid credentials
    When User enter username "<username>"
    And User enter password "<password>"
    And User click login button
    Then User should Login and see "Odoo" in the title
    Examples:Valid Credential list
      | username                | password     |
      | salesmanager15@info.com | salesmanager |
      | salesmanager19@info.com | salesmanager |
      | salesmanager22@info.com | salesmanager |
      | salesmanager28@info.com | salesmanager |
      | salesmanager51@info.com | salesmanager |


  @FIDEXI-507 @wip
  Scenario Outline:US-001/TC-003 Verify that "Wrong login/password" should display with valid username and invalid password
    When User enter username "<username>"
    And User enter password "<password>"
    And User click login button
    Then User should see Wrong login password alert on the page
    Examples:Valid username and invalid password list
      | username                | password    |
      | posmanager10@info.com   | posmanage   |
      | posmanager21@info.com   | posmanage   |
      | salesmanager15@info.com | posmanage   |
      | salesmanager19@info.com | posmanage   |
      | posmanager10@info.com   | osmanager   |
      | posmanager21@info.com   | osmanager   |
      | salesmanager15@info.com | osmanager   |
      | salesmanager19@info.com | osmanager   |
      | posmanager10@info.com   | salesmanage |
      | posmanager21@info.com   | salesmanage |
      | salesmanager15@info.com | salesmanage |
      | salesmanager19@info.com | salesmanage |
      | posmanager10@info.com   | alesmanager |
      | posmanager21@info.com   | alesmanager |
      | salesmanager15@info.com | alesmanager |
      | salesmanager19@info.com | alesmanager |

  @FIDEXI-508 @wip
  Scenario Outline:US-001/TC-004 Verify that "Wrong login password" should display with invalid username and valid password
    When User enter username "<username>"
    And User enter password "<password>"
    And User click login button
    Then User should see Wrong login password alert on the page
    Examples:Invalid username and valid password list
      | username               | password     |
      | osmanager10@info.com   | posmanager   |
      | psmanager21@info.com   | posmanager   |
      | alesmanager15@info.com | posmanager   |
      | salesmanage19@info.com | posmanager   |
      | osmanager10@info.com   | salesmanager |
      | psmanager21@info.com   | salesmanager |
      | alesmanager15@info.com | salesmanager |
      | salesmanage19@info.com | salesmanager |
      | asdfasd                | salesmanager |
      | asdfasd                | posmanager   |

  @FIDEXI-509 @wip
  Scenario Outline:US-001/TC-005 Verifying that "Please fill out this field" message should be displayed if username is empty
    When User enter password "<password>"
    And User click login button
    Then User should see "Please fill out this field." message on username input
    Examples:Password list
      | password   |
      | posmanager |
      | asdfgh     |

  @FIDEXI-510 @wip
  Scenario Outline:US-001/TC-006 Verifying that "Please fill out this field" message should be displayed if password is empty
    When User enter username "<username>"
    And User click login button
    Then User should see "Please fill out this field." message on password input
    Examples:Username List
      | username                |
      | posmanager10@info.com   |
      | salesmanager15@info.com |
      | asdfgh                  |

  @FIDEXI-511 @wip
  Scenario:US-001/TC-007 Verify that User land on the ‘reset password’ page after clicking on the "Reset password" link
    When User clicks reset password link
    Then User should land reset password page and see "Reset password" inside title

  @FIDEXI-512 @wip
  Scenario Outline:US-001/TC-008 Verify that User see the password in bullet signs by default
    When User enter password "<password>"
    Then User should see password as bullet signs
    Examples:Password list
      | password   |
      | posmanager |
      | adfasdf    |

  @FIDEXI-513 @wip
  Scenario Outline:US-001/TC-009 Verify that the ‘Enter’ key of the keyboard is working correctly on the login page with valid credentials
    When User enter username "<username>"
    And User enter password "<password>"
    And user press Enter key
    Then User should Login and see "Odoo" in the title
    Examples:Username List
      | username                | password     |
      | posmanager25@info.com   | posmanager   |
      | posmanager32@info.com   | posmanager   |
      | salesmanager15@info.com | salesmanager |
      | salesmanager19@info.com | salesmanager |

  @FIDEXI-514 @wip
  Scenario Outline:US-001/TC-010 Verify that the ‘Enter’ key of the keyboard is working correctly on the login page with invalid credentails
    When User enter username "<username>"
    And User enter password "<password>"
    And user press Enter key
    Then User should see Wrong login password alert on the page
    Examples:Username List
      | username               | password    |
      | osmanager10@info.com   | posmanage   |
      | psmanager21@info.com   | posmanage   |
      | alesmanager15@info.com | posmanage   |
      | salesmanage19@info.com | posmanage   |
      | osmanager10@info.com   | salesmanage |
      | psmanager21@info.com   | salesmanage |
      | alesmanager15@info.com | salesmanage |
      | salesmanage19@info.com | salesmanage |

  @FIDEXI-515 @wip
  Scenario Outline:US-001/TC-011 Verify that the ‘Enter’ key of the keyboard is working correctly on the login page with  empty username filled password inbox
    When User enter password "<password>"
    And user press Enter key
    Then User should see "Please fill out this field." message on username input
    Examples:Password list
      | password   |
      | posmanager |
      | asdfgh     |

  @FIDEXI-516 @wip
  Scenario Outline:US-001/TC-012 Verify that the ‘Enter’ key of the keyboard is working correctly on the login page with  filled username and empty password inbox
    When User enter username "<username>"
    And user press Enter key
    Then User should see "Please fill out this field." message on password input
    Examples:Username List
      | username                |
      | posmanager10@info.com   |
      | salesmanager15@info.com |
      | asdfgh                  |




