package Creational.FactoryMethod;

import Creational.FactoryMethod.CarParts.*;
import Creational.FactoryMethod.Factories.RedCarFactory;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program.withoutFactoryMethod();
		System.out.println();
		Program.withFactoryMethod();
	}
	
	public static void withoutFactoryMethod() {
		System.out.println("Without factory method: ");
		// i want a red car
        MetalBody metalBody = new MetalBody();
        SteeringWheel steeringWheel = new SteeringWheel();
        RoadWheel roadWheel = new RoadWheel();
        Car car = new Car(steeringWheel, metalBody, roadWheel);
        car.setPaintColour(Colour.RED);
        car.stdOutColourOfCar();
	}
	
	public static void withFactoryMethod() {
		System.out.println("With factory method");
		// i want a red car
		RedCarFactory redCarFactory = new RedCarFactory();
		Car redCar = redCarFactory.createCar();
		redCar.stdOutColourOfCar();
	}

}
