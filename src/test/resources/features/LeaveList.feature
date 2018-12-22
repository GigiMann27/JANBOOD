
Feature: LeaveList

  Scenario Outline: 
    Given I login into HRM
    When I click Leave Module
    And I click Leave list
    And I enter "<From Date>", "<To Date>" , and "<empName>"
    And I click all from show leave with status
    And I select "<Sub Unit>" that matches the employee credentials
    And I click Search
    And I verify that "<empName>" name appears, "<leave type>" is displayed, and "<days>" matches the amount assigned for that employee
    Then click save

    Examples: 
      | From Date  | To Date    | empName        | Sub Unit | leave type   | days |
      | 2018-12-01 | 2018-12-10 | Steven Edwards | IT       | FMLA US      | 6.00 |
      | 2018-12-01 | 2018-12-10 | Steven Edwards | Sales    | Paternity Us | 6.00 |
