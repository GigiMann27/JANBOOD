package com.syntax.utils;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

	public static void enterValue(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static WebElement waiting(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void click(WebElement element) {
		WebElement elm = waiting(element);
		elm.click();
	}

	public static void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	public static void selectValue(WebElement element, String Value) {
		Select obj = new Select(element);
		obj.selectByVisibleText(Value);
	}

	public static void verificationDisplayed(WebElement element) {
		boolean elm = element.isDisplayed();
		Assert.assertTrue(elm);
	}

	public static void verificationEquals(WebElement element, String expected) {
		boolean elm = element.isDisplayed();
		Assert.assertEquals(element, expected);
	}

	public static void Action(WebElement e, String a) {
		Actions obj = new Actions(driver);
		obj.moveToElement(e).click().sendKeys(Keys.CLEAR).sendKeys(a).build().perform();
		obj.sendKeys(Keys.ENTER).build().perform();
	}
	
	  public static void handleAlerts() {
          Alert alert = driver.switchTo().alert();
          alert.accept();
      }

    public static void jsClick(WebElement element) {
          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("arguments[0].click();", element);
      }
    
    public static String dropDownSelectVerify(WebElement element, String value) {
        Select obj = new Select(element);
        obj.selectByVisibleText(value);
        String text = obj.getFirstSelectedOption().getText();
        return text;
    }
}
