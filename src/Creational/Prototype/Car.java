package Creational.Prototype;

public class Car {
	
	private int countWheels;
	private int countDoors;
	private Colour paintColour;
	private boolean isBroken;
	private int milesTravelled;
	
	public Car(int countWheels, int countDoors, Colour paintColour, boolean isBroken, int milesTravelled) {
		this.countWheels = countWheels;
		this.countDoors = countDoors;
		this.paintColour = paintColour;
		this.isBroken = isBroken;
		this.milesTravelled = milesTravelled;
	}

	public int getCountWheels() {
		return countWheels;
	}

	public void setCountWheels(int countWheels) {
		this.countWheels = countWheels;
	}

	public int getCountDoors() {
		return countDoors;
	}

	public void setCountDoors(int countDoors) {
		this.countDoors = countDoors;
	}

	public Colour getPaintColour() {
		return paintColour;
	}

	public void setPaintColour(Colour paintColour) {
		this.paintColour = paintColour;
	}

	public boolean getIsBroken() {
		return isBroken;
	}

	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}

	public int getMilesTravelled() {
		return milesTravelled;
	}

	public void setMilesTravelled(int milesTravelled) {
		this.milesTravelled = milesTravelled;
	}
	
	public Car clone() {
		Car car = new Car(this.countWheels, this.countDoors, this.paintColour, this.isBroken, this.milesTravelled);
		return car;
	}
}
