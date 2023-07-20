Feature: Añadir una mascota a la tienda

  Scenario: Crear una nueva mascota
    Given url 'https://petstore.swagger.io/v2/pet'
    And request
    """
    {
        "id": 12345,
        "category": {
            "id": 1,
            "name": "dogs"
        },
        "name": "Fluffy",
        "photoUrls": [],
        "tags": [
            {
                "id": 0,
                "name": "string"
            }
        ],
        "status": "available"
    }
    """
    When method post
    Then status 200