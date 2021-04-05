package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Car;

public abstract class CarFactory {
	
	public CarFactory() {
		System.out.println("Car Factory's constructor");
	}
	
	// Why can't i make this static? If you declare a method in a class abstract to use it, you must 
	// override this method in the subclass. But, overriding is not possible with static methods. 
	// Therefore, an abstract method cannot be static.
	abstract public Car createCar();
}
