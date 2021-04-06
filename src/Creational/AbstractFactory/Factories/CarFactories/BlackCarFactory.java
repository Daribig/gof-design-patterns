package Creational.AbstractFactory.Factories.CarFactories;

import Creational.AbstractFactory.Car;
import Creational.AbstractFactory.Colour;
import Creational.AbstractFactory.CarParts.MetalBody;
import Creational.AbstractFactory.CarParts.RoadWheel;
import Creational.AbstractFactory.CarParts.SteeringWheel;

public class BlackCarFactory extends CarFactory{
	public Car createCar() {
		MetalBody metalBody = new MetalBody();
		RoadWheel roadWheel = new RoadWheel();
		SteeringWheel steeringWheel = new SteeringWheel();
		Car car = new Car(metalBody, roadWheel, steeringWheel);
		car.setPaintColour(Colour.BLACK);
		return car;
	}
}
