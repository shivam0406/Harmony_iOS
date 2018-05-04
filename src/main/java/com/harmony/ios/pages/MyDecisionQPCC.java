package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * Created by Edutopia on 02/04/18.
 */
public class MyDecisionQPCC extends BasePage {


    final static Logger logger = Logger.getLogger(MyConflictPage.class);
    private static final By DECISION_TYPE_QUESTION = MobileBy.AccessibilityId("What type of decision is this?");
    private static final By BUSINESS = MobileBy.AccessibilityId("Business");
    private static final By PERSONAL = MobileBy.AccessibilityId("Personal");
    private static final By OTHER = MobileBy.AccessibilityId("Other");
    private static final By BUSINESS_RADIO = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"radio no\"])[1]");
    private static final By PERSONAL_RADIO = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"radio no\"])[2]");
    private static final By OTHER_RADIO = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"radio no\"])[3]");
    private static final By DECISION_CRITERIA = MobileBy.AccessibilityId("Define Decision Criteria");
    private static final By MY_OWN = MobileBy.AccessibilityId("My Own");

    private static final By CUSTOMER = MobileBy.AccessibilityId("Customers");
    private static final By EMPLOYEE = MobileBy.AccessibilityId("Employees");
    private static final By SHARE_HOLDERS = MobileBy.AccessibilityId("Share holders");
    private static final By SOCIETY = MobileBy.AccessibilityId("Society");
    private static final By CUSTOMERS_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[1]/XCUIElementTypeSlider");
    private static final By EMPLOYEE_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[2]/XCUIElementTypeSlider");
    private static final By SHARE_HOLDER_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[3]/XCUIElementTypeSlider");
    private static final By SOCIETY_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[4]/XCUIElementTypeSlider");
    private static final By ADD = MobileBy.AccessibilityId("+Add");
    private static final By PERMAH = MobileBy.AccessibilityId("PERMAH");


    private static final By MY_OWN_RADIO = MobileBy.xpath("(//XCUIElementTypeButton[@name=\"radio no\"])[3");


    private static final By POSITIVE_EMOTION = MobileBy.AccessibilityId("Positive Emotion");
    private static final By ENGAGEMENT = MobileBy.AccessibilityId("Engagement");
    private static final By RELATIONSHIP = MobileBy.AccessibilityId("Relationships");
    private static final By MEANING = MobileBy.AccessibilityId("Meaning");
    private static final By ACCOMPLISHMENT = MobileBy.AccessibilityId("Accomplishment");
    private static final By HEALTH = MobileBy.AccessibilityId("Health");


    private static final By POSITIVE_EMOTION_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[1]/XCUIElementTypeSlider");
    private static final By ENGAGEMENT_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[2]/XCUIElementTypeSlider");
    private static final By RELATIONSHIP_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[3]/XCUIElementTypeSlider");
    private static final By MEANING_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[4]/XCUIElementTypeSlider");
    private static final By ACCOMPLISHMENT_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[5]/XCUIElementTypeSlider");
    private static final By HEALTH_SLIDER = MobileBy.xpath("//XCUIElementTypeCell[6]/XCUIElementTypeSlider");

    private static final By INFO = MobileBy.AccessibilityId("btn selected conflict info");
    private static final By SHANTA = MobileBy.AccessibilityId("shanta");
    private static final By GREAT_THANKS = MobileBy.AccessibilityId("Great, thanks");
    private static final By URL = MobileBy.AccessibilityId("http://www.peggykern.org/uploads/5/6/6/7/56678211/the_perma-profiler_101416.pdf");


    private static final By HAPPINESS = MobileBy.AccessibilityId("Happiness");
    private static final By WISDOM = MobileBy.AccessibilityId("Wisdom");
    private static final By WEALTH = MobileBy.AccessibilityId("Wealth");

    private boolean flag = true;

    public MyDecisionQPCC() {

    }

    public MyDecisionQPCC isMyOwnSelected() {
     //   if(MY_OWN_RADIO.)
        driver.findElement(BUSINESS).click();
        return this;
    }



}
