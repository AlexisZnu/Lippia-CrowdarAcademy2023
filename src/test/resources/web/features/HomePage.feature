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
    When hace click en la pestaña de Descripcion
    Then se muestra la descripción correspondiente al libro seleccionado y debe estar relacionada con el libro

@Reviews
  Scenario: : Navegación a la página de detalles del producto desde la imagen de llegada y verificación de las reseñas del producto
    When  hace click en la imagen del Arraival
    When hago click en la pestaña de Resenias
    Then debo ver una lista de reseñas para ese libro y cada reseña debe incluir un título, una calificación y un comentario


  @FromHomeUpToPayment
  Scenario Outline: seleccionar un artículo de llegada, agregarlo a la cesta, ir a la página de pago y acceder a la página de la pasarela de pago donde puede ver y completar sus datos de facturación y seleccionar la opción de pago preferida
    And se verifica ver solo tres arraivals en la página de inicio
    And hace click en Arrival imagen donde su orden es <order>
    And verifica que esté los detalles del producto donde existe un botón Agregar al carrito
    And hace click en el menu Add to Basket
    And ve que el Libro este en el elemento del Menú con precio
    And clickea en el enlace del elemento del menú que navega para proceder a la página de salida
    And se muestran los valores total y subtotal, el total es mayor que el subtotal debido a impuestos
    And procede a clickear en Proceed to Checkout
    And Completa los detalles de facturacion y elige por cualquier pasarela de pago disponible '<firstName>', '<lastName>', '<email>', '<phone>', '<country>', '<address>', '<city>', '<state>', '<zipcode>'
    And ve que sea posible agregar un cupón en la página de la pasarela de pago
    Then El cliente puede ver la Facturacion, el Pedido, las pasarelas de pago y los detalles adicionales en la pagina de la pasarela de pago
    Examples:
      | order | firstName | lastName | email                | phone          | country   | address           | city       | state      | zipcode |
      | 1     | Carlos    | Gomez    | Carlos@domain.com.mx | +5925557093744 | Argentina | Santa Boturini 45 | Corrientes | Corrientes | 10020   |

  @FromHomeToConfirmation
  Scenario Outline: seleccionar un artículo de llegada, agregarlo a la cesta, ir a la página de pago, luego a la página de la pasarela de pago donde completa los detalles de facturación y, finalmente, puede ver la página de confirmación del pedido
    And se verifica ver solo tres arraivals en la página de inicio
    And hace click en Arrival imagen donde su orden es <order>
    And verifica que esté los detalles del producto donde existe un botón Agregar al carrito
    And hace click en el menu Add to Basket
    And ve que el Libro este en el elemento del Menú con precio
    And clickea en el enlace del elemento del menú que navega para proceder a la página de salida
    And se muestran los valores total y subtotal, el total es mayor que el subtotal debido a impuestos
    And procede a clickear en Proceed to Checkout
    And Completa los detalles de facturacion y elige por cualquier pasarela de pago disponible '<firstName>', '<lastName>', '<email>', '<phone>', '<country>', '<address>', '<city>', '<state>', '<zipcode>'
    And hace click en el menu Place Order
    Then El cliente puede ver la página de confirmacion del pedido con los detalles del pedido, el banco y la facturacion
    Examples:
      | order | firstName | lastName | email                | phone          | country   | address           | city       | state      | zipcode |
      | 1     | Carlos    | Gomez    | Carlos@domain.com.mx | +5925557093744 | Argentina | Santa Boturini 45 | Corrientes | Corrientes | 10020   |



