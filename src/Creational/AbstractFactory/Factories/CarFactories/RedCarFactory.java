package Creational.AbstractFactory.Factories.CarFactories;

import Creational.AbstractFactory.Car;
import Creational.AbstractFactory.Colour;
import Creational.AbstractFactory.CarParts.*;

public class RedCarFactory extends CarFactory {
	
	public RedCarFactory() {
		
	}
	
	public Car createCar() {
		MetalBody metalBody = new MetalBody();
		RoadWheel roadWheel = new RoadWheel();
		SteeringWheel steeringWheel = new SteeringWheel();
		Car car = new Car(metalBody, roadWheel, steeringWheel);
		car.setPaintColour(Colour.RED);
		return car;
	}
}
