Feature:
  As a user I want login

  Scenario: login with correct email and password
    Given user is on login page
    When user enter email as "test@o2.pl" and password as "qwe123"
    And user click login button
    Then user should see my account page

  Scenario Outline: login with email and password from examples
    Given user is on login page
    When user enter <email> and <password>
    And user click login button
    Then user should see my account page

    Examples:
      | email  | password |
      | test@o2.pl | qwe123  |
      | hhgd | gfgd |
