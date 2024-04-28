Feature: Add and Delete
  Scenario: Gefndlfknvdf
    Given I have the uer credentials for user
    When I set url "url" and end point "endPoint"
    And I get body for Api call from "testData.json"
    And I perform "POST" request
    Then I verify that the status code is "200"
    And I store the id of created user
    And I clear All
    Given I have the uer credentials for user
    When I set url "url" and end point "endPoint"
    And I build body with new ID
    And I perform "Delete" request
    Then I verify that the status code is "200"

