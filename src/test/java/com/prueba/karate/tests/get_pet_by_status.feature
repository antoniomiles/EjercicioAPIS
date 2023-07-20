Feature: Actualizar el nombre y estatus de una mascota

  Scenario: Actualizar el nombre y estatus de una mascota
    Given url 'https://petstore.swagger.io/v2/pet'
    And request
    """
    {
        "id": 12345,
        "category": {
            "id": 1,
            "name": "dogs"
        },
        "name": "New Fluffy",
        "photoUrls": [],
        "tags": [
            {
                "id": 0,
                "name": "string"
            }
        ],
        "status": "sold"
    }
    """
    When method put
    Then status 200