package hr.algebra.tinsucevic.model.vehicles;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType, FuelType fuelType){
        if (vehicleType==null)
        {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")){
            return new Car(fuelType);
        } else if (vehicleType.equalsIgnoreCase("LORRY")){
            return new Lorry(fuelType);
        }
        else if (vehicleType.equalsIgnoreCase("VAN")){
            return new Van(fuelType);
        }
        else if (vehicleType.equalsIgnoreCase("BUS")){
            return new Bus(fuelType);
        }
        else {
            return null;
        }
    }
}
