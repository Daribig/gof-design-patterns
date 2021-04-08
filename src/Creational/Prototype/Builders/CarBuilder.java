package Creational.Prototype.Builders;

import Creational.Prototype.Car;
import Creational.Prototype.Colour;

public class CarBuilder {
	
	private int countWheels;
	private int countDoors;
	private Colour paintColour;
	private boolean isBroken;
	private int milesTravelled;
	
	public CarBuilder() {
		
	}

	public void setCountWheels(int countWheels) {
		this.countWheels = countWheels;
	}

	public void setCountDoors(int countDoors) {
		this.countDoors = countDoors;
	}

	public void setPaintColour(Colour paintColour) {
		this.paintColour = paintColour;
	}

	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}

	public void setMilesTravelled(int milesTravelled) {
		this.milesTravelled = milesTravelled;
	}
	
	public Car build() {
		Car car = new Car(this.countWheels, this.countDoors, this.paintColour, this.isBroken, this.milesTravelled);
		return car;
	}

}
