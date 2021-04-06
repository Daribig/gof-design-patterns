package Creational.AbstractFactory;

import Creational.AbstractFactory.CarParts.*;

public class Car {
	
	public Colour _paintColour;
	
	public Car(MetalBody metalBody, RoadWheel roadWheel, SteeringWheel steeringWheel) {
		
	}
	
	public void setPaintColour(Colour colour) {
		this._paintColour = colour;
	}
	
}
