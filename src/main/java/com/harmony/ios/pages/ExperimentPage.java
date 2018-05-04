package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ExperimentPage extends BasePage {

	final static Logger logger = Logger.getLogger(ExperimentPage.class);

	private static final By STEP_5A = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Step 5a Experiment\"]");
	private static final By STEP_5B = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Step 5b Experiment\"]");
	private static final By TEST_CONFLICT_DATA_RESOLVED = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	private static final By WHY_1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]");
	private static final By WAHT_FOR = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]");
	private static final By WHY_2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]");
	private static final By HOW_TO = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[5]/XCUIElementTypeButton[1]");
	private static final By WHY_3 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[6]/XCUIElementTypeButton[1]");
	private static final By WHY_1_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextView[1]");
	private static final By WHAT_FOR_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeTextView[1]");
	private static final By WHY_2_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeTextView[1]");
	private static final By HOW_TO_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeTextView[1]");
	private static final By SAVE_DATA_ALERT_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]");
	private static final By OK = MobileBy.AccessibilityId("OK");
	private static final By HOW_TO_TEXT_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeTextView[1]");
	public ExperimentPage(String blame){
		if(blame.matches("no one")) {
			assertCurrentPage(STEP_5A);
		}
		else {
			assertCurrentPage(STEP_5B);
		}
	}

	public ExperimentPage verifyTestConflictDataResolvedPage() {
		assertCurrentPage(TEST_CONFLICT_DATA_RESOLVED);
		return this;
	}

	public ExperimentPage verifyWhy1() {
		assertCurrentPage(WHY_1);
		return this;
	}

	public ExperimentPage verifyWhy2() {
		assertCurrentPage(WHY_2);
		return this;
	}

	public ExperimentPage verifyWhatFor() {
		assertCurrentPage(WAHT_FOR);
		return this;
	}

	public ExperimentPage verifyWhy3() {
		assertCurrentPage(WHY_3);
		return this;
	}

	public ExperimentPage verifyHowTo() {
		assertCurrentPage(HOW_TO);
		return this;
	}

	public ExperimentPage matchHowToData() {
		waitAndClickElement(HOW_TO, 1);
		Assert.assertTrue(Harmony.get("Solution").matches(getText(HOW_TO_DATA).split("\\s+")[4]));
		logger.info("How To Data matched successfully");
		return this;
	}

	public ExperimentPage matchChatHowToData() {
		waitAndClickElement(HOW_TO, 1);
		Assert.assertTrue(Harmony.get("chat_my_solution").matches(getText(HOW_TO_DATA).split("\\s+")[4]));
		logger.info("How To Data matched successfully");
		return this;
	}

	public ExperimentPage matchSomeoneHowToData() {
		waitAndClickElement(HOW_TO, 1);
		Assert.assertTrue(Harmony.get("Someone Solution").matches(getText(HOW_TO_DATA).split("\\s+")[4]));
		logger.info("How To Data matched successfully");
		return this;
	}

	public ExperimentPage matchMySelfHowToData(String Options) {
		waitAndClickElement(HOW_TO, 1);
		String s = getText(HOW_TO_TEXT_DATA);
		Assert.assertTrue(Harmony.get("Myself Solution").matches(getText(HOW_TO_DATA).split("\\s+")[4]));

		if(Options.equalsIgnoreCase("Options1")) {
			Assert.assertTrue(s.contains(Harmony.get("Option1 HowTo1")));
			Assert.assertTrue(s.contains(Harmony.get("Option1 HowTo2")));
		}
		else if(Options.equalsIgnoreCase("Options2")) {
			Assert.assertTrue(s.contains(Harmony.get("Option2 HowTo1")));
			Assert.assertTrue(s.contains(Harmony.get("Option2 HowTo2")));
		}

		else if(Options.equalsIgnoreCase("Options3")) {
			Assert.assertTrue(s.contains(Harmony.get("Option3 HowTo1")));
		}

		else if(Options.equalsIgnoreCase("Options4")) {
			Assert.assertTrue(s.contains(Harmony.get("Option4 HowTo1")));
		}
		logger.info("How To Data matched successfully");
		return this;
	}


	public ExperimentPage matchWhy2Data() {
		waitAndClickElement(WHY_2, 1);
		String s = getText(WHY_2_DATA);
		Assert.assertTrue(Harmony.get("Solution").matches(s.split("\\s+")[12]));
		Assert.assertTrue(Harmony.get("Alternative Pros").matches(s.split("\\s+")[16]));
		Assert.assertTrue(Harmony.get("Solution").matches(s.split("\\s+")[29]));
		Assert.assertTrue(Harmony.get("Unique Cons").matches(s.split("\\s+")[34]));
		return this;
	}

	public ExperimentPage matchChatWhy2Data() {
		waitAndClickElement(WHY_2, 1);
		String s = getText(WHY_2_DATA);
		Assert.assertTrue(Harmony.get("chat_my_solution").matches(s.split("\\s+")[12]));
		Assert.assertTrue(Harmony.get("chat_alternative_solution_pros").matches(s.split("\\s+")[16]));
		Assert.assertTrue(Harmony.get("chat_my_solution").matches(s.split("\\s+")[29]));
		Assert.assertTrue(Harmony.get("chat_my_solution_cons").matches(s.split("\\s+")[34]));
		return this;
	}

	public ExperimentPage matchSomeoneWhy2Data() {
		waitAndClickElement(WHY_2, 1);
		String s = getText(WHY_2_DATA);
		Assert.assertTrue(Harmony.get("Someone Solution").matches(s.split("\\s+")[12]));
		Assert.assertTrue(Harmony.get("Someone Alternative Pros").matches(s.split("\\s+")[16]));
		Assert.assertTrue(Harmony.get("Someone Solution").matches(s.split("\\s+")[29]));
		Assert.assertTrue(Harmony.get("Someone Unique Cons").matches(s.split("\\s+")[34]));
		return this;
	}

	public ExperimentPage matchMySelfWhy2Data(String Options) {
		waitAndClickElement(WHY_2, 1);
		String s = getText(WHY_2_DATA);

		Assert.assertTrue(s.contains(Harmony.get("Myself Solution")));
		Assert.assertTrue(s.contains(Harmony.get("Myself Alternative Pros")));
		Assert.assertTrue(s.contains(Harmony.get("Myself Unique Cons")));
		if(Options.equalsIgnoreCase("Options1")) {
			Assert.assertTrue(s.contains(Harmony.get("Option1 Injection1")));
			Assert.assertTrue(s.contains(Harmony.get("Option1 Injection2")));
		}
		else if(Options.equalsIgnoreCase("Options2")) {
			Assert.assertTrue(s.contains(Harmony.get("Option2 Injection1")));
			Assert.assertTrue(s.contains(Harmony.get("Option2 Injection2")));
		}

		else if(Options.equalsIgnoreCase("Options3")) {
			Assert.assertTrue(s.contains(Harmony.get("Option3 Injection1")));
		}

		else if(Options.equalsIgnoreCase("Options4")) {
			Assert.assertTrue(s.contains(Harmony.get("Option4 Injection1")));
		}
		return this;
	}


	public ExperimentPage matchWhatForData() {
		waitAndClickElement(WAHT_FOR,1 );
		String s = getText(WHAT_FOR_DATA);
		Assert.assertTrue(Harmony.get("Unique Pros").matches(s.split("\\s+")[5]));
		Assert.assertTrue(Harmony.get("Alternative Pros").matches(s.split("\\s+")[7]));
		Assert.assertTrue(Harmony.get("Unique Cons").matches(s.split("\\s+")[14]));
		Assert.assertTrue(Harmony.get("Alternative Cons").matches(s.split("\\s+")[16]));
		logger.info("What for data matched successfully");
		return this;
	}

	public ExperimentPage matchChatWhatForData() {
		waitAndClickElement(WAHT_FOR,1 );
		String s = getText(WHAT_FOR_DATA);
		Assert.assertTrue(Harmony.get("chat_my_solution_pros").matches(s.split("\\s+")[5]));
		Assert.assertTrue(Harmony.get("chat_alternative_solution_pros").matches(s.split("\\s+")[7]));
		Assert.assertTrue(Harmony.get("chat_my_solution_cons").matches(s.split("\\s+")[14]));
		Assert.assertTrue(Harmony.get("chat_alternative_solution_cons").matches(s.split("\\s+")[16]));
		logger.info("What for data matched successfully");
		return this;
	}

	public ExperimentPage matchSomeoneWhatForData() {
		waitAndClickElement(WAHT_FOR,1 );
		String s = getText(WHAT_FOR_DATA);
		Assert.assertTrue(Harmony.get("Someone Unique Pros").matches(s.split("\\s+")[5]));
		Assert.assertTrue(Harmony.get("Someone Alternative Pros").matches(s.split("\\s+")[7]));
		Assert.assertTrue(Harmony.get("Someone Unique Cons").matches(s.split("\\s+")[14]));
		Assert.assertTrue(Harmony.get("Someone Alternative Cons").matches(s.split("\\s+")[16]));
		logger.info("What for data matched successfully");
		return this;
	}

	public ExperimentPage matchMySelfWhatForData() {
		waitAndClickElement(WAHT_FOR,1 );
		String s = getText(WHAT_FOR_DATA);
		Assert.assertTrue(Harmony.get("Myself Unique Pros").matches(s.split("\\s+")[5]));
		Assert.assertTrue(Harmony.get("Myself Alternative Pros").matches(s.split("\\s+")[7]));
		Assert.assertTrue(Harmony.get("Myself Unique Cons").matches(s.split("\\s+")[14]));
		Assert.assertTrue(Harmony.get("Myself Alternative Cons").matches(s.split("\\s+")[16]));
		logger.info("What for data matched successfully");
		return this;
	}


	public ExperimentPage matchWhy1Data() {
		String s = getText(WHY_1_DATA);
		Assert.assertTrue(s.split("\\s+")[2].matches(Harmony.get("Problem")));
		Assert.assertTrue(s.split("\\s+")[6].matches(Harmony.get("Impact on me")));
		Assert.assertTrue(s.split("\\s+")[8].matches(Harmony.get("Impact on Others")));
		logger.info("Why 1 Data Matched");
		return this;
	}

	public ExperimentPage matchChatWhy1Data() {
		String s = getText(WHY_1_DATA);
		Assert.assertTrue(s.split("\\s+")[2].matches(Harmony.get("chat_problem")));
		Assert.assertTrue(s.split("\\s+")[6].matches(Harmony.get("chat_local_impact")));
		Assert.assertTrue(s.split("\\s+")[8].matches(Harmony.get("chat_system_impact")));
		logger.info("Why 1 Data Matched");
		return this;
	}






