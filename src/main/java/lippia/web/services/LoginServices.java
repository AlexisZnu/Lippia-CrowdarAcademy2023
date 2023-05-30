package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static lippia.web.constants.LoginConstants.*;
import static lippia.web.constants.LoginConstants.CAMBIOMAYUSCULA_ERROR;
import static lippia.web.constants.MyAccountConstants.*;

public class LoginServices extends ActionManager {

    public static void usuario(String user){
        WebActionManager.setInput(INPUT_USER,user);
    }

    public static void contrasenia(String password){
        WebActionManager.setInput(INPUT_PASSWORD,password);
    }

    public static void verifyErrorAddress(String text) {
        String locator = getElement(String.format(INVALID_USER, text)).getText();
        String[] partes = locator.split(": ");
        Assert.assertEquals(partes[1], text,"El Text esperado no es el mismo que el actual: ");
    }

    public static void passwordIsRequired(String text) {
        String locator = getElement(String.format(INVALID_PASS, text)).getText();
        String[] partes = locator.split(": ");
        Assert.assertEquals(partes[1], text);
    }

    public static void userIsRequired(String text) {
        String locator = getElement(String.format(USER_ERROR, text)).getText();
        String[] partes = locator.split(": ");
        Assert.assertEquals(partes[1], text);
    }

    public static void cambioAMayuscula(String text) {
        String locatorio = getElement(CAMBIOMAYUSCULA_ERROR).getText();
        Assert.assertEquals(locatorio, text,"El elemento no está siendo encontrado");
    }



}
