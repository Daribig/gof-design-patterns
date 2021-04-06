package Creational.AbstractFactory;

import Creational.AbstractFactory.Factories.CarAndSatelliteFactories.RedCarAndSatelliteFactory;
import Creational.AbstractFactory.Factories.CarFactories.RedCarFactory;
import Creational.AbstractFactory.Factories.SatelliteFactories.RedSatelliteFactory;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, Abstract Factory here!");
	}
	
	public static void withoutDesignPattern() {
		// i want a red car and a red satellite
		System.out.println("Without the 'Abstract Factory' design pattern!");
		RedCarFactory carFactory = new RedCarFactory();
		RedSatelliteFactory satelliteFactory = new RedSatelliteFactory();
		Car car = carFactory.createCar();
		Satellite satellite = satelliteFactory.createSatellite();
	}
	
	public static void withDesignPattern() {
		// i want a red car and a red satellite
		System.out.println("With the 'Abstract Factory' design pattern!");
		// here we only have to create 1 factory, as opposed to 2, as the 1 factory
		// is, behind the scenes, made up of the two specific (leaf node in class hierarchy)
		// 'red' factories... cool! - so it's the difference between interfacing with 1 
		// factory vs 2 factories
		RedCarAndSatelliteFactory carAndSatelliteFactory = new RedCarAndSatelliteFactory();
		Car car = carAndSatelliteFactory.createCar();
		Satellite satellite = carAndSatelliteFactory.createSatellite();
	}

}
