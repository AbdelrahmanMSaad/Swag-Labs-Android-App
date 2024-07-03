Feature: Login

  Scenario: Test Valid Login
    Given User opens the application
    When User passes "standard_user" as a valid username
    When User passes "secret_sauce" as a valid password
    When User clicks on login button with the valid credentials
    Then Home page opens and home page app logo is displayed
    Then Expected results are asserted

  Scenario: Test logging without user name
    Given User opens the application
    When User passes "secret_sauce" as a valid password
    When User clicks on login button with the invalid credentials
    Then Error message stating that username is required is displayed
    Then Expected results are asserted

  Scenario: Test logging without password
    Given User opens the application
    When User passes "standard_user" as a valid username
    When User clicks on login button with the invalid credentials
    Then Error message stating that password is required is displayed
    Then Expected results are asserted

  Scenario Outline: Test logging with invalid credentials
    Given User opens the application
    When User passes "<username>" as a valid username
    When User passes "<password>" as a valid password
    When User clicks on login button with the invalid credentials
    Then Error message stating that credentials are invalid is displayed
    Then Expected results are asserted

    Examples:
      | username      | password     |
      | standard_user | invalid      |
      | invalid       | secret_sauce |
      | invalid       | invalid      |


