@Registration
Feature: : Registro e inicio de sesión

  Background:
    Given que el usuario se encuentra en la página de inicio de sesión

  @CaminoFeliz
  Scenario Outline: Registro e inicio de sesión exitosos

    When hace click en el botón de menú de Mi cuenta
    And ingresa su email valido en el campo <email> y una contrasenia valida en el campo de <contrasenia>
    And hace click en el botón Registrarse
    Then es registrado exitosamente y redirigido a la página de inicio de su cuenta


    Examples:
      | email                    | contrasenia                      |
      | dfdfgatyrfliud@gmail.com | asdasdasdasdasdasfasflgroekgr123 |


  @EmailInvalido
  Scenario Outline: : El usuario desea registrarse en el sitio web de práctica de automatización de pruebas.
    When hace click en el botón de menú de Mi cuenta
    And ingresa un email inválida en el campo Email <email> e ingresa una contrasenia en el campo <contrasenia>
    And hace click en el botón Registrarse
    Then el sistema muestra un mensaje de advertencia que dice <mensaje>

    Examples:
      | email                     | contrasenia           | mensaje                               |
      | asddasdasdasd@12111321321 | sdfsdfsdfasdasdsdf123 | Please provide a valid email address. |