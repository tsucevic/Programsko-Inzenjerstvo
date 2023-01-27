package hr.algebra.tinsucevic.model.vehicles;

public class Bus extends Vehicle implements IChargeable {

    public Bus(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public double CalculateCharge() {
        return 70.00;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Price: " + CalculateCharge() + " kn, " +
                "Fuel percentage: " + getFuelPercentage() +"%"+ '}';
    }
}
