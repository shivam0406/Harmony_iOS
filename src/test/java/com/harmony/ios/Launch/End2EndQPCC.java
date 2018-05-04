package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.CreateConflict;
import com.harmony.ios.pages.MyConflictPage;
import com.harmony.ios.pages.MyDecisionQPCC;
import com.harmony.ios.pages.MyProblemPage;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.*;

/**
 * Created by Edutopia on 02/04/18.
 */


public class End2EndQPCC extends iOSBaseTest {

    AppProperties appProperties = null;

    @BeforeClass
    public void beforeClass() throws Exception {
        appProperties = new AppProperties();
        appProperties.loadSampleAppProperties("HarmonyApplication.properties");
        WebDriverFactory.createIOSDriver(appProperties);
        WebDriverFactory.getIOSDriver().launchApp();
    }

    @Test
    public void test() throws InterruptedException {
        End2EndTest end2EndTest = new End2EndTest();
        end2EndTest
                .Login();
        CreateConflict createConflict = new CreateConflict();
        createConflict
                .dontAllowAlert()
                .clickOnStaticText()
                .checkProConCloudAlertBox()
                .moveToConflict()
                .createConflict()
                .shanta()
                .calculateForMe()
                .checkConflitBox()
                .enterConflictValueQPCC()
                .clickOK()
                .syncAction(10000);
        createConflict
                .verifyCreatedConflictQPCC();

    }

    @Test
    public void test2() throws InterruptedException {
        MyProblemPage myProblemPage = new MyProblemPage();
        myProblemPage
                .clickOnConflict()
                .verifyClickedOnConflictpage()
                .enterTheProblemQPCC();
    }

    @Test
    public void test3() throws InterruptedException {
        MyConflictPage myConflictPage = new MyConflictPage();
        myConflictPage
                .enterSolutionInBoxQPCC()
                .enterAlternativeSolutionInBox_QPCC();
    }


    @Test
    public void test4() {
        MyDecisionQPCC myDecisionQPCC = new MyDecisionQPCC();
        myDecisionQPCC
                .isMyOwnSelected();
    }


}



