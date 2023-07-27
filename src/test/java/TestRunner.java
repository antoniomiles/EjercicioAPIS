import com.intuit.karate.junit5.Karate;

class TestRunner {
    @Karate.Test
    Karate testAll() {
        return Karate.run("src/test/java/com/prueba/karate/tests/add_pet.feature",
                "src/test/java/com/prueba/karate/tests/get_pet_by_id.feature",
                "src/test/java/com/prueba/karate/tests/get_pet_by_status.feature",
                "src/test/java/com/prueba/karate/tests/update_pet.feature");


    }
}