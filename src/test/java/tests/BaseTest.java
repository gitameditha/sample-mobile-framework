package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BackUpPage;
import pages.homePage;
import pages.passcodePage;
import utils.DriverUtils;



public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

    public homePage home() {
        return new homePage();
    }

    public BackUpPage backUp() {
        return  new BackUpPage();
    }

    public passcodePage passcode() {
        return  new passcodePage();
    }

}
