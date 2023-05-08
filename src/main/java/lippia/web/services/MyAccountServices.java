package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountConstants;

public class MyAccountServices extends ActionManager {

    public static void myAccount() {
        waitVisibility(MyAccountConstants.BUTTON_MYACCOUNT).click();
    }

    public static void enterUser(String user) {
        setInput(MyAccountConstants.INPUT_USER, user);
    }

    public static void enterPassword(String password) {
        setInput(MyAccountConstants.INPUT_PASSWORD, password);
    }

    public static void clickLogin() {
        click(MyAccountConstants.BUTTON_LOGIN);
    }

    public static void clickOrders() {
        click(MyAccountConstants.BUTTON_PEDIDOS);
    }

    public static void clickLogout() {
        click(MyAccountConstants.BUTTON_SINGOUT);
    }
}