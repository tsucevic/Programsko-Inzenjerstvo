package hr.algebra.tinsucevic;

import hr.algebra.tinsucevic.model.trains.Train;
import hr.algebra.tinsucevic.model.vehicles.Vehicle;
import hr.algebra.tinsucevic.model.Employee;
import hr.algebra.tinsucevic.model.trains.TrainSmall;
import hr.algebra.tinsucevic.model.trains.TrainBig;
import hr.algebra.tinsucevic.model.vehicles.*;

public class Solid  {


    public static void main(String[] args) {

        Train trainSmall = new TrainSmall();
        Train trainBig = new TrainBig();
        Employee employee1 = new Employee("Tess","Tickle",10);
        Employee employee2 = new Employee("Mike","Hunt",11);

        Vehicle car = new Car(FuelType.GAS);
        Vehicle van = new Van(FuelType.GAS);
        Vehicle bus = new Bus(FuelType.BATTERY);
        Vehicle lorry = new Lorry(FuelType.BATTERY);

        employee1.ParkVehicle(bus, trainBig);
        employee2.ParkVehicle(lorry, trainBig);
        System.out.println(trainBig);

        employee2.ParkVehicle(car, trainSmall);
        employee1.ParkVehicle(van, trainSmall);
        System.out.println(trainSmall);

        Vehicle carFromFactory = VehicleFactory.getVehicle("car", FuelType.BATTERY);
        Vehicle busFromFactory = VehicleFactory.getVehicle("bus", FuelType.GAS);
        Vehicle vanFromFactory = VehicleFactory.getVehicle("van", FuelType.BATTERY);
        Vehicle lorryFromFactory = VehicleFactory.getVehicle("lorry", FuelType.GAS);

        employee1.ParkVehicle(busFromFactory, trainBig);
        employee1.ParkVehicle(lorryFromFactory, trainBig);
        System.out.println(trainBig);

        employee2.ParkVehicle(carFromFactory, trainSmall);
        employee2.ParkVehicle(vanFromFactory, trainSmall);
        System.out.println(trainSmall);

        System.out.println(employee1);
        System.out.println(employee2);
    }


}