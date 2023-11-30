package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.*;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getElement;


public class LoginSteps {

    @Given("que el usuario está en la página de inicio practice.automationtesting.in")
    public void HomePractice(){
        LoginServices.navegarWeb();
    }

    @And("ingresa un usuario (.+) y contrasenia (.+) invalido  en el campo de texto de usuario y contrasenia")
    public void ingresaElNombreDeUsuarioInvalidoEnElCampoDeNombreDeUsuario(String user, String pass) {
        LoginServices.usuario(user);
        LoginServices.contrasenia(pass);
    }
    @Then("se muestra un mensaje (.+) de error apropiado y se solicita al usuario que vuelva a ingresar sus credenciales")
    public void seMuestraUnMensajeDeErrorApropiadoYSeSolicitaAlUsuarioQueVuelvaAIngresarSusCredenciales(String mesage) {
        LoginServices.verifyErrorAddress(mesage);
    }

    @And("ingresa un usuario valido (.+) en el campo de nombre de usuario y deja vacio el cuadro de texto de contrasenia")
    public void ingresaUnUsuarioValidoEnElCampoDeNombreDeUsuario(String user) {
        LoginServices.usuario(user);
    }

    @Then("se muestra un mensaje (.+) de error y se solicita al usuario que vuelva a ingresar sus credenciales")
    public void seMuestraUnMensajeDeErrorYSeSolicitaAlUsuarioQueVuelvaAIngresarSusCredenciales(String errorPass) {
        LoginServices.passwordIsRequired(errorPass);
    }
    @When("deja vacio el cuadro de texto de nombre de usuario")
    public void dejaVacioElCuadroDeTextoDeNombreDeUsuario() {
    }

    @And("ingresa una contraseña válida (.+) en el cuadro de texto de contrasenia")
    public void ingresaUnaContrasenaValidaEnElCuadroDeTextoDeContrasena(String pass) {
        LoginServices.contrasenia(pass);
    }

    @Then("se muestra un mensaje  de error (.+) y se solicita al usuario que vuelva a ingresar sus credenciales")
    public void muestraUnMensajeDeErrorYSeSolicitaAlUsuarioQueVuelvaAIngresarSusCredenciales(String user) {
        LoginServices.userIsRequired(user);
    }

    @When("deja vacio el cuadro de texto de nombre de usuario y de contrasenia")
    public void dejaVacioElCuadroDeTextoDeNombreDeUsuarioYDeContrasena() {
    }

    @When("el usuario ingresa con contrasenia valida en el campo de contrasenia (.+)")
    public void elUsuarioIngresaConContraseniaValidaEnElCampoDeContrasenia(String pass) {
        LoginServices.contrasenia(pass);
    }

    @Then("se muestra la contraseña enmascarada y es reemplazados por asteriscos o puntos y la contraseña no debe ser visible en la pantalla")
    public void seMuestraLaContrasenaEnmascaradaEsReemplazadosPorAsteriscosOPuntosYLaContrasenaNoDebeSerVisibleEnLaPantalla() {
        Assert.assertFalse("asfasfasdasdasdasfasfasfas".equals(getElement(MyAccountConstants.BUTTON_LOGIN).getText()));
    }

    @When("ingresa su usuario en el campo de usuario (.+), cambiando algunas letras a mayúsculas o minúsculas")
    public void ingresaSuUsuarioEnElCampoDeUsuarioCambiandoAlgunasLetrasAMayusculasOMinusculas(String user) {
        LoginServices.usuario(user);
    }

    @And("ingresa una contraseña en el cuadro de texto de contraseña (.+), cambiando algunas letras a mayúsculas o minúsculas")
    public void ingresaUnaContrasenaEnElCuadroDeTextoDeContrasenaCambiandoAlgunasLetrasAMayusculasOMinusculas(String pass) {
        LoginServices.contrasenia(pass);
    }

    @Then("se muestra un mensaje (.+) que debe solicitar al usuario si perdio su contrasenia")
    public void seMuestraUnMensajeQueDebeSolicitarAlUsuarioQueVuelvaAIngresarSusCredenciales(String error) {
        LoginServices.cambioAMayuscula(error);
    }

    @Then("no debe estar conectado a su cuenta y se debe mostrar una página web general")
    public void noDebeEstarConectadoASuCuentaYSeDebeMostrarUnaPaginaWebGeneral() {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.TEXT_VALIDATE_DASHBOARD));
    }

}

