package pages;
import org.openqa.selenium.By;

public class BackUpPage extends BasePage{

    public void skipBackUpPages() {
        tap(By.xpath("//*[@text=\"SKIP\"]"));
    }

    public  void validateBackUPages() {
        waitUntilElementVisible(By.xpath("//*[@text=\"Back up manually\"]"));
    }
}
