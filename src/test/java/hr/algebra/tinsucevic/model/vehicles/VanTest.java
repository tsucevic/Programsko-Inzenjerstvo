package hr.algebra.tinsucevic.model.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VanTest {

    @Test
    void calculateCharge() {
        Van van = new Van(FuelType.GAS);
        assertEquals(80.00, van.CalculateCharge());
    }
}