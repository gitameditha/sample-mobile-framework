package pages;

import org.openqa.selenium.By;

public class passcodePage extends BasePage{
    public void inputPasscode() {
        tap(By.xpath("//*[@text=\"1\"]"));
        tap(By.xpath("//*[@text=\"1\"]"));
        tap(By.xpath("//*[@text=\"0\"]"));
        tap(By.xpath("//*[@text=\"0\"]"));
        tap(By.xpath("//*[@text=\"3\"]"));
        tap(By.xpath("//*[@text=\"3\"]"));
    }
}
