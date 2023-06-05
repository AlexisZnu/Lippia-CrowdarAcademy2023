package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomePageServices;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {


    @Given("The client is in google page")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When("The client tap on Shop menu")
    public void theClientTapOnShop() {
        SuperiorBarNavigationBarService.tapMenu();
    }

    @Then("The client see Filter By Price")
    public void theClientSee() {
        ShopService.verifyPage();
    }

    @And("^selecciono Ordenar por popularidad en el menú desplegable de clasificación predeterminada$")
    public void seleccionoOrdenarPorElementoDeMenorAMayorEnElMenuDesplegableDeClasificacionPredeterminada() {
        ShopService.selectDropdownByValue1();

    }

    @Then("puede ver solo los productos ordenador de precio menor a mayor según el precio")
    public void puedeVerSoloLosProductosEnOrdenAscendenteSegunElPrecio() {
        ShopService.verifyPriceLow();
    }

    @And("^selecciona Ordenar por elemento de mayor a menor en el menú desplegable de clasificación predeterminada$")
    public void seleccionaEnElMenuDesplegableDeClasificacionPredeterminada() {
        ShopService.selectDropdownByValue();
    }

    @Then("el usuario ve los productos ordenados por precio de mayor a menor")
    public void elUsuarioDeberaVerLosProductosOrdenadosPorPrecioDeMayorAMenor() {
        ShopService.verifyPriceOrderHigh();
    }

    @When("hace click en el botón Leer más de un producto agotado")
    public void haceClickEnElBotonLeerMasDeUnProductoAgotado() {
        ShopService.clickReadMore();
    }

    @Then("ve que la opción Leer más indica que el producto está agotado y no debería ser capaz de agregar el producto al carrito de compras")
    public void veQueLaOpcionLeerMasIndicaQueElProductoEstaAgotadoYNoDeberiaSerCapazDeAgregarElProductoAlCarritoDeCompras() {
        ShopService.sinStock();
    }
}
