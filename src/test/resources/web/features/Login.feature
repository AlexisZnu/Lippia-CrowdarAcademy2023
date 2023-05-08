@Login
Feature: Inicio de sesión en la página web de practice.automationtesting

  Background:
    Given que el usuario está en la página de inicio practice.automationtesting.in
    And  hace click en el menú Mi cuenta


  @CasoFeliz
  Scenario Outline: Iniciar sesión con un usuario y contraseña válidos
    When escribe su usuario valido <user> y contraseña valida <pass> en el cuadro de texto
    And hace click en el botón de inicio de sesión
    Then se redirije correctamente al Dashboard con toda la información necesaria

    Examples:
      | user                         | pass                             |
      | sdaaaaammlerhlklsd@gmail.com | asdasdasdasdasdasfasflgroekgr123 |


  @CredencialInconrrecta
  Scenario Outline: Iniciar sesión con un usuario y contraseña incorrectos
    And ingresa un usuario <user> y contrasenia <pass> invalido  en el campo de texto de usuario y contrasenia
    And hace click en el botón de inicio de sesión
    Then se muestra un mensaje <mensaje> de error apropiado y se solicita al usuario que vuelva a ingresar sus credenciales

    Examples:
      | user                                 | pass                       | mensaje                                            |
      | asfasfasdasdasdasfasfasfas@gmail.com | asfasfasdasdasdasfasfasfas | A user could not be found with this email address. |
