package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AssignLeavePage extends BaseClass {
	@FindBy(xpath = "//b[contains(text(),'Leave')]")
	public WebElement leaveLink;

	@FindBy(xpath="//a[@id='menu_leave_assignLeave']")
    public WebElement leaveAssign;

	@FindBy(xpath = "//input[@name='assignleave[txtEmployee][empName]']")
	public WebElement empName;

	@FindBy(xpath = "//select[@id='assignleave_txtLeaveType']")
	public WebElement leaveType;

	@FindBy(xpath = "//input[@id='assignleave_txtFromDate']")
	public WebElement fromCalendar;

	@FindBy(xpath = "//input[@id='assignleave_txtToDate']")
	public WebElement toCalendar;

	@FindBy(xpath = "//input[@id='assignBtn']")
	public WebElement assignBtn;

	@FindBy(xpath = "//div[@id='assignleave_leaveBalance']")
	public WebElement text;
	
	@FindBy(xpath = "//ol//li[4]//img[1]")
	public WebElement clickfromcaln;
	
	@FindBy(xpath = "//ol//li[5]//img[1]")
	public WebElement clicktocaln;

	public AssignLeavePage() {
		PageFactory.initElements(driver, this);

	}
}
