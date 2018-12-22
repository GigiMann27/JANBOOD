package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LeaveEntitlementPage extends BaseClass {

	@FindBy(xpath = "//b[contains(text(),'Leave')]")
	public WebElement clickLeave;

	@FindBy(xpath = "//a[@id='menu_leave_Entitlements']")
	public WebElement clickEntitle;

	@FindBy(xpath = "//a[@id='menu_leave_addLeaveEntitlement']")
	public WebElement ClickAddEnt;

	@FindBy(xpath = "//input[@id='entitlements_filters_bulk_assign']")
	public WebElement AddMutlEmp;

	@FindBy(xpath = "//input[@id='entitlements_employee_empName']")
	public WebElement EmpName;

	@FindBy(xpath = "//select[@id='entitlements_leave_type']")
	public WebElement leaveType;

	@FindBy(xpath = "//select[@id='period']")
	public WebElement leavePrd;

	@FindBy(xpath = "//input[@id='entitlements_entitlement']")
	public WebElement EnterEntitlement;

	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement saveEntile;

	@FindBy(xpath = "//input[@id='dialogUpdateEntitlementConfirmBtn']")
	public WebElement confirmAdd;

	@FindBy(xpath = "//td[contains(text(),'Added')]")
	public WebElement confirmMessage;

	@FindBy(xpath = "//li[@class='ac_even']//strong[contains (text(), 'Steven Edwards')]")
	public WebElement dropdown;

	public LeaveEntitlementPage() {
		PageFactory.initElements(driver, this);
	}

}
