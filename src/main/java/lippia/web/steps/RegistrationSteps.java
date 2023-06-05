package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.RegistrationServices;
import lippia.web.services.SuperiorBarNavigationBarService;

public class RegistrationSteps extends PageSteps {
    @Given("que el usuario se encuentra en la página de inicio de sesión")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
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
        RegistrationServices.verifyResults();

    }


    @And("^ingresa un email inválida en el campo Email (.+) e ingresa una contrasenia en el campo (.+)$")
    public void ingresaUnaContrasenaEnElCampo(String email, String pass ) {
        RegistrationServices.enterUserCriteria(email);
        RegistrationServices.enterPassCriteria(pass);

    }

    @Then("el sistema muestra un mensaje de advertencia que dice (.*)")
    public void elSistemaMuestraUnMensajeDeAdvertenciaQueDice(String text) {
        RegistrationServices.verifyMesageError(text);

    }


    @And("deja vacía en el campo de texto del email e ingresa una contraseña en el campo (.+)")
    public void dejaVaciaEnElCampoDeTextoDelEmailEIngresaUnaContrasenaEnElCampo(String pass) {

        RegistrationServices.enterPassCriteria(pass);
    }

    @Then("el registro falla con un mensaje de advertencia que indica (.+)")
    public void elRegistroFallaConUnMensajeDeAdvertenciaQueIndica(String text) {
        RegistrationServices.verifyMesageError(text);

    }



    @And("ingresa un email (.+) válida en el campo de texto del email y deja vacía en el campo de contrasenia")
    public void ingresaUnEmailValidaEnElCampoDeTextoDelEmailYDejaVaciaEnElCampoDeContrasenia(String email) {
        RegistrationServices.enterUserCriteria(email);
    }

    @Then ("el registro del usuario falla con un mensaje  que indica un error en la contrasenia (.+)")
    public void errorDeContrasenia(String text){
        RegistrationServices.contraseniaRequerida(text);
    }


    @And("deja vacía en el campo de texto del email y deja vacía en el campo de contrasenia")
    public void dejaVaciaEnElCampoDeTextoDelEmailYDejaVaciaEnElCampoDeContrasenia() {
    }
}

