package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.HomeServices;

public class HomePageSteps {

    @And("^hace click en el menu (.*)$")
    public void shop(String shop) {
        HomeServices.mapsHome(shop);
        HomeServices.closeAds();
    }

    @And("^hace click en el botón del menú (.*)$")
    public void haceClickEnElBotonDelMenuHome(String home) {
        HomeServices.mapsHome(home);
    }

    @Then("se verifica ver solo tres controles deslizantes en la página de inicio")
    public void seVerificaVerSoloTresControlesDeslizantesEnLaPaginaDeInicio() {
        HomeServices.sliders();
    }

    @Then("se verifica ver solo tres arraivals en la página de inicio")
    public void seVerificaVerSoloTresLlegadasEnLaPaginaDeInicio() {
        HomeServices.validacionDeElementos();
    }

    @When("^hace click en la imagen del (.*)$")
    public void haceClickEnLaImagenDelArraival(String arrai) {
        HomeServices.mapsHome(arrai);
    }

    @When("hace click en la pestaña de Descripcion")
    public void haceClikcEnLaPestanaDescription() {
        HomeServices.clickDescription();
    }

    @And("se muestra la descripción correspondiente al libro seleccionado y debe estar relacionada con el libro")
    public void seMuestraLaDescripcionCorrespondienteAlLibroSeleccionadoYDebeEstarRelacionadaConElLibro() {
        HomeServices.validarDescription();
    }

    @When("hago click en la pestaña de Resenias")
    public void hagoClickEnLaPestanaDeReviews() {
        HomeServices.clickReview();
    }

    @Then("debo ver una lista de reseñas para ese libro y cada reseña debe incluir un título, una calificación y un comentario")
    public void deboVerUnaListaDeResenasParaEseLibroYCadaResenaDebeIncluirUnTituloUnaCalificacionYUnComentario() {
        HomeServices.validarReviews();

    }

    @And("^hace click en Arrival imagen donde su orden es (.+)$")
    public void clickOnTheArrivalImageWhoseOrderIs(int order) {
        HomeServices.clickArrivalImage(order);
    }

    @Then("The client verify that is in the product details page where exists an Add To Basket button")
    @And("verifica que esté los detalles del producto donde existe un botón Agregar al carrito")
    public void verifyThatIsNowInTheProductDetailsPageWhereAnAddToBasketButtonExists() {
        HomeServices.verifyArrival();
    }

    @Then("The client verify that the Book is in the Menu item with price")
    @And("ve que el Libro este en el elemento del Menú con precio")
    public void verifyAddingToBasket() {
        HomeServices.verifyAddToBasketMenuItem();
    }

    @And("clickea en el enlace del elemento del menú que navega para proceder a la página de salida")
    public void clickOnTheMenuItemLinkWhichNavigatesToProceedToCheckOutPage() {
        HomeServices.clickMenuItemLinkToCheckoutPage();
    }

    @And("se muestran los valores total y subtotal, el total es mayor que el subtotal debido a impuestos")
    public void verifyThatIsShownTheTotalAndSubtotalValuesTotalIsGreaterThanSubtotalDueToTaxes() {
        HomeServices.verifyTotalAndSubtotalOnCheckoutPage();
    }

    @And("Completa los detalles de facturacion y elige por cualquier pasarela de pago disponible '(.*)', '(.*)', '(.*)', '(.+)', '(.*)', '(.*)', '(.*)', '(.*)', '(.+)'")
    public void fillTheBillingDetailsAndOptForAnyAvailablePaymentGatewayInThePaymentGatewayPage(String firstName, String lastName, String email, String phone,
                                                                                                String country, String address, String city, String state, String zipcode) throws InterruptedException {
        HomeServices.fillBillingDetails(firstName, lastName, email, phone, country, address, city, state, zipcode);
        HomeServices.selectPaymentGateway();
    }

    @And("ve que sea posible agregar un cupón en la página de la pasarela de pago")
    public void verifyThatIsPossibleToAddACouponInThePaymentGatewayPage() {
        HomeServices.verifyCoupon();
    }

    @Then("El cliente puede ver la Facturacion, el Pedido, las pasarelas de pago y los detalles adicionales en la pagina de la pasarela de pago")
    public void theClientCanSeeTheBillingOrderPaymentGatewaysAndAdditionalDetailsInThePaymentGatewayPage() {
        HomeServices.verifyDetailsInPaymentGatewayPage();
    }

    @Then("El cliente puede ver la página de confirmacion del pedido con los detalles del pedido, el banco y la facturacion")
    public void theClientCanSeeTheOrderConfirmationPageWithOrderBankAndBillingDetails() {
        HomeServices.verifyOrderConfirmationPage();
    }

    @And("^procede a clickear en (.*)$")
    public void clickeaEnProceedToCheckout(String btn) {
        HomeServices.clickearCheckOut(btn);
    }
}
