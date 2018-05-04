package com.harmony.ios.pages;


import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ChooseResolutionOptionPage extends BasePage{

	final static Logger logger = Logger.getLogger(ChooseResolutionOptionPage.class);

	private static final By CHOOSE_YOUR_RESOLUTION_OPTION = MobileBy.AccessibilityId("Choose Your Resolution Method");
	private static final By OPTION_1 = MobileBy.AccessibilityId("Option 1: CHANGE ++");
	private static final By OPTION_2 = MobileBy.AccessibilityId("Option 2: NO CHANGE ++");
	private static final By OPTION_3 = MobileBy.AccessibilityId("Option 3: WHEN + WHEN NOT");
	private static final By OPTION_4 = MobileBy.AccessibilityId("Option 4: ANOTHER CHANGE");
	private static final By ICON1 = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"icon down\"])[1]");
	private static final By ICON2 = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"icon down\"])[2]");
	private static final By ICON3 = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"icon down\"])[3]");
	private static final By ICON4 = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"icon down\"])[4]");
	private static final By CHANGE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeTextView[1]");
	private static final By NOT_CHANGE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeTextView[1]");
	private static final By RADIO_1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]");
	private static final By RADIO_2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]");
	private static final By RADIO_3 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[3]");
	private static final By RADIO_4 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]");
	private static final By O1_HT1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextView[1]");
	private static final By O1_HT2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeTextView[1]");
	private static final By O2_HT1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeTextView[1]");
	private static final By O2_HT2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeTextView[1]");
	private static final By O3_HT1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeTextView[1]");
	private static final By O4_HT1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeTextView[1]");


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
		waitAndClickElement(ICON1, 5);
		return this;
	}

	public ChooseResolutionOptionPage clickIcon2(){
		waitAndClickElement(ICON2, 5);
		return this;
	}
	public ChooseResolutionOptionPage clickIcon3(){
		waitAndClickElement(ICON3, 5);
		return this;
	}
	public ChooseResolutionOptionPage clickIcon4(){
		waitAndClickElement(ICON4,5);
		return this;
	}

	public ChooseResolutionOptionPage matchChangeText(String blame) {
		String s = getText(CHANGE);
		if(blame.equalsIgnoreCase("my self")) {
			Assert.assertTrue(Harmony.get("Myself Solution").matches(s.trim()), "change++ text matched at Resolution page");
			Assert.assertTrue(Harmony.get("Option1 HowTo1").matches(getText(O1_HT1)), "Options1 HowTo1 text matched");
			Assert.assertTrue(Harmony.get("Option1 HowTo2").matches(getText(O1_HT2)), "Options1 HowTo2 text matched");
		}
		//String[] s1=   s.split("-");
		else if (blame.equalsIgnoreCase("chat")) {
			Assert.assertTrue(Harmony.get("chat_my_solution").matches(s.trim()), "My chat Solution box values matched");
		}
		else {
			Assert.assertTrue(Harmony.get("Solution").matches(s.trim()), "My Solution box values matched");
		}
		//matchText(CHANGE, "My Unique Solution Text Box Value Matched");
		return this;
	}

	public ChooseResolutionOptionPage matchNotChangeText(String blame) {
		String s = getText(NOT_CHANGE);
		//String[] s1=   s.split("-");
		if(blame.equalsIgnoreCase("my self")) {
			Assert.assertTrue(Harmony.get("Myself Alternative Solution").matches(s.trim()), "My Solution box values matched");
			Assert.assertTrue(Harmony.get("Option2 HowTo1").matches(getText(O2_HT1)), " Option2 HowTo1 matched");
			Assert.assertTrue(Harmony.get("Option2 HowTo2").matches(getText(O2_HT2)), " Option2 HowTo2 matched");
		}

		Assert.assertTrue(Harmony.get("Myself Alternative Solution").matches(s.trim()), "My Solution box values matched");
		//matchText(CHANGE, "My Unique Solution Text Box Value Matched");
		return this;
	}

	public ChooseResolutionOptionPage matchOption3Text() {
		Assert.assertTrue(Harmony.get("Option3 HowTo1").matches(getText(O3_HT1)), "Option3 HowTo1 Twxt mathced");
		return this;
	}

	public ChooseResolutionOptionPage matchOption4Text() {
		Assert.assertTrue(Harmony.get("Option4 HowTo1").matches(getText(O4_HT1)), "Option4 HowTo1 Twxt mathced");
		return this;
	}

	public ChooseResolutionOptionPage selectRadioButton() {
		clickElement(RADIO_1);
		logger.info("selected 1st Radio Button");
		goToNext();
		return this;
	}

	public ChooseResolutionOptionPage dismissCongratulation() throws InterruptedException {
		syncAction(5000);
		dismissAlertBoxes("Congratulations");
		syncAction(5000);
		dismissAlertBoxes("Are you sure?");
		return this;
	}
}
