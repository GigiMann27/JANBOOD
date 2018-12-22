package com.syntax.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.syntax.pages.LeaveEntitlementPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveEntitlementSteps extends BaseClass {

	LeaveEntitlementPage leveEntitle;

	@When("^I click Leave Module$")
	public void i_click_Leave_Module() throws Throwable {
		leveEntitle = new LeaveEntitlementPage();
		CommonMethods.click(leveEntitle.clickLeave);
	}

	@When("^click add Entitlements$")
	public void click_add_Entitlements() throws Throwable {
		CommonMethods.click(leveEntitle.clickEntitle);
		CommonMethods.click(leveEntitle.ClickAddEnt);
	}

	@When("^check \"([^\"]*)\"$")
	public void check(String arg1) throws Throwable {
		CommonMethods.click(leveEntitle.AddMutlEmp);
	}

	@When("^select \"([^\"]*)\" for leave type$")
	public void select_for_leave_type(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I Enter \"([^\"]*)\" for Entitlement$")
	public void i_Enter_for_Entitlement(String value) throws Throwable {
		CommonMethods.enterValue(leveEntitle.EnterEntitlement, value);

	}

	@Then("^I Confirm that all default employees have new Entitlements added for FMLA US$")
	public void i_Confirm_that_all_default_employees_have_new_Entitlements_added_for_FMLA_US() throws Throwable {
		CommonMethods.verificationDisplayed(leveEntitle.confirmMessage);
	}

	@When("^Add one \"([^\"]*)\"$")
	public void add_one(String EmpName) throws Throwable {
		// Thread.sleep(3000);
		// CommonMethods.enterValue(leveEntitle.EmpName, EmpName);
		// Thread.sleep(3000);
		CommonMethods.actions(leveEntitle.EmpName, EmpName);

		// Actions obj= new Actions(driver);
		// obj.contextClick(leveEntitle.dropdown);
	}

	@When("^add employee to leave type \"([^\"]*)\"$")
	public void add_employee_to_leave_type(String LeaveType) throws Throwable {
		CommonMethods.selectValue(leveEntitle.leaveType, LeaveType);
	}

	@When("^I Enter \"([^\"]*)\" Entitlement$")
	public void i_Enter_Entitlement(String Value) throws Throwable {
		CommonMethods.enterValue(leveEntitle.EnterEntitlement, Value);
	}

	@When("^I click save$")
	public void i_click_save() throws Throwable {
		Thread.sleep(3000);
		leveEntitle.saveEntile.click();
	}

	@Then("^I Confirm that particular default employee has new Entitlements added for new Leave Type$")
	public void i_Confirm_that_particular_default_employee_has_new_Entitlements_added_for_new_Leave_Type() throws InterruptedException {
	
		Thread.sleep(2000);
		leveEntitle.confirmAdd.click();
		
		boolean confirm = leveEntitle.confirmMessage.isDisplayed();
		Assert.assertTrue(confirm);
		
	}
}
