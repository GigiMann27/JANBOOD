package com.syntax.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.syntax.pages.LeaveListPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveListSteps extends BaseClass {

	LeaveListPage leavePage;
	SoftAssert asrt;

	@When("^I click Leave list$")
	public void i_click_Leave_list() throws Throwable {
		leavePage = new LeaveListPage();
		CommonMethods.click(leavePage.clickLeveList);
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\" , and \"([^\"]*)\"$")
	public void i_enter_and(String fDate, String tDate, String empName) throws Throwable {
		Thread.sleep(4000);

		// leavePage.toDate.click();
		CommonMethods.enterValue(leavePage.fromDate, fDate);

		// Thread.sleep(3000);
		// leavePage.toDate.click();
		// Thread.sleep(3000);
		//
		// leavePage.toDate.click();
		// Thread.sleep(3000);

		CommonMethods.enterValue(leavePage.toDate, tDate);
		Thread.sleep(3000);
		leavePage.totablelink.click();

		CommonMethods.enterValue(leavePage.EmpName, empName);
		leavePage.EmpName.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@When("^I click all from show leave with status$")
	public void i_click_all_from_show_leave_with_status() throws Throwable {
		CommonMethods.click(leavePage.checkAll);
	}

	@When("^I select \"([^\"]*)\" that matches the employee credentials$")
	public void i_select_that_matches_the_employee_credentials(String unit) throws Throwable {
		CommonMethods.selectValue(leavePage.subUnit, unit);
	}

	@When("^I click Search$")
	public void i_click_Search() throws Throwable {
		CommonMethods.click(leavePage.clickSearch);
	}

	@When("^I verify that \"([^\"]*)\" name appears, \"([^\"]*)\" is displayed, and \"([^\"]*)\" matches the amount assigned for that employee$")
	public void i_verify_that_name_appears_is_displayed_and_matches_the_amount_assigned_for_that_employee(
			String empName, String leaveType, String days) throws Throwable {

		asrt = new SoftAssert();

		List<WebElement> rows = leavePage.table.findElements(By.tagName("tr"));

		for (int x = 1; x < rows.size(); x++) {
			WebElement row = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr/[" + x + "]"));
			String rowData = row.getText();

			if (rowData.contains(empName)) {
				asrt.assertTrue(true, empName);
			}

			if (rowData.contains(leaveType)) {
				asrt.assertTrue(true, leaveType);
			}

			if (rowData.contains(days)) {
				asrt.assertTrue(true, days);
			}

		}
		asrt.assertAll();
	}

	@Then("^click save$")
	public void click_save() throws Throwable {
		CommonMethods.click(leavePage.save);
	}

}
