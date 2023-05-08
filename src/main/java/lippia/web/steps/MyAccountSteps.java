package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.HomeServices;
import lippia.web.services.MyAccountServices;
import lippia.web.services.SuperiorBarNavigationBarService;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class MyAccountSteps {
    @Given("que estoy en la página de inicio del sitio web")
    public void Home(){
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When("hace click en el menú Mi cuenta")
    public void haceClickEnElMenuMiCuenta() {
        MyAccountServices.myAccount();
    }

    @And("escribe su usuario valido (.+) y contraseña valida (.+) en el cuadro de texto")
    public void escribeSuUsuarioValidoYContrasenaValidaEnElCuadroDeTexto(String user, String pass) {
        MyAccountServices.enterUser(user);
        MyAccountServices.enterPassword(pass);

    }

    @And("hace click en el botón de inicio de sesión")
    public void haceClickEnElBotonDeInicioDeSesion() {
        MyAccountServices.clickLogin();
    }

    @Then("se redirije correctamente al Dashboard con toda la información necesaria")
    public void seRedirijeCorrectamenteAlDashboardConTodaLaInformacionNecesaria() {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.BUTTON_SINGOUT));
        HomeServices.cerrarDriver();
    }



    @And("hace click en el enlace de Pedidos")
    public void haceClickEnElEnlaceDePedidos() {
        MyAccountServices.clickOrders();
    }

    @Then("ve sus pedidos")
    public void veSusPedidos() {
        Assert.assertTrue(WebActionManager.isVisible(MyAccountConstants.LISTA_PEDIDOS));
        HomeServices.cerrarDriver();
    }

}