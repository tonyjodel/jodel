import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class DamageCalculatorTest {

    private DamageCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DamageCalculator();
    }

    @Test
    @DisplayName("Dégâts de base sans bonus")
    void calculDegatsBase() {
        int force = 10;
        int defense = 5;
        int degats = calculator.calculerDegats(force, defense);
        assertEquals(5, degats);
    }

    @Test
    @DisplayName("Dégâts minimum de 1")
    void calculDegatsMinimum() {
        assertEquals(1, calculator.calculerDegats(0, 10));
    }

    @Test
    @DisplayName("Bonus de force")
    void calculAvecBonusForce() {
        int force = 10;
        int defense = 5;
        double bonusForce = 1.5;
        int degats = calculator.calculerDegats(force, defense, bonusForce);
        assertEquals(10, degats);
    }

    @Test
    @DisplayName("Bonus invalide")
    void calculAvecBonusInvalide() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculerDegats(10, 5, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculerDegats(10, 5, -1);
        });
    }

    @ParameterizedTest
    @CsvSource({
        "0, 0, 1",
        "100, 0, 100",
        "0, 100, 1",
        "100, 100, 1"
    })
    @DisplayName("Cas limites de dégâts")
    void calculCasLimites(int force, int defense, int attendu) {
        assertEquals(attendu, calculator.calculerDegats(force, defense));
    }
}
