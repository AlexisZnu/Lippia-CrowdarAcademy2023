@HomePage
Feature: Home Page

  Background:
    Given que el usuario está en la página de inicio practice.automationtesting.in
    And hace click en el menu Shop
    And hace click en el botón del menú Home

@Sliders
  Scenario: Verificar que la página de inicio tenga solo tres controles deslizantes
    Then se verifica ver solo tres controles deslizantes en la página de inicio


@Arraivals
  Scenario: Verificar que la página de inicio tenga solo tres llegadas
    Then se verifica ver solo tres arraivals en la página de inicio


@Description
  Scenario: Verificar la descripción del libro en la página de detalle
    When hace click en la imagen del Arraival
    When hace click en la pestaña Description
    Then se muestra la descripción correspondiente al libro seleccionado y debe estar relacionada con el libro


@Reviews
  Scenario: : Navegación a la página de detalles del producto desde la imagen de llegada y verificación de las reseñas del producto
    When  hace click en la imagen del Arraival
    When hago click en la pestaña de Reviews
    Then debo ver una lista de reseñas para ese libro y cada reseña debe incluir un título, una calificación y un comentario





