package hr.algebra.tinsucevic.model;

import hr.algebra.tinsucevic.model.trains.Train;
import hr.algebra.tinsucevic.model.trains.TrainSmall;
import hr.algebra.tinsucevic.model.vehicles.Car;
import hr.algebra.tinsucevic.model.vehicles.FuelType;
import hr.algebra.tinsucevic.model.vehicles.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void parkVehicle() {
        Vehicle vehicle = new Car(FuelType.GAS);
        Train train = new TrainSmall();
        Employee employee = new Employee("John", "Doe", 10);

        employee.ParkVehicle(vehicle, train);

        assertEquals(45.00, employee.getSalary());
        assertEquals(5.00, employee.getProfitGenerated());
    }
}