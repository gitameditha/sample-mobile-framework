package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;
import java.time.Duration;

public class BasePage {

    protected AppiumDriver driver;

    public BasePage() {
        this.driver = DriverUtils.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public final WebDriverWait wait;

    public void waitUntilElementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void tap(By by) {
        waitUntilElementVisible(by);
        driver.findElement(by).click();
    }

    public void inputText(By by, String text) {
        waitUntilElementVisible(by);
        driver.findElement(by).sendKeys(text);
    }

}
