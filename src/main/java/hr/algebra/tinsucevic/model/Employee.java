package hr.algebra.tinsucevic.model;

import hr.algebra.tinsucevic.model.trains.Train;
import hr.algebra.tinsucevic.model.vehicles.IChargeable;
import hr.algebra.tinsucevic.model.vehicles.Vehicle;

public class Employee {
    String name;
    String surname;
    double provision;
    double salary;
    double profitGenerated;

    public double getSalary() {
        return salary;
    }

    public double getProfitGenerated() {
        return profitGenerated;
    }

    public Employee(String name, String surname, double provision){
        this.name = name;
        this.surname = surname;
        this.provision = provision;
        this.salary = 0;
        this.profitGenerated = 0;
    }

    public void ParkVehicle(Vehicle vehicle, Train train){
        if (vehicle.NeedsRefueling())
        {
            vehicle.Refuel();
        }
        train.AddVehicle(vehicle);
        IChargeable price = (IChargeable) vehicle;
        double tempProvision = provision/100 * price.CalculateCharge();
        salary += tempProvision;
        profitGenerated += price.CalculateCharge() - tempProvision;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", provision: " + provision + "%" +
                ", salary: " + salary + " kn" +
                ", profitGenerated: " + profitGenerated + " kn" +
                '}';
    }
}
