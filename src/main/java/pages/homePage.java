package pages;

import org.openqa.selenium.By;

public class homePage extends BasePage{
    public void navigateToHomepage() {
        tap(By.xpath("//*[@text=\"Get Started\""));
    }

    public void clickButtonCreateNewWallet() {
        tap(By.xpath("//*[@text = \"Create new wallet\"]"));
    }

    public void validateSuccessWalletCreation() {
        waitUntilElementVisible(By.xpath("//*[@text=\"Welcome aboard\"]"));
    }

    public void startUsingWallet() {
        tap(By.xpath("//*[@text=\"Start using Trust Wallet\"]"));
    }
}
