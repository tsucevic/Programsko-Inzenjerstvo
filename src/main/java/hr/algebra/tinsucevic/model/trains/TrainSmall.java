package hr.algebra.tinsucevic.model.trains;

import hr.algebra.tinsucevic.model.vehicles.Vehicle;
import hr.algebra.tinsucevic.model.vehicles.Car;
import hr.algebra.tinsucevic.model.vehicles.Van;

public class TrainSmall extends Train {

    private static final int MAXIMUM_AVAILABLE_SLOTS = 8;

    public TrainSmall() {
        super(MAXIMUM_AVAILABLE_SLOTS);
    }

    @Override
    public void AddVehicle(Vehicle vehicle) {
        if (super.vehicleList.size() < MAXIMUM_AVAILABLE_SLOTS) {
            if (vehicle instanceof Car || vehicle instanceof Van) {
                super.vehicleList.add(vehicle);
            } else {
                System.out.println("This vehicle is not allowed on this type of train.");
            }
        } else {
            System.out.println("The train is full and cannot accept any more vehicles.");
        }
    }

}
