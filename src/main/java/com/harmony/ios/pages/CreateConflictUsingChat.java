package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class CreateConflictUsingChat extends BasePage{

    TestUtils testUtils = new TestUtils();
    final static Logger logger = Logger.getLogger(CreateConflictUsingChat.class);

    private static final By ICON_HOME = MobileBy.AccessibilityId("home icon");
    private static final By YES = MobileBy.AccessibilityId("Yes");
    private static final By NO = MobileBy.AccessibilityId("No");
    private static final By GREETING_TEXT = MobileBy.AccessibilityId("Hi there. I’m Harmony, your very own personal coach.");
    private static final By TEXT_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextView[1]");
    private static final By FIRST_QUESTION = MobileBy.AccessibilityId("What would you like to name this decision?");

    public CreateConflictUsingChat() {
        logger.info("Check all present options");
        assertCurrentPage(ICON_HOME);
        assertCurrentPage(YES);
        assertCurrentPage(NO);
        assertCurrentPage(GREETING_TEXT);
        logger.info("all elements present");
    }

    public CreateConflictUsingChat clickOnYes() {
        waitAndClickElement(YES, 2);
        assertCurrentPage(TEXT_BOX);
        logger.info("Chatting has been started");
        return this;
    }

    private CreateConflictUsingChat firstQuestion() {
        assertCurrentPage(FIRST_QUESTION);
        logger.info("First question displayed");
        logger.info("Enter the answer");


        return this;
    }








}
