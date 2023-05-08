package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.Assertions;
import lippia.web.services.HomeServices;
import lippia.web.services.LoginServices;
import lippia.web.services.SuperiorBarNavigationBarService;


public class LoginSteps {

    @Given("que el usuario está en la página de inicio practice.automationtesting.in")
    public void HomePractice(){
        SuperiorBarNavigationBarService.navegarWeb();
    }



    @And("ingresa un usuario (.+) y contrasenia (.+) invalido  en el campo de texto de usuario y contrasenia")
    public void ingresaElNombreDeUsuarioInvalidoEnElCampoDeNombreDeUsuario(String user, String pass) {

        LoginServices.usuario(user);
        LoginServices.contrasenia(pass);
    }

    @Then("se muestra un mensaje (.+) de error apropiado y se solicita al usuario que vuelva a ingresar sus credenciales")
    public void seMuestraUnMensajeDeErrorApropiadoYSeSolicitaAlUsuarioQueVuelvaAIngresarSusCredenciales(String mesage) {
        Assertions.verifyErrorAddress(mesage);
        HomeServices.cerrarDriver();
    }



}
