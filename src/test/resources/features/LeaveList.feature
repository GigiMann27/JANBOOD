Feature: LeaveList
@LeaveList
  Scenario Outline: 
    Given I login into HRM
    When I click Leave Module
    And I click Leave list
    And I enter "<FromDate>", "<ToDate>" , and "<empName>"
    And I click all from show leave with status
    And I select "<SubUnit>" that matches the employee credentials
    And I click Search
    And I verify that "<empName>" name appears, "<leaveType>" is displayed, and "<days>" matches the amount assigned for that employee
    Then click save

    Examples: 
      | FromDate   | ToDate     | empName        | SubUnit | leaveType    | days |
      | 2018-12-01 | 2018-12-10 | Steven Edwards | IT      | FMLA US      | 6.00 |
      | 2018-12-01 | 2018-12-10 | Steven Edwards | Sales   | Paternity Us | 6.00 |
