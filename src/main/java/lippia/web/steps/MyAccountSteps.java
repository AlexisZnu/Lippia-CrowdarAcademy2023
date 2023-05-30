package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.MyAccountConstants;
import lippia.web.services.MyAccountServices;
import lippia.web.services.SuperiorBarNavigationBarService;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.TEXT_DETAIL_BILLING;


public class MyAccountSteps {
    @Given("que estoy en la página de inicio del sitio web")
    public void Home(){
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When("^hace click en el menú (.*)$")
    public void menuMiCuenta(String cuenta) {
        MyAccountServices.mapsMyAccount(cuenta);
    }

    @And("escribe su usuario valido (.+) y contraseña valida (.+) en el cuadro de texto")
    public void escribeSuUsuarioValidoYContrasenaValidaEnElCuadroDeTexto(String user, String pass) {
        MyAccountServices.enterUser(user);
        MyAccountServices.enterPassword(pass);

    }

    @And("^hace click en el botón de inicio (.+)$")
    public void inicioDeSesion(String login) {
        MyAccountServices.mapsMyAccount(login);
    }

    @And("^realiza un click en el enlace de (.+)$")
    public void dirrecionYEnvio(String facturacion) {
        MyAccountServices.mapsMyAccount(facturacion);
    }

    @Then("se redirije correctamente al Dashboard con toda la información necesaria")
    public void seRedirijeCorrectamenteAlDashboardConTodaLaInformacionNecesaria() {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.BUTTON_SINGOUT,
                "El elemento no se encuentra presente: "));
    }


    @And("^efectua un click en el enlace de (.+)$")
    public void clickEnPedidos(String pedidos) {
        MyAccountServices.mapsMyAccount(pedidos);
    }

    @Then("ve sus pedidos")
    public void veSusPedidos() {
        Assert.assertTrue(WebActionManager.isVisible(MyAccountConstants.LISTA_PEDIDOS,"El elemento no se encuentra presente: "));

    }

    @And("^clickea en el botón de (.+)$")
    public void botonDeVista(String vista) {
        MyAccountServices.mapsMyAccount(vista);
    }

    @Then("ve los detalles de su pedido, los detalles del cliente y los detalles de facturación")
    public void veLosDetallesDeSuPedidoLosDetallesDelClienteYLosDetallesDeFacturacion() {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.TEXT_DETAILS_NUMBER_PRODUCT,"El elemento no se encuentra presente: "));

    }

    @Then("ve el número del pedido, la fecha del pedido y el estado del pedido (.+)")
    public void veElNumeroDelPedidoLaFechaDelPedidoYElEstadoDelPedido(String details) {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.TEXT_DETAILS_PRODUCTS,"El elemento no se encuentra presente: "), details);

    }


    @Then("ve la dirección de facturación y envío en Mi Cuenta (.+)")
    public void veLaDireccionDeFacturacionYEnvioEnMiCuenta(String billing) {
        Assert.assertTrue(WebActionManager.isPresent(TEXT_DETAIL_BILLING,billing));
    }

    @Then("puede editar la dirección de envío (.+)")
    public void puedeEditarLaDireccionDeEnvio(String text) {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.TEXT_DETAIL_BILLING_ADDRESS,text));
    }

    @Then("es redirigido a la página donde puede optar por la opcion de Cambiar contraseña (.+)")
    public void esRedirigidoALaPaginaDondePuedeOptarPorLaOpcionDeCambiarContrasena(String name) {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.TEXT_VALIDATE_FIRST_NAME,name));
    }

    @And("^hace click en el enlace de boton (.+)$")
    public void botonLogout(String logout) {
        MyAccountServices.mapsMyAccount(logout);
    }

    @Then("es redirigido a la pagina de inicio con su cuenta deslogueada correctamente (.+)")
    public void esRedirigidoALaPaginaDeInicioConSuCuentaDeslogueadaCorrectamente(String login) {
        Assert.assertTrue(WebActionManager.isPresent(MyAccountConstants.TEXT_VALIDATE_DASHBOARD,"El elemento no se encuentra presente: "), login);
    }

    @And("^vuelve a hacer click en el enlace de (.+)$")
    public void vuelveAHacerClickEnElEnlaceDeEditarSuContrasenaYLosDetallesDeSuCuenta(String editarC) {
        MyAccountServices.mapsMyAccount(editarC);
    }

    @And("^vuelve a clickear en el botón de (.+)$")
    public void vuelveAClickearEnElBotonDeEdicionEnLaDireccionDeEnvio(String edicion) {
        MyAccountServices.mapsMyAccount(edicion);
    }
}