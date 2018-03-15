package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class MyProfile extends BasePage {

    final static Logger logger = Logger.getLogger(AllOptionsOnHomeScreen.class);

    private static final By MY_PROFILE = MobileBy.AccessibilityId("MY PROFILE");
    private static final By MY_PROFILE_ICON = MobileBy.AccessibilityId("My Profile");

    private static final By EDIT_MY_PROFILE = MobileBy.AccessibilityId("edit");
    private static final By CHANGE_PASSWORD = MobileBy.AccessibilityId("change password");
    private static final By LOGOUT = MobileBy.AccessibilityId("logout");
    private static final By PERSONAL_INFO = MobileBy.AccessibilityId("Personal Info");
    private static final By LICENCE_INFO = MobileBy.AccessibilityId("License Info");
    private static final By EMAIL = MobileBy.AccessibilityId("Email");
    private static final By NAME = MobileBy.AccessibilityId("Name");
    private static final By SURNAME = MobileBy.AccessibilityId("Surname");
    private static final By ORG = MobileBy.AccessibilityId("Organization");
    private static final By COUNTRY = MobileBy.AccessibilityId("Country");
    private static final By PRO_CLOUD_TEMP = MobileBy.AccessibilityId("ProConCloud Template?");
    private static final By SAVE =  MobileBy.AccessibilityId("SAVE");
    private static final By EDIT_NAME = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]/XCUIElementTypeTextField[1]");
    private static final By ON_BOARD = MobileBy.AccessibilityId("onboarding_1");


    public MyProfile() {
        assertCurrentPage(MY_PROFILE_ICON);
        waitAndClickElement(MY_PROFILE_ICON, 5);
        assertCurrentPage(MY_PROFILE);
        assertCurrentPage(PERSONAL_INFO);
        assertCurrentPage(LICENCE_INFO);
        assertCurrentPage(EMAIL);
        assertCurrentPage(NAME);
        assertCurrentPage(SURNAME);
        assertCurrentPage(ORG);
        assertCurrentPage(COUNTRY);
        assertCurrentPage(PRO_CLOUD_TEMP);
        assertCurrentPage(LOGOUT);
        assertCurrentPage(EDIT_MY_PROFILE);
        assertCurrentPage(CHANGE_PASSWORD);
        logger.info("All assertion is done ");
    }


    public MyProfile editProfile() throws InterruptedException {
        logger.info("Lets edit the profile");
        waitAndClickElement(EDIT_MY_PROFILE, 5);
        logger.info("In Edit profile section");
        setValueswithHideKeyboard1(EDIT_NAME, getText(EDIT_NAME) + "1");
        clickElement(SAVE);
        syncAction(5000);
        driver.switchTo().alert().accept();
        assertCurrentPage(EDIT_MY_PROFILE);
        return this;
    }


    public MyProfile logout() {
        logger.info("Let's logout now");
        waitAndClickElement(LOGOUT, 5);
        waitForPresence(ON_BOARD);
        logger.info("Done");
        return this;
    }


}
