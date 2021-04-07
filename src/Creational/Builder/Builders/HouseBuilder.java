package Creational.Builder.Builders;

import Creational.Builder.House;

// not the best example to highlight how useful this design pattern is.
// a better example would've been to build an object that have multiple dependency objects that can each be specified, and then
// are required to be passed into the 'House' class' constructor or just to be set as one of the 'House' object's properties through
// a setter method.
public class HouseBuilder {
	
	private House house;
	
	public HouseBuilder() {
		this.house = new House();
	}
	
	public void setCountRooms(int countRooms) {
		this.house.setCountRooms(countRooms);
	}
	
	public void setCountDoors(int countDoors) {
		this.house.setCountDoors(countDoors);
	}
	
	public void setCountWindows(int countWindows) {
		this.house.setCountWindows(countWindows);
	}
	
	public void setLandlordName(String landlordName) {
		this.house.setLandlordName(landlordName);
	}

	public House Build() {
		return this.house;
	}
}
