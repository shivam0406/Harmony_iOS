package com.harmony.ios.pages;

import com.harmony.ios.exceptions.PageNotCurrentException;
import com.harmony.ios.utils.TestUtils;
import com.harmony.ios.utils.WebDriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BasePage {

	final static Logger logger = Logger.getLogger(BasePage.class);

	IOSDriver driver = WebDriverFactory.getIOSDriver();

	public static final List<String> Harmony = new ArrayList<String>();

	final int DEFAULT_WAIT_TIME_FOR_ELEMENT = 30;

	public static final By NEXT = MobileBy.AccessibilityId("Next");
	public static final By DONE = MobileBy.AccessibilityId("Done");

	public void assertCurrentPage(By pageIdentifier) {
		try{
			waitForPresence(pageIdentifier);
		} catch (Exception e) {
			throw new PageNotCurrentException(TestUtils.getCallerClassNameFromThread() + " is not the current app", e);
		}
	}

	public void waitForPresence(By locator) {
		waitForPresence(locator, DEFAULT_WAIT_TIME_FOR_ELEMENT);
	}

	public void waitForPresence(By locator, int waitTimeInSec) {
		WebDriverWait wait = new WebDriverWait(driver, waitTimeInSec);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}


	public void waitForNotPresence(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIME_FOR_ELEMENT);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public void clickElement(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}

	public void setValues(By locator, String value){
		WebElement element = driver.findElement(locator);
		element.sendKeys(value);
	}

	public void setValueswithHideKeyboard(By locator, String values){
		WebElement element = driver.findElement(locator);
		element.sendKeys(values);
		driver.hideKeyboard();
	}

	public void waitAndClickElement(By locator, int waitTimeInSec) {
		WebElement element = waitAndFindElement(locator, waitTimeInSec);;
		element.click();
	}

	public BasePage syncAction(long milliSec) throws InterruptedException {
		Thread.sleep(milliSec);
		return this;
	}

	public String getText(By locator){
		String conflictName = driver.findElement(locator).getText();
		return conflictName;
	}
	public void clickElement(WebElement element) {
		element.click();
	}

	public boolean isElementPresent(By by) {
		List<WebElement> eleList = driver.findElements(by);
		if (eleList.size() > 0)
			return true;
		return false;
	}

	public WebElement waitAndFindElement(By locator) {
		waitForPresence(locator);
		logger.info("Wait for element succeeded");
		return driver.findElement(locator);
	}

	public WebElement waitAndFindElement(By locator, int waitTimeInSec) {
		waitForPresence(locator, waitTimeInSec);
		logger.info("Wait for element succeeded");
		return driver.findElement(locator);
	}


	public BasePage done() {
		logger.info("Clicking on Done button");
		clickElement(DONE);
		return this;
	}

	public BasePage enterValueinBoxes(By locator, String value, String nameOfBox) throws InterruptedException {
		logger.info("Enter Value in " +nameOfBox+ " Box");
		setValues(locator, value);
		syncAction(2000);
		done();
		Harmony.add(value);
		return this;
	}

	public BasePage matchText(By locator, String message){
		Assert.assertTrue(Harmony.contains(getText(locator).toString()), message);
		return this;
	}

	public BasePage goToNext(){
		clickElement(NEXT);
		return this;
	}

	public BasePage refreshPage(){
		driver.swipe(200,200,200,700,3);
		return this;
	}


}
