package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.HomePageServices;

public class HomePageSteps {
    
    @And("^hace click en el menu (.*)$")
    public void shop(String shop){
    HomePageServices.mapsHome(shop);
  }

    @And("^hace click en el botón del menú (.*)$")
    public void haceClickEnElBotonDelMenuHome(String home) {
    HomePageServices.mapsHome(home);
  }

    @Then("se verifica ver solo tres controles deslizantes en la página de inicio")
    public void seVerificaVerSoloTresControlesDeslizantesEnLaPaginaDeInicio() {
      HomePageServices.sliders();
  }

    @Then("se verifica ver solo tres arraivals en la página de inicio")
    public void seVerificaVerSoloTresLlegadasEnLaPaginaDeInicio() {
      HomePageServices.validacionDeElementos();
  }

    @When("^hace click en la imagen del (.*)$")
    public void haceClickEnLaImagenDelArraival(String arrai) {
      HomePageServices.mapsHome(arrai);
  }

    @When("hace click en la pestaña de Descripcion")
    public void haceClikcEnLaPestanaDescription(){
    HomePageServices.clickDescription();
  }

    @Then("se muestra la descripción correspondiente al libro seleccionado y debe estar relacionada con el libro")
    public void seMuestraLaDescripcionCorrespondienteAlLibroSeleccionadoYDebeEstarRelacionadaConElLibro() {
        HomePageServices.validarDescription();
  }

    @When("hago click en la pestaña de Resenias")
    public void hagoClickEnLaPestanaDeReviews() {
      HomePageServices.clickReview();
  }

    @Then("debo ver una lista de reseñas para ese libro y cada reseña debe incluir un título, una calificación y un comentario")
    public void deboVerUnaListaDeResenasParaEseLibroYCadaResenaDebeIncluirUnTituloUnaCalificacionYUnComentario() {
        HomePageServices.validarReviews();

  }
}
