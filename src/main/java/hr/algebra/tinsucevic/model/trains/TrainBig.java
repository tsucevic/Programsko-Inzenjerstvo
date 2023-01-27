package hr.algebra.tinsucevic.model.trains;

import hr.algebra.tinsucevic.model.vehicles.Vehicle;
import hr.algebra.tinsucevic.model.vehicles.Bus;
import hr.algebra.tinsucevic.model.vehicles.Lorry;

public class TrainBig extends Train {
    private static final int MAXIMUM_AVAILABLE_SLOTS =6 ;


    public TrainBig() {
        super(MAXIMUM_AVAILABLE_SLOTS);
    }

    @Override
    public void AddVehicle(Vehicle vehicle) {
        if (super.vehicleList.size()< MAXIMUM_AVAILABLE_SLOTS) {
            if (vehicle instanceof Lorry || vehicle instanceof Bus) {
                super.vehicleList.add(vehicle);
            } else {
                System.out.println("This vehicle is not allowed on this type of train.");
            }
        } else {
            System.out.println("The train is full and cannot accept any more vehicles.");
        }
    }
}
