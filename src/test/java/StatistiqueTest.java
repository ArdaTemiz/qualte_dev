import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatistiqueTest {

    @Test
    void testPrix_WithLessThanFiveCars_ShouldReturnCorrectPrice() {
        // Arrange
        StatistiqueVoiture statistique = new StatistiqueVoiture();
        statistique.ajouter(new Voiture("Toyota", 20000));
        statistique.ajouter(new Voiture("Honda", 15000));
        statistique.ajouter(new Voiture("Nissan", 18000));
        statistique.ajouter(new Voiture("Hyundai", 22000));

        // Act
        int expectedPrice = 20000 + 15000 + 18000 + 22000; // No discount
        int actualPrice = statistique.prix();

        // Verify
        assertEquals(expectedPrice, actualPrice, "Le prix total doit être " + expectedPrice);
    }

    @Test
    void testPrix_WithMoreThanFiveCars_ShouldApplyDiscountsCorrectly() {
        // Arrange
        StatistiqueVoiture statistique = new StatistiqueVoiture();
        statistique.ajouter(new Voiture("Toyota", 20000));
        statistique.ajouter(new Voiture("Honda", 15000));
        statistique.ajouter(new Voiture("Nissan", 18000));
        statistique.ajouter(new Voiture("Hyundai", 22000));
        statistique.ajouter(new Voiture("Kia", 25000));
        statistique.ajouter(new Voiture("Ford", 30000));

        // Act
        int expectedPrice = (20000 + 15000 + 18000 + 22000 + 25000) // No discount on first 5 cars
                + (30000 - (30000 * 5 / 100)); // 5% discount on the 6th car
        int actualPrice = statistique.prix();

        // Verify
        assertEquals(expectedPrice, actualPrice, "Le prix total avec remises doit être " + expectedPrice);
    }

}
