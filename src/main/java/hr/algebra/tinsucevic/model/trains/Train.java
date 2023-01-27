package hr.algebra.tinsucevic.model.trains;

import hr.algebra.tinsucevic.model.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class Train {

    int availableSlots;
    protected List<Vehicle> vehicleList;

    public Train(int availableSlots){
        this.availableSlots = availableSlots;
        this.vehicleList =new ArrayList<>();
    }

    public abstract void AddVehicle(Vehicle vehicle);

    @Override
    public String toString() {
        return "Train{" +
                "vehicleList= " + vehicleList +
                '}';
    }
}
