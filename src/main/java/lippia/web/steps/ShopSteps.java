package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginServices;
import lippia.web.services.ShopService;


public class ShopSteps extends PageSteps {


    @Then("puede ver solo los productos ordenador de precio menor a mayor según el precio")
    public void puedeVerSoloLosProductosEnOrdenAscendenteSegunElPrecio() {
        ShopService.verifyPriceLow();
    }

    @And("^selecciona un valor (.*) en el menú desplegable de clasificación predeterminada$")
    public void seleccionaEnElMenuDesplegableDeClasificacionPredeterminada(String drop) {
        ShopService.selectDropdownByValue(drop);
    }

    @Then("^el usuario ve los productos ordenados por (.+)$")
    public void elUsuarioDeberaVerLosProductosOrdenadosPorPrecioDeMayorAMenor(String drops) {
        ShopService.verifyPriceOrderHigh(drops);
    }

    @When("hace click en el botón Leer más de un producto agotado")
    public void haceClickEnElBotonLeerMasDeUnProductoAgotado() {
        ShopService.clickReadMore();
    }

    @Then("ve que la opción Leer más indica que el producto está agotado y no debería ser capaz de agregar el producto al carrito de compras")
    public void veQueLaOpcionLeerMasIndicaQueElProductoEstaAgotadoYNoDeberiaSerCapazDeAgregarElProductoAlCarritoDeCompras() {
        ShopService.sinStock();
    }

    @And("hace click en el numero del boton añadir al carrito '(.*)'")
    public void clickOnTheAddToBasketButtonNumber(int number) {
        ShopService.clickAddToBasketNumber(number);
    }

    @And("seleciona '(.*)' en el campo país en el formulario de Facturacion")
    public void chooseIndiaInTheCountryFieldInBillingForm(String country) {
        ShopService.selectCountryInBillingForm(country);
    }
    @And("ve que los impuestos representen el (.)% del subtotal")
    @Then("El cliente puede ver que los impuestos representan (.)% Del subtotal")
    public void verifyThatTaxesRepresentOfTheSubtotal(int percentage) {
        ShopService.verifyTaxesPercentage(percentage);
    }
}
