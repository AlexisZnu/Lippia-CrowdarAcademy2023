package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistrationConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class RegistrationServices extends ActionManager {


    public static void menu(){
        waitVisibility(RegistrationConstants.CLICK_MENU).click();
    }

    public static void enterUserCriteria(String user) {
        setInput(RegistrationConstants.INPUT_USER_XPATH, user);
    }

    public static void enterPassCriteria(String pasword) {
        setInput(RegistrationConstants.INPUT_PASSWORD_XPATH, pasword);
    }

    public static void clickRegistrar() {
        click(RegistrationConstants.CLIKC_LOGIN_BUTTON);
    }

}
