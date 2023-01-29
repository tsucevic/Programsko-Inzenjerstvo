package hr.algebra.tinsucevic.model.trains;

import hr.algebra.tinsucevic.model.vehicles.FuelType;
import hr.algebra.tinsucevic.model.vehicles.Lorry;
import hr.algebra.tinsucevic.model.vehicles.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainBigTest {
    @Test
    void addVehicle() {
        TrainBig trainBig = new TrainBig();
        Vehicle vehicle = new Lorry(FuelType.GAS);
        trainBig.AddVehicle(vehicle);
        assertEquals(1, trainBig.vehicleList.size());
        assertEquals(vehicle, trainBig.vehicleList.get(0));
    }
}