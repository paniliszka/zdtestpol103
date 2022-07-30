Feature: Authentication to e-commerce
  As an user I want to sig in to the app, so I can order

  Scenario: Successful logon
    Given Home page is open
    When I click on Sign In button
    And I type in logon credentials "test user12@test.com"
    And I type in password "passwords"
    Then Logon is successful

    Scenario: Unsuccessful logon
      Given Home page is open
      When I click on Sign In button
      And I type logon credentials "test"
      And I type in password "something"
      Then Error message is presented