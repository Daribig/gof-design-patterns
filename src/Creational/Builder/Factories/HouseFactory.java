package Creational.Builder.Factories;

import Creational.Builder.House;

public class HouseFactory {
	// if we don't use builder design pattern, we could either create a single factory with a function that contains lots of 
	// arguments, or create lots of specific factories to serve all of the different kinds of houses (each specific factory's 
	//'createHouse' function would have less arguments). For this example, i will go with the first way of trying to solve the 
	// problem of providing a clean interface of creating a house WITHOUT the builder design pattern
	public House createHouse(int countRooms, int countDoors, int countWindows, String landlordName) {
		House house = new House();
		house.setCountRooms(countRooms);
		house.setCountDoors(countDoors);
		house.setCountWindows(countWindows);
		house.setLandlordName(landlordName);
		return house;
	}
}
