package tests;

import org.testng.annotations.Test;

public class walletCreation extends BaseTest{
    @Test(description = "As User I want to create first main wallet without back up")
    public void walletCreation() {
        home().navigateToHomepage();
        home().clickButtonCreateNewWallet();
        home().clickButtonCreateNewWallet();
        backUp().validateBackUPages();
        backUp().skipBackUpPages();
        passcode().inputPasscode();
        passcode().inputPasscode();
        home().validateSuccessWalletCreation();
        home().startUsingWallet();
    }
}
