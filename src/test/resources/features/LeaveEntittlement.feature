#Author: your.email@your.domain.com
Feature: Leave Entitlement

 Background: 
 Given I am already logged in

 Scenario: Add all default employees and select FMLA US leave type
   When I click Leave Module
   And click add Entitlements
   And check "Add to multiple employees"
   And select "FMLA US" for leave type
   And I Enter "50" for Entitlement
   Then I Confirm that all default employees have new Entitlements added for FMLA US

 Scenario: Add 1 default employees to any leave type besides FMLA US leave type
   When I click Leave Module
   And click add Entitlements
   And Add one "Steven Edwards"
   And add employee to leave type "Vacation US"
   And I Enter "50" Entitlement
   And I click save
   Then I Confirm that particular default employee has new Entitlements added for new Leave Type
   