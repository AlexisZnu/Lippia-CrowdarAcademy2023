@MyAccount
Feature: : Inicio de sesión de usuario y acceso al Dashboard

  Background:
    Given que estoy en la página de inicio del sitio web


  @SesionExitosa
  Scenario Outline: Inicio de sesión exitoso y acceso al Dashboard
    When hace click en el menú Mi cuenta
    When escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    Then se redirije correctamente al Dashboard con toda la información necesaria

    Examples:
      | user                         | contrasenia                      |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 |


  @Pedidos
  Scenario Outline: El usuario ve sus pedidos en Mi Cuenta
    When hace click en el menú Mi cuenta
    And escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And efectua un click en el enlace de Pedidos
    Then ve sus pedidos

    Examples:
      | user                         | contrasenia                      |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 |

  @PedidosVista
  Scenario Outline: El usuario ve los detalles de su pedido en Mi Cuenta
    When hace click en el menú Mi cuenta
    And escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And efectua un click en el enlace de Pedidos
    And clickea en el botón de vista
    Then ve los detalles de su pedido, los detalles del cliente y los detalles de facturación

    Examples:
      | user                         | contrasenia                      |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 |


  @NumeroPedido
  Scenario Outline: El usuario ve el número del pedido, la fecha del pedido y el estado del pedido en Mi Cuenta
    When hace click en el menú Mi cuenta
    And escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And efectua un click en el enlace de Pedidos
    And clickea en el botón de vista
    Then ve el número del pedido, la fecha del pedido y el estado del pedido <detallesPedido>


    Examples:
      | user                         | contrasenia                      | detallesPedido |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 | Order Details  |



  @Direccion
  Scenario Outline: El usuario ve la dirección de facturación y envío en Mi Cuenta

    When hace click en el menú Mi cuenta
    And escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And realiza un click en el enlace de Dirección de envío y facturación
    Then ve la dirección de facturación y envío en Mi Cuenta <direccion>

    Examples:
      | user                         | contrasenia                      | direccion       |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 | Billing Address |



  @EditarDireccion
  Scenario Outline: El usuario puede editar la dirección de envío en Mi Cuenta
    When hace click en el menú Mi cuenta
    And escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And realiza un click en el enlace de Dirección de envío y facturación
    And vuelve a clickear en el botón de edición en la dirección de envío
    Then puede editar la dirección de envío <edicionEnvio>

    Examples:
      | user                         | contrasenia                      | edicionEnvio    |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 | Billing Address |




  @EditarCuenta
  Scenario Outline: El usuario puede ver y cambiar los detalles de su cuenta en Mi Cuenta
    When hace click en el menú Mi cuenta
    And escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And vuelve a hacer click en el enlace de Editar su contraseña y los detalles de su cuenta
    Then es redirigido a la página donde puede optar por la opcion de Cambiar contraseña <cambioContrasenia>

    Examples:
      | user                         | contrasenia                      | cambioContrasenia |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 | First name        |


  @Logout
  Scenario Outline: El usuario realiza un Login y Logout correctamente de la pagina
    When hace click en el menú Mi cuenta
    And escribe su usuario valido <user> y contraseña valida <contrasenia> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And hace click en el enlace de boton Logout
    Then es redirigido a la pagina de inicio con su cuenta deslogueada correctamente <mensaje>

    Examples:
      | user                         | contrasenia                      | mensaje |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 | Login   |
