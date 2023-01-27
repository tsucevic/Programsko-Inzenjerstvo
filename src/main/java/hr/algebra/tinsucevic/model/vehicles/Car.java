package hr.algebra.tinsucevic.model.vehicles;

public class Car extends Vehicle implements IChargeable {
    public Car(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public double CalculateCharge() {
        return 50.00;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Price: " + CalculateCharge() + " kn, " +
                "Fuel percentage: " + getFuelPercentage() +"%"+ '}';
    }
}

