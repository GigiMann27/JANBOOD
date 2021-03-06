#Author gmann
Feature: AssignLeave

  Scenario: Using FMLA US leave type
    Given I login into HRM
    When I click Leave Module
    And I click Assign Leave
    And I enter "Steven Edwards"
    And I select "FMLA US"
    And I enter FMLA "2018-12-01" as the from date that doesn’t exceed fifty days
    And I enter FMLA "2019-01-22"  as the to date
    And click the assign button

  Scenario: Using any leave type
    Given I login into HRM
    When I click Leave Module
    And I click Assign Leave
    And I enter "Steven Edwards"
    And I select any leave type "Paternity US"
    And I enter Paternity US "2018-12-03" as the from date that doesn’t exceed fifty days
    And I enter Paternity US "2018-01-"09"  as the to date
    And click the assign button
