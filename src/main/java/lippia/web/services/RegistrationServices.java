package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static lippia.web.constants.RegistrationConstants.*;

public class RegistrationServices extends ActionManager {

    private static String getTextError() {
        return getElement(ERROR_TEXT_VALIDEMAIL).getText();

    }
    public static void enterUserCriteria(String user) {
        setInput(INPUT_USER, user);
    }

    public static void enterPassCriteria(String pasword) {
        setInput(INPUT_PASSWORD, pasword);
    }

    public static void clickRegistrar() {
        click(CLIKC_REGISTER_BUTTON);
    }

    public static void verifyResults() {
        Assert.assertTrue(WebActionManager.isPresent(HELLO_TEXT, "El elemento no está presente"));
    }

    public static void verifyMesageError(String text) {
        String[] partes = getTextError().split(": ");
        System.out.println(partes[1]);
        Assert.assertEquals(partes[1], text);

    }

    public static void contraseniaRequerida(String text) {
        String locator = getElement(String.format(ERROR_TEXT_PASSWORD, text)).getText();
        String[] partes = locator.split(": ");
        Assert.assertEquals(partes[1], text);
    }

}