package hr.algebra.tinsucevic.model.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LorryTest {

    @Test
    void calculateCharge() {
        Lorry lorry = new Lorry(FuelType.GAS);
        assertEquals(90.00, lorry.CalculateCharge());
    }
}