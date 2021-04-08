package Creational.Prototype;

import Creational.Prototype.Builders.CarBuilder;

public class Program {

	public static void compareCars(Car carA, Car carB) {
		boolean isCountWheelsSame = carA.getCountWheels() == carB.getCountWheels();
		boolean isCountDoorsSame = carA.getCountDoors() == carB.getCountDoors();
		boolean isBrokenSame = carA.getIsBroken() == carB.getIsBroken();
		boolean isMilesTravelledSame = carA.getMilesTravelled() == carB.getMilesTravelled();
		boolean isPaintColourSame = carA.getPaintColour() == carB.getPaintColour();
		if(isCountWheelsSame && isCountDoorsSame && isBrokenSame && isMilesTravelledSame && isPaintColourSame) {
			System.out.println("Cars are same!");
		}
		else {
			System.out.println("Cars are not same!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from the 'Prototype' design pattern demo!");
		Program.withoutDesignPattern();
		Program.withDesignPattern();
		
	}
	
	public static void withoutDesignPattern() {
		System.out.println("Not using prototype design pattern:");
		// i want to clone 'my' car so i can give it to my friend - going to rely on the 'builder' pattern
		CarBuilder myBuilder = new CarBuilder();
		myBuilder.setCountWheels(4);
		myBuilder.setCountDoors(4);
		myBuilder.setBroken(true);
		myBuilder.setMilesTravelled(100);
		myBuilder.setPaintColour(Colour.BLUE);
		Car myCar = myBuilder.build();
		
		CarBuilder friendBuilder = new CarBuilder();
		friendBuilder.setCountWheels(myCar.getCountWheels());
		friendBuilder.setCountDoors(myCar.getCountDoors());
		friendBuilder.setBroken(myCar.getIsBroken());
		friendBuilder.setMilesTravelled(myCar.getMilesTravelled());
		friendBuilder.setPaintColour(myCar.getPaintColour());
		Car friendCar = friendBuilder.build();
		
		Program.compareCars(myCar, friendCar);
	}
	
	public static void withDesignPattern() {
		System.out.println("Using prototype design pattern:");
		// i want to clone 'my' car so i can give it to my friend - going to use the 'prototype' pattern
		CarBuilder myBuilder = new CarBuilder();
		myBuilder.setCountWheels(4);
		myBuilder.setCountDoors(4);
		myBuilder.setBroken(true);
		myBuilder.setMilesTravelled(100);
		myBuilder.setPaintColour(Colour.BLUE);
		Car myCar = myBuilder.build();
		
		// only 1 line required... look at how much easier it is!
		Car friendCar = myCar.clone();
		Program.compareCars(myCar, friendCar);
	}

}
