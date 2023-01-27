package hr.algebra.tinsucevic.model.vehicles;

public class Vehicle implements IRefuelable {
    private double fuelPercentage;
    private final FuelType fuelType;

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public Vehicle(FuelType fuelType){
        this.fuelType = fuelType;
        this.fuelPercentage = Math.round((Math.random()*100+1)*100.0)/100.0;
        // we'll assume that the vehicle comes with a random percentage of fuel for demo simplicity
        // in a real world scenario we'd have a constructor with fuel percentage
    }

    @Override
    public void Refuel() {
        fuelPercentage = 100;
    }

    @Override
    public boolean NeedsRefueling() {
        if (fuelType == FuelType.GAS)
        {
            return fuelPercentage <=10;
        } else if (fuelType ==  FuelType.BATTERY) {
            return  fuelPercentage <=11;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Fuel percentage: " + fuelPercentage + "%, " +
                "Type of fuel" + fuelType + '}';
    }
}
