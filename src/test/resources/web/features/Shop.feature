@Shop
Feature: Shop

  Background:
    Given que el usuario está en la página de inicio practice.automationtesting.in
    And hace click en el menu Shop

@MayorAMenor
  Scenario Outline: Ordenar productos por precio de mayor a menor
    And selecciona un valor <dropdown> en el menú desplegable de clasificación predeterminada
    Then el usuario ve los productos ordenados por precio de mayor a menor

  Examples:
    | dropdown |
    | price    |

  @LeerMas
  Scenario: Probar la funcionalidad agotado con opción Leer más
    When hace click en el botón Leer más de un producto agotado
    Then ve que la opción Leer más indica que el producto está agotado y no debería ser capaz de agregar el producto al carrito de compras

  @FromShopToConfirmation
  Scenario Outline: El cliente puede agregar al carrito un artículo desde la página de la Tienda, ir a la página de pago, luego a la página de la pasarela de pago donde completa los detalles de facturación y, finalmente, puede ver la página de confirmación del pedido.
    And hace click en el numero del boton añadir al carrito '<number>'
    And ve que el Libro este en el elemento del Menú con precio
    And clickea en el enlace del elemento del menú que navega para proceder a la página de salida
    And se muestran los valores total y subtotal, el total es mayor que el subtotal debido a impuestos
    And procede a clickear en Proceed to Checkout
    And Completa los detalles de facturacion y elige por cualquier pasarela de pago disponible '<firstName>', '<lastName>', '<email>', '<phone>', '<country>', '<address>', '<city>', '<state>', '<zipcode>'
    And hace click en el menu Place Order
    Then El cliente puede ver la página de confirmacion del pedido con los detalles del pedido, el banco y la facturacion

    Examples:
      | number | firstName | lastName | email                | phone          | country   | address           | city       | state      | zipcode |
      | 2      | Carlos    | Gomez    | Carlos@domain.com.mx | +5925557093744 | Argentina | Santa Boturini 45 | Corrientes | Corrientes | 10020   |

  @Taxes
  Scenario Outline: El cliente puede agregar al carrito un artículo desde la página de la Tienda, y en la página de la pasarela de pago puede elegir el país y finalmente ver que el valor de los impuestos es del 2% para India y del 5% para otros países.
    And hace click en el numero del boton añadir al carrito '<number>'
    And ve que el Libro este en el elemento del Menú con precio
    And clickea en el enlace del elemento del menú que navega para proceder a la página de salida
    And se muestran los valores total y subtotal, el total es mayor que el subtotal debido a impuestos
    And procede a clickear en Proceed to Checkout
    And seleciona 'India' en el campo país en el formulario de Facturacion
    And ve que los impuestos representen el 2% del subtotal
    And seleciona '<country>' en el campo país en el formulario de Facturacion
    Then El cliente puede ver que los impuestos representan 5% Del subtotal

    Examples:
      | number | country   |
      | 2      | Argentina |
