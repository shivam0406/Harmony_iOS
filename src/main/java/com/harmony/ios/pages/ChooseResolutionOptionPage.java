package com.harmony.ios.pages;


import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ChooseResolutionOptionPage extends BasePage{

	final static Logger logger = Logger.getLogger(ChooseResolutionOptionPage.class);

	private static final By CHOOSE_YOUR_RESOLUTION_OPTION = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	private static final By OPTION_1 = MobileBy.AccessibilityId("Option 1: CHANGE ++");
	private static final By OPTION_2 = MobileBy.AccessibilityId("Option 2: NOT CHANGE ++");
	private static final By OPTION_3 = MobileBy.AccessibilityId("Option 3: WHEN + WHEN NOT");
	private static final By OPTION_4 = MobileBy.AccessibilityId("Option 4: ANOTHER CHANGE");
	private static final By CHANGE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeTextView[1]");
	private static final By NOT_CHANGE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeTextView[1]");
	private static final By RADIO_1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]");
	private static final By RADIO_2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]");
	private static final By RADIO_3 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[3]");
	private static final By RADIO_4 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]");



	public ChooseResolutionOptionPage(){
		assertCurrentPage(CHOOSE_YOUR_RESOLUTION_OPTION);
	}

	public ChooseResolutionOptionPage Option1() {
		assertCurrentPage(OPTION_1);
		return this;
	}

	public ChooseResolutionOptionPage Option2() {
		assertCurrentPage(OPTION_2);
		return this;
	}

	public ChooseResolutionOptionPage Option3() {
		assertCurrentPage(OPTION_3);
		return this;
	}

	public ChooseResolutionOptionPage Option4() {
		assertCurrentPage(OPTION_4);
		return this;
	}

	public ChooseResolutionOptionPage clickIcon1(){
		waitAndClickElement(OPTION_1, 1);
		return this;
	}

	public ChooseResolutionOptionPage clickIcon2(){
		waitAndClickElement(OPTION_2, 1);
		return this;
	}
	public ChooseResolutionOptionPage clickIcon3(){
		waitAndClickElement(OPTION_3, 1);
		return this;
	}
	public ChooseResolutionOptionPage clickIcon4(){
		waitAndClickElement(OPTION_4,1);
		return this;
	}

	public ChooseResolutionOptionPage matchChangeText() {

		String s = getText(CHANGE);
		String[] s1=   s.split("-");
		Assert.assertTrue(Harmony.get("Solution").matches(s1[1].trim()), "My Solution box values matched");
		//matchText(CHANGE, "My Unique Solution Text Box Value Matched");
		return this;
	}

	public ChooseResolutionOptionPage matchNotChangeText() {
		String s = getText(NOT_CHANGE);
		String[] s1=   s.split("-");
		Assert.assertTrue(Harmony.get("Alternative Solution").matches(s1[1].trim()), "My Solution box values matched");
		//matchText(CHANGE, "My Unique Solution Text Box Value Matched");
		return this;
	}

	public ChooseResolutionOptionPage selectRadioButton() {
		clickElement(RADIO_1);
		logger.info("selected 1st Radio Button");
		goToNext();
		return this;
	}
}
