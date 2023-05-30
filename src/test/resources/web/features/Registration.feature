@Registration
Feature:Registro e inicio de sesión

  Background:
    Given que el usuario se encuentra en la página de inicio de sesión

  @CaminoFeliz
  Scenario Outline: Registro e inicio de sesión exitosos

    When hace click en el menú Mi cuenta
    And ingresa su email valido en el campo <email> y una contrasenia valida en el campo de <contrasenia>
    And hace click en el botón Registrarse
    Then es registrado exitosamente y redirigido a la página de inicio de su cuenta


    Examples:
      | email                      | contrasenia                      |
      | aqsdffgqwerfliud@gmail.com | asdasdasdasdasdasfasflgroekgr123 |


  @EmailInvalido
  Scenario Outline: El usuario desea registrarse en el sitio web de práctica de automatización de pruebas
    When hace click en el menú Mi cuenta
    And ingresa un email inválida en el campo Email <email> e ingresa una contrasenia en el campo <contrasenia>
    And hace click en el botón Registrarse
    Then el sistema muestra un mensaje de advertencia que dice <mensaje>

    Examples:
      | email                     | contrasenia           | mensaje                               |
      | asddasdasdasd@12111321321 | sdfsdfsdfasdasdsdf123 | Please provide a valid email address. |


  @EmptyEmail
  Scenario Outline: : Registro con Email vacío
    When hace click en el menú Mi cuenta
    And deja vacía en el campo de texto del email e ingresa una contraseña en el campo <contrasenia>
    And hace click en el botón Registrarse
    Then el registro falla con un mensaje de advertencia que indica <mensaje>

    Examples:
      | contrasenia                      | mensaje                               |
      | asdasdasdasdasdasfasflgroekgr123 | Please provide a valid email address. |



  @EmptyPassword
  Scenario Outline: : Registro con contraseña vacía
    When hace click en el menú Mi cuenta
    And ingresa un email <email> válida en el campo de texto del email y deja vacía en el campo de contrasenia
    And hace click en el botón Registrarse
    Then el registro del usuario falla con un mensaje  que indica un error en la contrasenia <mensaje>

    Examples:
      | email                     | mensaje                           |
      | asdasdasdasdasd@gmail.com | Please enter an account password. |



  @EmptyEmailAndPassword
  Scenario Outline: : Registro con Email y contraseña vacíos
    When hace click en el menú Mi cuenta
    And deja vacía en el campo de texto del email y deja vacía en el campo de contrasenia
    And hace click en el botón Registrarse
    Then el registro falla con un mensaje de advertencia que indica <mensaje>
    Examples:
      | mensaje                               |
      | Please provide a valid email address. |