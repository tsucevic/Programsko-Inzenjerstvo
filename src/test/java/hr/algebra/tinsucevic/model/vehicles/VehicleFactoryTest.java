package hr.algebra.tinsucevic.model.vehicles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    @Test
    void getVehicle() {
        Vehicle vehicle = VehicleFactory.getVehicle("CAR", FuelType.GAS);
        assertTrue(vehicle instanceof Car);
        assertEquals(FuelType.GAS, vehicle.getFuelType());
    }
}