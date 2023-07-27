# EjercicioAPIS
Utilizando un software para pruebas de servicios REST realizar las siguientes pruebas, identificando las entradas, capturando las salidas, test, variables, etc, en cada uno de los siguientes casos:

• Añadir una mascota a la tienda
• Consultar la mascota ingresada previamente (Búsqueda por ID)
• Actualizar el nombre de la mascota y el estatus de la mascota a “sold”
• Consultar la mascota modificada por estatus (Búsqueda por estatus)


Instrucciones para ejecutar las pruebas Karate API desde la terminal y desde el IDE:

1. Requisitos previos:
   - Asegúrate de tener Java JDK 8 (o una versión superior) instalado en tu sistema.
   - Asegúrate de tener Maven instalado en tu sistema (si deseas ejecutar las pruebas desde la terminal).

2. Descargar el proyecto:
   - Descarga el proyecto "EjercicioAPIS" desde el repositorio git (o extrae el código fuente si lo tienes en un archivo ZIP).

3. Estructura de directorios:
   - Asegúrate de que la estructura de directorios del proyecto sea la siguiente:
EjercicioAPIS
├── src
│ └── test
│ └── java
│ └── com
│ └── prueba
│ └── karate
│ └── tests
│ └── add_pet.feature
│ └── another_feature.feature
│ └── yet_another_feature.feature
│ └── ...
│ └── TestRunner.java
└── pom.xml

markdown
Copy code
- Los archivos `.feature` deben estar en la carpeta `com/prueba/karate/tests`.

4. Ejecutar desde la terminal:
- Abre una terminal o línea de comandos.
- Navega al directorio raíz del proyecto "EjercicioAPIS" (donde se encuentra el archivo `pom.xml`).
- Ejecuta las pruebas con el siguiente comando:
  ```
  mvn test
  ```
- Maven compilará el proyecto y ejecutará las pruebas de Karate API. Los resultados se mostrarán en la consola.

5. Ver el informe de Karate:
- Después de que las pruebas se ejecuten con éxito, podrás ver un informe detallado de Karate.
- Abre tu navegador web y copia y pega la siguiente URL en la barra de direcciones:
  ```
ejemplo:
  file:///C:/Users/antox/IdeaProjects/EjercicioAPIS/target/karate-reports/karate-summary.html
  ```
- Presiona Enter para acceder al informe de Karate generado automáticamente.
- El informe contiene detalles sobre los escenarios de prueba, sus resultados y más información útil.

6. Ejecutar desde el IDE (IntelliJ IDEA):
- Abre IntelliJ IDEA (asegúrate de tener la edición Ultimate o Community con el complemento de Karate instalado).
- Importa el proyecto "EjercicioAPIS" seleccionando el archivo `pom.xml`.
- Abre la clase `TestRunner` en el paquete `com.example.tests`.
- Ejecuta la clase `TestRunner` como una prueba de JUnit haciendo clic derecho sobre la clase y seleccionando "Run TestRunner".
- IntelliJ IDEA ejecutará las pruebas de Karate API y los resultados se mostrarán en la pestaña de "Run".

7. Verificación de resultados:
- Después de ejecutar las pruebas, verifica los resultados en la consola (terminal) o en la pestaña de "Run" del IDE.
- Si todo funciona correctamente, deberías ver los resultados de las pruebas Karate API con detalles sobre los escenarios ejecutados.
