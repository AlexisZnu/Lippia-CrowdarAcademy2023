@Shop
Feature: Shop

  Background:
    Given que el usuario está en la página de inicio practice.automationtesting.in
    And hace click en el menu Shop


@MenorAMayor
  Scenario: Ordenar productos por elemento de menor a mayor
    And selecciono Ordenar por elemento de menor a mayor en el menú desplegable de clasificación predeterminada
    Then puede ver solo los productos ordenador de precio menor a mayor según el precio


@MayorAMenor
  Scenario: : Ordenar productos por precio de mayor a menor
    And selecciona Ordenar por elemento de mayor a menor en el menú desplegable de clasificación predeterminada
    Then el usuario ve los productos ordenados por precio de mayor a menor


@LeerMas
  Scenario: Probar la funcionalidad agotado con opción Leer más
    When hace click en el botón Leer más de un producto agotado
    Then ve que la opción Leer más indica que el producto está agotado y no debería ser capaz de agregar el producto al carrito de compras

