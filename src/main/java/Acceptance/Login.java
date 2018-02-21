package Acceptance;

import Utils.BaseTest;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class Login extends BaseTest {

    @Test
    private void login() {
        waitForElementToLoad((MobileElement) driver.findElementById("com.twentythreeandme.app:id/skip"));
        MobileElement signInButton = (MobileElement) driver.findElementById("com.twentythreeandme.app:id/skip");
        signInButton.click();
    }


}
