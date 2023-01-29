package hr.algebra.tinsucevic.model.trains;

import hr.algebra.tinsucevic.model.vehicles.FuelType;
import hr.algebra.tinsucevic.model.vehicles.Van;
import hr.algebra.tinsucevic.model.vehicles.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainSmallTest {

    @Test
    void addVehicle() {
        TrainSmall trainSmall = new TrainSmall();
        Vehicle vehicle = new Van(FuelType.GAS);
        trainSmall.AddVehicle(vehicle);
        assertEquals(1, trainSmall.vehicleList.size());
        assertEquals(vehicle, trainSmall.vehicleList.get(0));
    }
}