package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ChatWindownPage extends BasePage {

    final static Logger logger = Logger.getLogger(ChatWindownPage.class);
    TestUtils testUtils = new TestUtils();

    private static final By HOME_ICON = MobileBy.AccessibilityId("home icon");
    private static final By WELCOME = MobileBy.AccessibilityId("Welcome to Harmony");
    private static final By YES = MobileBy.AccessibilityId("Yes");
    private static final By NO = MobileBy.AccessibilityId("No");
    private static final By Q1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]");
    private static final By TYPE_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextView[1]");
    private static final By SEND_BUTTON = MobileBy.AccessibilityId("Send");
    private static final By ANS_1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]");
    private static final By Q2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]");
    private static final By ANS_2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]");
    private static final By Q3 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[1]");
    private static final By ANS_3 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[1]");
    private static final By Q4 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[11]/XCUIElementTypeStaticText[1]");
    private static final By ANS_4 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[12]/XCUIElementTypeStaticText[1]");
    private static final By CONGO_MSG = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[13]/XCUIElementTypeStaticText[1]");
    private static final By Q5 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[14]/XCUIElementTypeStaticText[1]");
    private static final By ANS_5 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[15]/XCUIElementTypeStaticText[1]");
    private static final By Q6 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[16]/XCUIElementTypeStaticText[1]");
    private static final By ANS_6 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[17]/XCUIElementTypeStaticText[1]");
    private static final By Q7 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[18]/XCUIElementTypeStaticText[1]");
    private static final By ANS_7 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[19]/XCUIElementTypeStaticText[1]");
    private static final By Q8 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[20]/XCUIElementTypeStaticText[1]");
    private static final By ANS_8 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[21]/XCUIElementTypeStaticText[1]");
    private static final By Q9 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[22]/XCUIElementTypeStaticText[1]");
    private static final By ANS_9 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[23]/XCUIElementTypeStaticText[1]");
    private static final By Q10 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[24]/XCUIElementTypeStaticText[1]");
    private static final By ANS_10 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[25]/XCUIElementTypeStaticText[1]");
    private static final By Q11 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[26]/XCUIElementTypeStaticText[1]");
    private static final By ANS_11 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[27]/XCUIElementTypeStaticText[1]");
    private static final By Q12 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[28]/XCUIElementTypeStaticText[1]");
    private static final By ANS_12 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[29]/XCUIElementTypeStaticText[1]");
    private static final By Q13 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[30]/XCUIElementTypeStaticText[1]");
    private static final By ANS_13 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[31]/XCUIElementTypeStaticText[1]");
    private static final By CONGO_MSG_2  = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[32]/XCUIElementTypeStaticText[1]");
    private static final By STEP_3A = MobileBy.AccessibilityId("Step 3a Resolution");


    public ChatWindownPage() {
        assertCurrentPage(HOME_ICON);
        assertCurrentPage(WELCOME);
        assertCurrentPage(YES);
        assertCurrentPage(NO);
        logger.info("All assertion done ");
    }

    public ChatWindownPage startChatting () throws InterruptedException {
        logger.info("Let's start chat");
        clickElement(YES);
        syncAction(5000);
        assertCurrentPage(Q1);
        return this;
    }

    public ChatWindownPage question1() throws InterruptedException {
        logger.info("Checking q1");
        Assert.assertEquals(getText(Q1), "What would you like to name this decision?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_create_conflict",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_1);
        Assert.assertTrue(Harmony.get("chat_create_conflict").equalsIgnoreCase(getText(ANS_1)));
        return this;
    }

    public ChatWindownPage question2() throws InterruptedException {
        logger.info("Checking q2");
        Assert.assertEquals(getText(Q2), "Great. So tell me what is the problem or opportunity you are facing that is currently hanging over you like a dark cloud?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_problem",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_2);
        Assert.assertTrue(Harmony.get("chat_problem").equalsIgnoreCase(getText(ANS_2)));
        return this;
    }

    public ChatWindownPage question3() throws InterruptedException {
        logger.info("Checking q3");
        Assert.assertEquals(getText(Q3), "Ok. But we want to make sure this is an important enough problem for you. So, please tell me why it will be bad for YOU if you dont solve this problem?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_local_impact",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_3);
        Assert.assertTrue(Harmony.get("chat_local_impact").equalsIgnoreCase(getText(ANS_3)));
        return this;
    }

    public ChatWindownPage question4() throws InterruptedException {
        logger.info("Checking q4");
        Assert.assertEquals(getText(Q4), "Ok. But we need to check that it is also important for other stakeholders that you solve this problem. So, please tell me why it will be bad for OTHER stakeholders if you dont solve this problem?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_system_impact",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_4);
        Assert.assertTrue(Harmony.get("chat_system_impact").equalsIgnoreCase(getText(ANS_4)));
        assertCurrentPage(CONGO_MSG);
        return this;
    }

    public ChatWindownPage question5() throws InterruptedException {
        logger.info("Checking q5");
        Assert.assertEquals(getText(Q5), "WHAT must YOU CHANGE to solve/better deal with your problem?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_my_solution",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_5);
        Assert.assertTrue(Harmony.get("chat_my_solution").equalsIgnoreCase(getText(ANS_5)));
        return this;
    }

    public ChatWindownPage question6() throws InterruptedException {
        logger.info("Checking q6");
        Assert.assertEquals(getText(Q6), "What do YOU do INSTEAD that is in conflict with this needed CHANGE?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_alternative_solution",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_6);
        Assert.assertTrue(Harmony.get("chat_alternative_solution").equalsIgnoreCase(getText(ANS_6)));
        return this;
    }

    public ChatWindownPage question7() throws InterruptedException {
        logger.info("Checking q7");
        Assert.assertEquals(getText(Q7), "What are the unique PROS of the CHANGE?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_my_solution_pros",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_7);
        Assert.assertTrue(Harmony.get("chat_my_solution_pros").equalsIgnoreCase(getText(ANS_7)));
        return this;
    }

    public ChatWindownPage question8() throws InterruptedException {
        logger.info("Checking q8");
        Assert.assertEquals(getText(Q8), "What are the unique CONS of CHANGE?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_my_solution_cons",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_8);
        Assert.assertTrue(Harmony.get("chat_my_solution_cons").equalsIgnoreCase(getText(ANS_8)));
        return this;
    }

    public ChatWindownPage question9() throws InterruptedException {
        logger.info("Checking q9");
        Assert.assertEquals(getText(Q9), "What are the unique PROS of NO CHANGE?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_alternative_solution_pros",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_9);
        Assert.assertTrue(Harmony.get("chat_alternative_solution_pros").equalsIgnoreCase(getText(ANS_9)));
        return this;
    }

    public ChatWindownPage question10() throws InterruptedException {
        logger.info("Checking q10");
        Assert.assertEquals(getText(Q10), "What are the unique CONS of NO CHANGE?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_alternative_solution_cons",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_10);
        Assert.assertTrue(Harmony.get("chat_alternative_solution_cons").equalsIgnoreCase(getText(ANS_10)));
        return this;
    }

    public ChatWindownPage question11() throws InterruptedException {
        logger.info("Checking q11");
        Assert.assertEquals(getText(Q11), "What is YOUR GOAL that you desire most?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_goal",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_11);
        Assert.assertTrue(Harmony.get("chat_goal").equalsIgnoreCase(getText(ANS_11)));
        return this;
    }

    public ChatWindownPage question12() throws InterruptedException {
        logger.info("Checking q12");
        Assert.assertEquals(getText(Q12), "What is the THREAT to YOUR GOAL that you fear most?", "Both Not matched");
        String myValue = testUtils.randomValues();
        setValueswithHideKeyboard1(TYPE_BOX, myValue);
        clickElement(SEND_BUTTON);
        Harmony.put("chat_threat",myValue);
        syncAction(5000);
        assertCurrentPage(ANS_12);
        Assert.assertTrue(Harmony.get("chat_threat").equalsIgnoreCase(getText(ANS_12)));
        return this;
    }

    public ChatWindownPage selectBalmeGame() throws InterruptedException {
        logger.info("I blame no one for the issue");
        Assert.assertEquals(getText(Q13), "Do you blame either yourself or someone else for causing your problem?", "Not matched");
        clickElement(NO);
        syncAction(5000);
        Assert.assertEquals(getText(ANS_13), "No", "Not matched");
        assertCurrentPage(CONGO_MSG_2);
        clickElement(NEXT);
        syncAction(5000);
        assertCurrentPage(STEP_3A);
        return this;
    }
}
