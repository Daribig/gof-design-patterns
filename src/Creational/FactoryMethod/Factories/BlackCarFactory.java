package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Car;
import Creational.FactoryMethod.Colour;
import Creational.FactoryMethod.CarParts.MetalBody;
import Creational.FactoryMethod.CarParts.RoadWheel;
import Creational.FactoryMethod.CarParts.SteeringWheel;

public class BlackCarFactory extends CarFactory {

	public BlackCarFactory() {
		System.out.println("Black Car Factory's constructor");
	}
	
	public Car createCar() {
		MetalBody metalBody = new MetalBody();
		RoadWheel roadWheel = new RoadWheel();
		SteeringWheel steeringWheel = new SteeringWheel();
		Car car = new Car(steeringWheel,metalBody,roadWheel);
		car.setPaintColour(Colour.BLACK);
		return car;
	}
	
}
