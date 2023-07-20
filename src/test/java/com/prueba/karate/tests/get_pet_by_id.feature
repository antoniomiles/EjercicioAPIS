Feature: Consultar la mascota ingresada previamente (Búsqueda por ID)

  Background:
    * url 'https://petstore.swagger.io/v2/pet'

  Scenario: Consultar una mascota por ID
    Given path 12345
    When method get
    Then status 200
    And match response contains { "id": 12345, "name": "Fluffy", "status": "available" }