package com.FactoryPattern;

public class Client {

	public static void main(String[] args) {
		VehicleFactory obj1 = new CarFactory();
		obj1.createVehicle();
		obj1.driveVehicle();
		
		VehicleFactory obj2 = new TruckFactory();
		obj2.createVehicle();
		obj2.driveVehicle();
		
		VehicleFactory obj3 = new MotorcycleFactory();
		obj3.createVehicle();
		obj3.driveVehicle();

	}

}
