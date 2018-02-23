package com.harmony.ios.pages;


import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class AllOptionsOnHomeScreen extends BasePage {

    final static Logger logger = Logger.getLogger(AllOptionsOnHomeScreen.class);

    private static final By ICON_STORY = MobileBy.AccessibilityId("iconStory");
    private static final By ICON_RENAME = MobileBy.AccessibilityId("icon rename");
    private static final By ICON_SHARE = MobileBy.AccessibilityId("icon share black");
    private static final By ICON_CHAT = MobileBy.AccessibilityId("chat");
    private static final By ICON_HISTORY = MobileBy.AccessibilityId("icon history black");
    private static final By ICON_EXPORT = MobileBy.AccessibilityId("icon export black");
    private static final By ICON_DELETE = MobileBy.AccessibilityId("icon delete black");
    private static final By WELCOME_TEXT = MobileBy.AccessibilityId("Welcome to Harmony");
    private static final By ICON_WHITE = MobileBy.AccessibilityId("view white");
    private static final By ICON_HOME = MobileBy.AccessibilityId("home icon");
    private static final By NEXT = MobileBy.AccessibilityId("Next");
    private static final By STEP_ICON_OPTIONS = MobileBy.AccessibilityId("steps option icon");


    public AllOptionsOnHomeScreen() {
        logger.info("Check all present options");
        assertCurrentPage(ICON_CHAT);
        assertCurrentPage(ICON_STORY);
        assertCurrentPage(ICON_RENAME);
        assertCurrentPage(ICON_SHARE);
        assertCurrentPage(ICON_HISTORY);
        assertCurrentPage(ICON_EXPORT);
        assertCurrentPage(ICON_DELETE);
        logger.info("all elements present");
    }

    public AllOptionsOnHomeScreen verifyChatSection() {
        logger.info("Let's go in chat section");
        waitAndClickElement(ICON_CHAT, 4);
        assertCurrentPage(ICON_HOME);
        assertCurrentPage(NEXT);
        assertCurrentPage(WELCOME_TEXT);
        waitAndClickElement(ICON_WHITE, 5);
        logger.info("Lets go to original conflict section");
        assertCurrentPage(STEP_ICON_OPTIONS);
        waitAndClickElement(ICON_HOME, 5);
        return this;
    }
}
