package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeaveListPage {

	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveList']")
	public WebElement leaveLink;
	
	@FindBy(xpath = "//ol//li[1]//img[1]")
	public WebElement fromCalendar;
	
	@FindBy(xpath = "//ol//li[2]//img[1]")
	public WebElement toCalendar;
	
	@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	public WebElement checkAll;
	
	@FindBy(xpath = "//input[@id='btnSearch']")
	public WebElement searchBtn;

}
