Feature: OrangeHRM.com System Users Table Tests

  Scenario: Login test
    Given that I'm on Login page
    When I enter username "Admin"
      And I enter password "admin123"
    Then I get logged in

  Scenario: Add new User
    Given that I'm on System Users page
    When I press add button
      And I enter employee name "Harry Kane"
      And enter username "Andrii.Baranichenko"
      And enter password "iamfrom$ka95"
      And confirm password "iamfrom$ka95"
      And click save button
    Then I see new user "Andrii.Baranichenko" in the table

  Scenario: Search for user
    Given that I'm on System Users page
    When I press search button entering the username
    Then I see username in the short-table

  Scenario: Delete a user
    Given that I'm on System Users page
    When I delete user "Andrii.Baranichenko"
    Then I see "Andrii.Baranichenko" user deleted