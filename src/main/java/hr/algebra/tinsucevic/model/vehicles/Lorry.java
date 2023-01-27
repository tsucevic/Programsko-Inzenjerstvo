package hr.algebra.tinsucevic.model.vehicles;

public class Lorry extends Vehicle implements IChargeable {
    public Lorry(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public double CalculateCharge() {
        return 90.00;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "Price: " + CalculateCharge() + " kn, " +
                "Fuel percentage: " + getFuelPercentage() +"%"+ '}';
    }
}
