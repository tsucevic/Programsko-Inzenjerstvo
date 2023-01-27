package hr.algebra.tinsucevic.model.vehicles;

public class Van extends Vehicle implements IChargeable {

    public Van(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public double CalculateCharge() {
        return 80.00;
    }

    @Override
    public String toString() {
        return "Van{" +
                "Price: " + CalculateCharge() + " kn, " +
                "Fuel percentage: " + getFuelPercentage() +"%"+ '}';
    }
}
