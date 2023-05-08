package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.Assertions;
import lippia.web.services.HomeServices;
import lippia.web.services.RegistrationServices;
import lippia.web.services.SuperiorBarNavigationBarService;
import org.testng.Assert;

public class RegistrationSteps extends PageSteps {
    @Given("que el usuario se encuentra en la página de inicio de sesión")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();

    }


    @When("hace click en el botón de menú de Mi cuenta")
    public void haceClickEnElBotonDeMenuDeMiCuenta() {
        RegistrationServices.menu();

    }

    @And("^ingresa su email valido en el campo (.+) y una contrasenia valida en el campo de (.+)$")
    public void ingresaUnaDireccionDeCorreoElectronicoValidaYUnaContrasenaEnLosCuadrosDeTextoDeDireccionDeCorreoElectronicoYContrasena(String user, String pass) {
        RegistrationServices.enterUserCriteria(user);
        RegistrationServices.enterPassCriteria(pass);
    }

    @And("hace click en el botón Registrarse")
    public void haceClickEnElBotonRegistrarse(){
        RegistrationServices.clickRegistrar();
    }

    @Then("es registrado exitosamente y redirigido a la página de inicio de su cuenta")
    public void esRegistradoExitosamenteYRedirigidoALaPaginaDeInicioDeSuCuenta() {
        Assertions.verifyResults();
        HomeServices.cerrarDriver();
    }

    //2. Registration with invalid Email-id
    @And("^ingresa un email inválida en el campo Email (.+) e ingresa una contrasenia en el campo (.+)$")
    public void ingresaUnaContrasenaEnElCampo(String email, String pass ) {
        RegistrationServices.enterUserCriteria(email);
        RegistrationServices.enterPassCriteria(pass);

    }

    @Then("el sistema muestra un mensaje de advertencia que dice (.*)")
    public void elSistemaMuestraUnMensajeDeAdvertenciaQueDice(String text) {
        Assertions.verifyMesageError(text);
        HomeServices.cerrarDriver();
    }


}
