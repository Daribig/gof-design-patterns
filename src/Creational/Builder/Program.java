package Creational.Builder;

import Creational.Builder.Builders.HouseBuilder;
import Creational.Builder.Factories.HouseFactory;

public class Program {

	public static void printHouseDetails(House house) {
		System.out.println("Count Doors: " + house.getCountDoors() + ", Count Rooms: " + house.getCountRooms()
		+ ", Count Windows: " + house.getCountWindows() + ", Landlord Name: " + house.getLandlordName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from the 'Builder' design pattern's entry point!");
		Program.withoutDesignPattern();
		Program.withDesignPattern();
	}

	public static void withoutDesignPattern() {
		System.out.println("Without using the builder pattern, and just using a simple factory design pattern (offloading creation to a factory with only 1 receptionist - 2+ receptionists == abstract factory");
		// without the builder design pattern, where we rely on a factory
		HouseFactory factory = new HouseFactory();
		House house = factory.createHouse(1, 2, 3, "James");
		Program.printHouseDetails(house);
	}
	
	public static void withDesignPattern() {
		System.out.println("Using the builder pattern - reduces the number of arguments that we have to pass into a single function and " 
		 + "makes the code more understandable as it's not as ambiguous what the passed in arguments to the function(s) are going to be used for");
		// with the builder design pattern, that reduces the number of arguments we have to pass into a single function
		// another benefit of 'Builder' pattern is just reading the function name, we get can more-easily tells what the
		// args being passed into the function are going to actually do
		HouseBuilder builder = new HouseBuilder();
		builder.setCountDoors(1);
		builder.setCountRooms(2);
		builder.setCountWindows(3);
		builder.setLandlordName("James");
		House house = builder.Build();
		Program.printHouseDetails(house);
	}
	
}
