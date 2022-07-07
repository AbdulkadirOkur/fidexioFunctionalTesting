Feature:As a user, I should be able to log out.
  AC1- User can log out and ends up in login page.
  AC2- The user can not go to the home page again by clicking the step back button after successfully logged out.


  @FIDEXI-518
  Scenario Outline:US-002/TC-001 Verify that PosManager User can be able to log out
    Given PosManager is already logged in with "<Username>" and "<Password>"
    When open user dropdown
    When User click logout link
    Then User should log out and land on login page
    Examples:
      | Username              | Password   |
      | posmanager10@info.com | posmanager |
      | posmanager12@info.com | posmanager |
      | posmanager15@info.com | posmanager |
      | posmanager18@info.com | posmanager |

  @FIDEXI-519
  Scenario Outline:US-002/TC-002 Verify that SalesManager User can be able to log out
    Given SalesManager is already logged in with "<Username>" and "<Password>"
    When open user dropdown
    When User click logout link
    Then User should log out and land on login page
    Examples:
      | Username                | Password     |
      | salesmanager15@info.com | salesmanager |
      | salesmanager17@info.com | salesmanager |
      | salesmanager21@info.com | salesmanager |
      | salesmanager29@info.com | salesmanager |

  @FIDEXI-520
  Scenario Outline:US-002/TC-003 Verify that Post Manager can not go to the home page again by clicking the step back button after successfully logged out.
    Given PosManager is already logged in with "<Username>" and "<Password>"
    When open user dropdown
    When User click logout link
    Then click step back button
    Then User should not go to home page after logged out
    Examples:
      | Username              | Password   |
      | posmanager10@info.com | posmanager |
      | posmanager12@info.com | posmanager |
      | posmanager15@info.com | posmanager |
      | posmanager18@info.com | posmanager |

  @FIDEXI-521 @wip
  Scenario Outline:US-002/TC-004 Verify that SalesManager can not go to the home page again by clicking the step back button after successfully logged out.
    Given SalesManager is already logged in with "<Username>" and "<Password>"
    When open user dropdown
    When User click logout link
    Then click step back button
    Then User should not go to home page after logged out
    Examples:
      | Username                | Password     |
      | salesmanager15@info.com | salesmanager |
      | salesmanager17@info.com | salesmanager |
      | salesmanager21@info.com | salesmanager |
      | salesmanager29@info.com | salesmanager |

