package Structural.Composite;

import Structural.Composite.HardwareDevices.*;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello from the demo area for the 'Composite' design pattern!");
		Program.withoutDesignPattern();
		Program.withDesignPattern();
	}
	
	public static void withoutDesignPattern() {
		System.out.println("Without the 'Composite' design pattern");
		// i want to easily work with hardware devices, that can be composed of different things, in the same way - the below way 
		// (not using the 'Composite' design patter) gives us (the client) too much detail about the devices - all we want are
		// devices that can be interact in the same way. 
		PlaystationFour deviceOne = new PlaystationFour();
		Laptop deviceTwo = new Laptop();
		
		deviceOne.turnOff();
		deviceTwo.turnOff();
		deviceTwo.scrollDownOnTrackpad(); // I DONT WANT THE CLIENT TO BE ABLE TO DO THIS!! 
	}
	
	public static void withDesignPattern() {
		System.out.println("With the 'Composite' design pattern");
		// i want to easily work with hardware devices, that can be composed of different things, in the same way - the below way 
		// (that uses the 'Composite' design patter) gives us (the client) only the amount of information that we NEED to know about
		// - all we're told is the interface of each thing - and each thing has the same interface
		
		IHardwareDevice deviceOne = new PlaystationFour();
		IHardwareDevice deviceTwo = new Laptop();
		
		deviceOne.turnOff();
		deviceTwo.turnOff();
		// THE BELOW ACTION CAN'T BE PERFORMED BECAUSE ALL DEVICES HAVE THE SAME INTERFACE, SO CAN ONLY ACT ON A DEVICE IF YOU
		// CAN ACT ON ALL OTHER DEVICES THE SAME WAY / 'THAT' ACTION IS SUPPORTED/OFFERED BY ALL OTHER DEVICES
		// deviceTwo.scrollDownOnTrackpad();
	}

}
