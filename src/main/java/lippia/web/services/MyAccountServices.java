package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import java.util.HashMap;
import java.util.Map;
import static lippia.web.constants.MyAccountConstants.*;


public class MyAccountServices extends ActionManager {


    public static void enterUser(String user) {
        setInput(INPUT_USER, user);
    }

    public static void enterPassword(String password) {
        setInput(INPUT_PASSWORD, password);
    }

    public static void mapsMyAccount(String button){
        Map<String,String> buttons = new HashMap<>();
        buttons.put("Mi cuenta", BUTTON_MYACCOUNT);
        buttons.put("Inicio de sesion", BUTTON_LOGIN);
        buttons.put("Pedidos", BUTTON_PEDIDOS);
        buttons.put("vista", BUTTON_VIEW);
        buttons.put("Dirección de envío y facturación", TEXT_DETAILS_DIRECCION_ENVIO);
        buttons.put("edición en la dirección de envío", BUTTON_DETAIL_BILLING_EDIT);
        buttons.put("Editar su contraseña y los detalles de su cuenta", BUTTON_EDITAR_PASSWORD);
        buttons.put("Logout", BUTTON_SINGOUT);

        WebActionManager.click(buttons.get(button),false);

    }
}