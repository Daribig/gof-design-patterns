package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Car;
import Creational.FactoryMethod.Colour;
import Creational.FactoryMethod.CarParts.*;

public class RedCarFactory extends CarFactory {
	
	public RedCarFactory() {
		System.out.println("Red Car Factory's constructor");
	}
	
	public Car createCar() {
		MetalBody metalBody = new MetalBody();
		RoadWheel roadWheel = new RoadWheel();
		SteeringWheel steeringWheel = new SteeringWheel();
		Car car = new Car(steeringWheel,metalBody,roadWheel);
		car.setPaintColour(Colour.RED);
		return car;
	}
}
