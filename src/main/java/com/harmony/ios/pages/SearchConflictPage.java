package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SearchConflictPage extends BasePage {

    final static Logger logger = Logger.getLogger(BasePage.class);

    private static final By SEARCH_ICON = MobileBy.AccessibilityId("Search");
    private static final By SEARCH_BOX = MobileBy.AccessibilityId("Search for decision contents");
    private static final By CONFLICTS = MobileBy.AccessibilityId("My Conflicts");
    private static final By AUTHOR_NAME_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]");
    private static final By NO_DECISION = MobileBy.AccessibilityId("No decision found");

    public SearchConflictPage() {
        assertCurrentPage(SEARCH_ICON);
    }

    public SearchConflictPage clickOnSearchIcon() {
        waitAndClickElement(SEARCH_ICON, 5);
        waitForPresence(SEARCH_BOX, 5);
        return this;
    }

    public SearchConflictPage searchByAuthor() throws InterruptedException {
        //assertCurrentPage(CONFLICTS);
        enterValueinBoxesWithoutDone(SEARCH_BOX, "Yogesh", "Author");
        Assert.assertTrue(getText(AUTHOR_NAME_TEXT).contains(Harmony.get("Author")), "Author matched.");
        waitAndClickElement(CLEAR_TEXT, 5);
        return this;
    }

    public SearchConflictPage searchBySubString() throws InterruptedException {
        //assertCurrentPage(CONFLICTS);
        enterValueinBoxesWithoutDone(SEARCH_BOX, Harmony.get("My Conflicts").substring(0,2), "Conflict SubString");
        Assert.assertTrue(Harmony.get("My Conflicts").contains(Harmony.get("Conflict SubString")));
        waitAndClickElement(CLEAR_TEXT, 5);
        return this;
    }

    public SearchConflictPage searchByUnknown() {
        setValues(SEARCH_BOX, "XYZABCKJLMNHKOHGJDOEKHF");
        assertCurrentPage(NO_DECISION);
        waitAndClickElement(CLEAR_TEXT, 5);
        return this;
    }
}
