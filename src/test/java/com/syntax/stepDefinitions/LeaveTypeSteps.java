package com.syntax.stepDefinitions;

import com.syntax.pages.AssignLeavePage;
import com.syntax.utils.CommonMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveTypeSteps {

	AssignLeavePage assignleavepage;

	@When("^I click Assign Leave$")
	public void i_click_Assign_Leave() throws Throwable {
		assignleavepage = new AssignLeavePage();
		CommonMethods.click(assignleavepage.leaveAssign);
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String EmpName) throws Throwable {
		CommonMethods.enterValue(assignleavepage.empName, EmpName);
	}

	@When("^I select \"([^\"]*)\"$")
	public void i_select(String levType) throws Throwable {
		CommonMethods.selectValue(assignleavepage.leaveType, levType);

	}

	@Then("^Balance of (\\d+) should be present for employee$")
	public void balance_of_should_be_present_for_employee(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I enter FMLA \"([^\"]*)\" as the from date that doesn’t exceed fifty days$")
	public void i_enter_FMLA_as_the_from_date_that_doesn_t_exceed_fifty_days(String fromdate) throws Throwable {
		assignleavepage.fromCalendar.click();
		CommonMethods.enterValue(assignleavepage.fromCalendar, fromdate);
		assignleavepage.clickfromcaln.click();

	}

	@Then("^I enter FMLA \"([^\"]*)\"  as the to date$")
	public void i_enter_FMLA_as_the_to_date(String toDate) throws Throwable {
		CommonMethods.enterValue(assignleavepage.toCalendar, toDate);
		assignleavepage.clicktocaln.click();
	}

	@When("^I select any leave type \"([^\"]*)\"$")
	public void i_select_any_leave_type(String leavetype2) throws Throwable {
		CommonMethods.selectValue(assignleavepage.leaveType, leavetype2);
	}
	
	@Then("^click the assign button$")
	public void click_the_assign_button() throws Throwable {
		CommonMethods.click(assignleavepage.assignBtn);
	}

	@When("^I enter Paternity US \"([^\"]*)\" as the from date that doesn’t exceed fifty days$")
	public void i_enter_Paternity_US_as_the_from_date_that_doesn_t_exceed_fifty_days(String fromdate) throws Throwable {
		CommonMethods.enterValue(assignleavepage.fromCalendar, fromdate);
		assignleavepage.clickfromcaln.click();
	}

	@When("^I enter Paternity US \"([^\"]*)\"  as the to date$")
	public void i_enter_Paternity_US_as_the_to_date(String toDate) throws Throwable {
		Thread.sleep(2000);
		assignleavepage.toCalendar.click();
		assignleavepage.toCalendar.clear();
		CommonMethods.enterValue(assignleavepage.toCalendar, toDate);
		assignleavepage.clicktocaln.click();
	}
}
