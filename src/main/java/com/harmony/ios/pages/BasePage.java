package com.harmony.ios.pages;

import com.harmony.ios.exceptions.PageNotCurrentException;
import com.harmony.ios.utils.TestUtils;
import com.harmony.ios.utils.WebDriverFactory;
import com.sun.xml.internal.rngom.parse.host.Base;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class BasePage {

	final static Logger logger = Logger.getLogger(BasePage.class);

	IOSDriver driver = WebDriverFactory.getIOSDriver();

	protected static final Hashtable<String, String> Harmony = new Hashtable<>();

	final int DEFAULT_WAIT_TIME_FOR_ELEMENT = 30;

	public static final By NEXT = MobileBy.AccessibilityId("Next");
	public static final By DONE = MobileBy.AccessibilityId("Done");
	public static final By DONE2 = MobileBy.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
	public static final By TEXT_VIEW = MobileBy.xpath("//XCUIElementTypeTextView");
	public static final By MOVE_TO_CONFLICT= MobileBy.AccessibilityId("My Decisions");
	public static final By SHARED_DECISIONS = MobileBy.AccessibilityId("Shared Decisions");

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
		driver.findElement(locator).click();
		driver.findElement(TEXT_VIEW).sendKeys(value);
	}

	public void setValueswithHideKeyboard(By locator, String values){
		WebElement element = driver.findElement(locator);
		element.sendKeys(values);
		driver.hideKeyboard();
	}

    public void setValueswithHideKeyboard1(By locator, String values){
        WebElement element = driver.findElement(locator);
        element.sendKeys(values);
    }

	public void waitAndClickElement(By locator, int waitTimeInSec) {
		WebElement element = waitAndFindElement(locator, waitTimeInSec);;
		element.click();
	}

	public void getKeyBoardAndHide(String value) throws InterruptedException {
		driver.getKeyboard().sendKeys(value);
		syncAction(5000);
		driver.hideKeyboard();
	}

	public void dismissAlertBoxes(String text) {
		Assert.assertTrue(driver.switchTo().alert().getText().contains(text));
		driver.switchTo().alert().dismiss();
	}

	public void allowAlertBoxes(String text) {
		Assert.assertTrue(driver.switchTo().alert().getText().contains(text));
		driver.switchTo().alert().accept();
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
		Harmony.put(nameOfBox, value);
		return this;
	}

	public BasePage enterValueinBoxesWithoutDone(By locator, String value, String nameOfBox) throws InterruptedException {
		logger.info("Enter Value in " +nameOfBox+ " Box");
        setValueswithHideKeyboard1(locator, value);
		syncAction(2000);
		Harmony.put(nameOfBox, value);
		return this;
	}

	public BasePage matchText(By locator, String message, String key){
		//Assert.assertTrue(Harmony.contains(getText(locator).toString()), message);
		Assert.assertTrue(Harmony.get(key).matches(getText(locator).toString()), message);
		return this;
	}

	public BasePage clickAndMatchText(By locator, String message, String key) {
		clickElement(locator);
		Assert.assertTrue(Harmony.get(key).matches(getText(TEXT_VIEW)), message);
		clickElement(TEXT_VIEW);
		clickElement(DONE);
		return this;
	}

	public BasePage containText(By locator, String message, String key) {
		Assert.assertTrue(Harmony.get(key).matches(getText(locator).split("\\(")[1].split("\\)")[0].toString()));
		return this;
	}

	public BasePage goToNext(){
		clickElement(NEXT);
		return this;
	}

	public BasePage refreshPage(){
		//driver.swipe(200,200,200,700,3);
		return this;
	}

	public BasePage swipeLeft() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap scrollObject = new HashMap();
		scrollObject.put("direction", "left");
		js.executeScript("mobile: swipe", scrollObject);
		return this;
	}

	public BasePage swipeDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap scrollObject = new HashMap();
		scrollObject.put("direction", "down");
		js.executeScript("mobile: swipe", scrollObject);
		return this;
	}

	public BasePage scrollDown() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		HashMap scrollObject = new HashMap();
//		scrollObject.put("direction", "up");
//		js.executeScript("mobile: scroll", scrollObject);
		//(new TouchAction(driver)).press({int x: 202, int y: 88}).moveTo({x: -3: y: 225}).release();
//		TouchAction touchAction = new TouchAction(driver);
//		Point p = driver.findElement(By.id("Toolbar Done Button")).getLocation();
////touchAction.tap(p.getX(), p.getY());
		//driver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Done");
		driver.hideKeyboard(HideKeyboardStrategy.TAP_OUTSIDE);
		syncAction(2000);
		return this;

	}

	public BasePage getPageIndicatorValue(By locator, String value) {
		Assert.assertEquals(driver.findElement(locator).getAttribute("value"), value, "Both Attributes value matched");
		return this;
	}

	public BasePage containTextUsingAttribute(By locator, String value) {
		Assert.assertTrue(driver.findElement(locator).getAttribute("value").contains(value), "Attribute value matched");
		return this;
	}


}
