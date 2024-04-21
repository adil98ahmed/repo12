Feature: Add and delete

  Scenario: xyz
    Given Login to page using "Admin","admin123"
    When I click on Admin tab
    And I add new user with data:
    | User Role   | Employee Name        | Status   |  Username              | Password        |
    | Admin       | Ranga  Akunuri       | Enabled  |  adel@mailinator.com   | 123My#Password  |
    Then I verify that the user is added
    And I search for username "adel@mailinator.com"
    And I delete created user
    Then I verify that the user is deleted