@Login
Feature: Inicio de sesión en la página web de practice.automationtesting

  Background:
    Given que el usuario está en la página de inicio practice.automationtesting.in
    And  hace click en el menú Mi cuenta


  @CasoFeliz
  Scenario Outline: Iniciar sesión con un usuario y contraseña válidos
    When escribe su usuario valido <user> y contraseña valida <pass> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    Then se redirije correctamente al Dashboard con toda la información necesaria

    Examples:
      | user                         | pass                             |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 |


  @CredencialInconrrecta
  Scenario Outline: Iniciar sesión con un usuario y contraseña incorrectos
    And ingresa un usuario <user> y contrasenia <pass> invalido  en el campo de texto de usuario y contrasenia
    And hace click en el botón de inicio Inicio de sesion
    Then se muestra un mensaje <mensaje> de error apropiado y se solicita al usuario que vuelva a ingresar sus credenciales

    Examples:
      | user                                 | pass                       | mensaje                                            |
      | asfasfasdasdasdasfasfasfas@gmail.com | asfasfasdasdasdasfasfasfas | A user could not be found with this email address. |


  @SinContrasenia
  Scenario Outline: Iniciar sesión con nombre de usuario correcto y contraseña vacía
    And ingresa un usuario valido <user> en el campo de nombre de usuario y deja vacio el cuadro de texto de contrasenia
    And hace click en el botón de inicio Inicio de sesion
    Then se muestra un mensaje <mensaje> de error y se solicita al usuario que vuelva a ingresar sus credenciales

    Examples:
      | user                                 | mensaje               |
      | asfasfasdasdasdasfasfasfas@gmail.com | Password is required. |



  @SinUsuario
  Scenario Outline: Iniciar sesión con nombre de usuario vacío y contraseña válida
    When deja vacio el cuadro de texto de nombre de usuario
    And ingresa una contraseña válida <pass> en el cuadro de texto de contrasenia
    And hace click en el botón de inicio Inicio de sesion
    Then se muestra un mensaje  de error <mensaje> y se solicita al usuario que vuelva a ingresar sus credenciales

    Examples:
      | pass                             | mensaje               |
      | asdasdasdasdasdasfasflgroekgr123 | Username is required. |


  @SinCredenciales
  Scenario Outline: : Iniciar sesión con nombre de usuario vacío y contraseña válida
    When deja vacio el cuadro de texto de nombre de usuario y de contrasenia
    And hace click en el botón de inicio Inicio de sesion
    Then se muestra un mensaje  de error <mensaje> y se solicita al usuario que vuelva a ingresar sus credenciales

    Examples:
      | mensaje               |
      | Username is required. |



  @ContraseniaOculta
  Scenario Outline: : La contraseña debe ser enmascarada
    When el usuario ingresa con contrasenia valida en el campo de contrasenia <pass>
    Then se muestra la contraseña enmascarada y es reemplazados por asteriscos o puntos y la contraseña no debe ser visible en la pantalla

    Examples:
      | pass                       |
      | asfasfasdasdasdasfasfasfas |



  @CambioDeCaracter
  Scenario Outline: El inicio de sesión debe manejar mayúsculas y minúsculas
    When ingresa su usuario en el campo de usuario <user>, cambiando algunas letras a mayúsculas o minúsculas
    And ingresa una contraseña en el cuadro de texto de contraseña <pass>, cambiando algunas letras a mayúsculas o minúsculas
    And hace click en el botón de inicio Inicio de sesion
    Then se muestra un mensaje <error> que debe solicitar al usuario si perdio su contrasenia

    Examples:
      | user                         | pass                       | error                                                                                                    |
      | SDAaaaammlerhlklsd@gmail.com | ASfasfasdasdasdasfasfasfas | Error: the password you entered for the username SDAaaaammlerhlklsd@gmail.com is incorrect. Lost your password? |


  @Logoutfeliz
  Scenario Outline: Autenticación de inicio de sesión exitosa y cierre de sesión exitoso
    When escribe su usuario valido <user> y contraseña valida <pass> en el cuadro de texto
    And hace click en el botón de inicio Inicio de sesion
    And hace click en el enlace de boton Logout
    Then no debe estar conectado a su cuenta y se debe mostrar una página web general

    Examples:
      | user                         | pass                             |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 |