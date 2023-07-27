package com.prueba.karate.tests;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import java.util.ArrayList;
import java.util.List;

public class TestNGTestSuiteRunner {
    public static void main(String[] args) {
        // Crear una instancia de TestNG
        TestNG testNG = new TestNG();

        // Crear una lista para almacenar las suites de pruebas
        List<XmlSuite> suites = new ArrayList<>();

        // Agregar las clases de prueba generadas a la lista de suites
        suites.add(createXmlSuite("src/test/java/com/prueba/karate/tests/add_pet.feature"));
        suites.add(createXmlSuite("src/test/java/com/prueba/karate/tests/get_pet_by_id.feature"));
        suites.add(createXmlSuite("src/test/java/com/prueba/karate/tests/get_pet_by_status.feature"));
        suites.add(createXmlSuite("src/test/java/com/prueba/karate/tests/update_pet.feature"));

        // Asignar las suites de pruebas a TestNG
        testNG.setXmlSuites(suites);

        // Ejecutar las pruebas
        testNG.run();
    }

    // Método para crear una suite de pruebas para una clase específica
    private static XmlSuite createXmlSuite(String featureFilePath) {
        XmlSuite suite = new XmlSuite();
        suite.setName("Suite-" + featureFilePath);
        List<String> files = new ArrayList<>();
        files.add(featureFilePath);
        suite.setSuiteFiles(files);
        return suite;
    }
}