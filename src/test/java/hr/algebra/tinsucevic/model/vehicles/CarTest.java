package hr.algebra.tinsucevic.model.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void calculateCharge() {
        Car car = new Car(FuelType.GAS);
        assertEquals(50.00, car.CalculateCharge());
    }
}