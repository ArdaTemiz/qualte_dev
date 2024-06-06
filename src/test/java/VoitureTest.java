import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {
    @Test
    void testGetPrix_ShouldReturnCorrectPrice(){
        // Arrange
        Voiture car = new Voiture("Toyota", 20000);

        // Act
        double expectedPrice = 20000;
        double price = car.getPrix();

        // Verify
        assertEquals(price, expectedPrice, "Doit être " + expectedPrice);
    }

    @Test
    void testSetPrix_ShouldSetPrice(){
        // Arrange
        Voiture car = new Voiture("Honda", 15000);

        // Act
        car.setPrix(30000);

        // Verify
        assertEquals(30000, car.getPrix());
    }

    @Test
    void testGetMarque_ShouldReturnSameMarqueOfInstantiatedCar(){
        // Arrange
        Voiture car = new Voiture("Nissan", 18000);

        // Act
        String expectedMarque = "Nissan";
        String marque = car.getMarque();

        // Verify
        assertEquals(marque, expectedMarque, "Doit être " + expectedMarque);
    }

    @Test
    void testSetMarque_ShouldChangeMarqueOfInstantiatedCar(){
        // Arrange
        Voiture car = new Voiture("Hyundai", 22000);

        // Act
        car.setMarque("Kia");

        // Verify
        assertEquals("Kia", car.getMarque());
    }

    @Test
    void testToString_ShouldReturnToStringOfInstantiatedCar(){
        // Arrange
        Voiture car = new Voiture("Ford", 25000);

        // Act
        String expectedToString = "Voiture{marque='Ford', prix=25000.0}";
        String toString = car.toString();

        // Verify
        assertEquals(expectedToString, toString);
    }
}
