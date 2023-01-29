package hr.algebra.tinsucevic.model.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    @Test
    void calculateCharge() {
        Bus bus = new Bus(FuelType.GAS);
        assertEquals(70.00, bus.CalculateCharge());
    }
}