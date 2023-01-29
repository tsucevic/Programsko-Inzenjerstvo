package hr.algebra.tinsucevic.model.vehicles;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Vehicle vehicle = new Vehicle(FuelType.GAS);

    @Test
    void getFuelPercentage() {
        vehicle.setFuelPercentage(15);
        assertEquals(15,vehicle.getFuelPercentage());
    }

    @Test
    void getFuelType() {
        assertEquals(FuelType.GAS,vehicle.getFuelType());
    }

    @Test
    void refuel() {
        vehicle.Refuel();
        assertEquals(100,vehicle.getFuelPercentage());
    }

    @Test
    void needsRefueling() {
        vehicle.setFuelPercentage(5);
        assertTrue(vehicle.NeedsRefueling());
    }
}