//	public ExperimentPage matchSomeoneWhy1Data() {
//		String s = getText(WHY_1_DATA);
//		Assert.assertTrue(s.split("\\s+")[2].matches(Harmony.get("Problem")));
//		Assert.assertTrue(s.split("\\s+")[6].matches(Harmony.get("Impact on me")));
//		Assert.assertTrue(s.split("\\s+")[8].matches(Harmony.get("Impact on Others")));
//		logger.info("Why 1 Data Matched");
//		return this;
//	}
//
//	public ExperimentPage matchMySelfWhy1Data() {
//		String s = getText(WHY_1_DATA);
//		Assert.assertTrue(s.split("\\s+")[2].matches(Harmony.get("Problem")));
//		Assert.assertTrue(s.split("\\s+")[6].matches(Harmony.get("Impact on me")));
//		Assert.assertTrue(s.split("\\s+")[8].matches(Harmony.get("Impact on Others")));
//		logger.info("Why 1 Data Matched");
//		return this;
//	}









	public ExperimentPage verifySaveDataAlert() {
		assertCurrentPage(SAVE_DATA_ALERT_BOX);
		logger.info("save data alert box displayed");
		return this;
	}

	public ExperimentPage clickOK() {
		waitAndClickElement(OK, 2);
		logger.info("Conflict has been saved successfully");
		return this;
	}

	public ExperimentPage dismissCongratulation() throws InterruptedException {
		syncAction(5000);
		dismissAlertBoxes("Congratulations");
		syncAction(5000);
		dismissAlertBoxes("Are you sure?");
		return this;
	}
}
