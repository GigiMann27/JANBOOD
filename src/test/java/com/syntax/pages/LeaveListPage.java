package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LeaveListPage extends BaseClass {

	@FindBy(xpath = "//b[contains(text(),'Leave')]")
	public static WebElement clickLeave;

	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveList']")
	public static WebElement clickLeveList;

	@FindBy(xpath = "")
	public static WebElement fromDate;

	@FindBy(xpath = "")
	public static WebElement toDate;

	@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	public static WebElement checkAll;

	@FindBy(xpath = "//input[@id='leaveList_txtEmployee_empName']")
	public static WebElement EmpName;

	@FindBy(xpath = "//select[@id='leaveList_cmbSubunit']")
	public static WebElement subUnit;

	@FindBy(xpath = "//input[@id='btnSearch']")
	public static WebElement clickSearch;

	@FindBy(xpath = "//input[@id='btnSave']")
	public static WebElement save;

	@FindBy(xpath = "//table[@class='table hover']/tbody")
	public static WebElement table;

	public LeaveListPage() {
		PageFactory.initElements(driver, this);
	}

}
