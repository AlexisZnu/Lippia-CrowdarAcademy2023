package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.RegistrationConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class Assertions extends ActionManager {

    public static void verifyResults() {
        Assert.assertTrue(WebActionManager.isPresent(RegistrationConstants.HELLO_XPATH));
    }

    private static String getTextError() {
        return getElement(RegistrationConstants.ERROR_TEXT_VALIDEMAIL).getText();

    }

    public static void verifyMesageError(String text) {
        String[] partes = getTextError().split(": ");
        System.out.println(partes[1]);
        Assert.assertEquals(partes[1], text);

    }

    public static void verifyErrorAddress(String text) {
        String locator = getElement(String.format(LoginConstants.INVALID_USER_XPATH, text)).getText();
        String[] partes = locator.split(": ");
        Assert.assertEquals(partes[1], text);
    }
}
