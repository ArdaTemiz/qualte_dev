package test.temiz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VoitureTest {

    @Test
    void when_getmarque_should_return_same_marque_of_instanciate_car(){

        // Arrange
        Voiture voiture = new Voiture("Ferrari", 5000);
        // Act
        String expectedMarque = "Ferrari";
        String marque= voiture.getMarque();
        // Verify
        Assertions.assertEquals(marque, expectedMarque, "Doit être " +
                expectedMarque) ;
    }
// ...
}
