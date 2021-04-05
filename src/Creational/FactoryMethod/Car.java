package Creational.FactoryMethod;

import Creational.FactoryMethod.CarParts.MetalBody;
import Creational.FactoryMethod.CarParts.RoadWheel;
import Creational.FactoryMethod.CarParts.SteeringWheel;

public class Car {
	
	private Colour _paintColour;
	
	public Car(SteeringWheel steeringWheel, MetalBody metalBody, RoadWheel roadWheel) {
		
	}
	
	public void setPaintColour(Colour colour) {
		this._paintColour = colour;
	}
	
	public void stdOutColourOfCar() {
		if(this._paintColour == null) {
			System.out.println("This car has not been painted any colour");
		}
		else {
			System.out.println("This car has been painted " + this._paintColour.toString());
		}
	}
}
