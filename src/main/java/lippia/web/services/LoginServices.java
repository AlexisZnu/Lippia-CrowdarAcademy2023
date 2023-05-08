package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.MyAccountConstants;

public class LoginServices extends ActionManager {

    public static void usuario(String user){
        WebActionManager.setInput(MyAccountConstants.INPUT_USER,user);
    }

    public static void contrasenia(String password){
        WebActionManager.setInput(MyAccountConstants.INPUT_PASSWORD,password);
    }

}
