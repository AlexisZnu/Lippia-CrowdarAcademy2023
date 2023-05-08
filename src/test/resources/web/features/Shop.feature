#1. Shop-Filter By Price Functionality
#1) Open the browser
#2) Enter the URL “http://practice.automationtesting.in/”
#3) Click on Shop Menu
#4) Adjust the filter by price between 150 to 450 rps
#5) Now click on Filter button
#6) User can view books only between 150 to 450 rps price

Feature: Shop

  Background:
    Given el usuario ingreso a la URL "http://practice.automationtesting.in/
    And hace click en el menu Shop

  Scenario: Probar la funcionalidad de filtro de la tienda por precio
    When ajusta el filtro por precio entre 150 a 450 rps
    And hace click en el botón Filter
    Then  debe ver solo los libros con precio entre 150 y 450 rps

#  2. Shop-Product Categories Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click any of the product links available in the product category
#  5) Now user can view only that particular product

  Scenario: Verificar si el usuario puede ver solo un producto en particular de la categoría de productos
    And hace click en uno de los enlaces de productos disponibles en la categoría de productos
    Then el usuario debe poder ver solo ese producto en particular en la página de detalles del producto


#  3. Shop-Default Sorting Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on Sort by Popularity item in Default sorting dropdown
#  5) Now user can view the popular products only

  Scenario: : verificar productos populares
    And selecciona "Popularity" en el menú desplegable de Ordenar por
    Then el usuario ve solo los productos populares en la página de la tienda


#  4. Shop-Default Sorting Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on Sort by Average ratings in Default sorting dropdown
#  5) Now user can view the popular products only

  Scenario: Ordenar productos por calificaciones promedio
    And selecciono la opción "Ordenar por calificaciones promedio" en el menú desplegable de clasificación predeterminada
    Then los productos se ordenan según su calificación promedio


#  5. Shop-Default Sorting Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on Sort by Newness ratings in Default sorting dropdown
#  5) Now user can view the popular products only

  Scenario: Ordenar por calificaciones de novedad
    And selecciona "Ordenar por calificaciones de novedad" en el menú desplegable de clasificación predeterminada
    Then deberá ver una lista de productos ordenados por calificaciones de novedad


#  6. Shop-Default Sorting Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on Sort by Low to High Item in Default sorting dropdown
#  5) Now user can view the popular products only

  Scenario: Ordenar productos por elemento de menor a mayor
    And selecciono "Ordenar por elemento de menor a mayor" en el menú desplegable    de clasificación predeterminada
    Then puede ver solo los productos en orden ascendente según el precio


#  7.Shop-Default Sorting Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on Sort by High to Low Item in Default sorting dropdown
#  5) Now user can view the popular products only

  Scenario: : Ordenar productos por precio de mayor a menor
    And selecciona "Ordenar por elemento de mayor a menor" en el menú desplegable de clasificación predeterminada
    Then el usuario deberá ver los productos ordenados por precio de mayor a menor.


#  8. Shop-Read More Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on read more button in home page
#  5) Read More option indicates the Out Of Stock.
#  6) User cannot add the product which has read more option as it was out of stock.

  Scenario: Probar la funcionalidad agotado con opción Leer más
    When hace click en el botón "Leer más" de un producto agotado
    Then ve que la opción Leer más indica que el producto está agotado
    And el usuario no debería ser capaz de agregar el producto al carrito de compras


#  9. Shop-Sale Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on Sale written product in home page
#  5) User can clearly view the actual price with old price striken for the sale written products

  Scenario: Verificar la venta de productos en la página de inicio
    And hace click en la opción de Venta de productos escritos en la página de inicio
    Then ve los productos que están en Venta y ve el precio real del producto con un precio anterior tachado debido a la venta


#  10.Shop-Add to Basket-View Basket Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on the Add To Basket button which adds that book to your basket
#  5) User can view that Book in the Menu item with price .
#  6) Now click on View Basket link which navigates to proceed to check out page.
#  7) Now user can find total and subtotal values just above the Proceed to Checkout button.
#  8) The total always < subtotal because taxes are added in the subtotal
#  9) Now click on Proceed to Check out button which navigates to payment gateway page.
#  10) User can view Billing Details,Order Details,Additional details and Payment gateway details.
#  11) Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
#  12) Now click on Place Order button to complete process
#  13) On clicking place order button user completes his process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.

  Scenario: : Agregar un libro al carrito y proceder al pago
    When hace click en el botón Agregar al carrito de un libro
    And hace click en el enlace Ver cesta para proceder a la página de pago
    When el usuario puede ver los valores totales y subtotales justo encima del botón "Continuar con el pago"
    And el subtotal es siempre menor que el subtotal, ya que los impuestos se agregan al total
    When hace click en el botón Proceed to checkout para ir a la página de la pasarela de pago
    And el usuario puede ver los detalles de facturación, los detalles del pedido, los detalles adicionales y los detalles de la pasarela de pago
    When completa sus datos en el formulario de detalles de facturación
    And hace click en el botón Place order para completar el proceso
    Then es redirigido a la página de confirmación del pedido con los detalles del pedido,detalles bancario y detalles de facturación


#  11.Shop-Add to Basket-View Basket through Item link
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on the Add To Basket button which adds that book to your basket
#  5) User can view that Book in the Menu item with price .
#  6) Now click on Item link which navigates to proceed to check out page.
#  7) Now user can find total and subtotal values just above the Proceed to Checkout button.
#  8) The total always < subtotal because taxes are added in the subtotal
#  9) Now click on Proceed to Check out button which navigates to payment gateway page.
#  10) User can view Billing Details,Order Details,Additional details and Payment gateway details.
#  11) Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
#  12) Now click on Place Order button to complete process
#  13) On clicking place order button user completes his process where the page navigates to Order confirmation page
#  with order details,bank details,customer details and billing details

  Scenario: Añadir articulos al carrito de compras y ver enlace del articulo- revisar titulo
    When hace click en el botón Agregar al carrito de un libro
    And hace click en el boton view basket y visualiza los importes total y sub total
    When hace click en el boton proceed to checkout
    And completa el formulario y selecciona una forma de pago
    And hace click en el boton place order
    Then se visualiza la pantalla de confirmacion de pedido y los datos de la factura


#  12. Shop-Add to Basket-View Basket-Tax Functionality
#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Click on the Add To Basket button which adds that book to your basket
#  5) User can view that Book in the Menu item with price .
#  6) Now click on Item link which navigates to proceed to check out page.
#  7) Now user can find total and subtotal values just above the Proceed to Checkout button.
#  8) The total always < subtotal because taxes are added in the subtotal
#  9) The tax rate variers for India compared to other countries
#  10) Tax rate for indian should be 2% and for abroad it should be 5%

  Scenario: Verificar los impuestos correspondientes para la india y el extranjero
    When hace click en el botón "Agregar al carrito" de un libro
    And hace click en el boton view basket y visualiza los importes total y sub total
    When hace click en el boton proceed to checkout
    Then se verifica la tasa impositiva para india es de porcentaje 2 y para el extranjero 5
