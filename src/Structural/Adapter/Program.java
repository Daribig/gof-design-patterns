package Structural.Adapter;

import Structural.Adapter.Adapters.ThreeLegPlugToTwoLegPlugAdapter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, from the 'Adapter' design pattern's demo!!");
		Program.withoutDesignPattern();
		Program.withDesignPattern();
	}
	
	public static void withoutDesignPattern() {
		System.out.println("Without the 'Adapter' design pattern - trying to get 2 initially incompatible objects to be able to communicate");
		
		// i want to plug in the three leg plug for my laptop into the wall socket's two leg plug connected to the electricty.. so i 
		// can charge my laptop
		ThreeLegPlug laptopChargerPlug = new ThreeLegPlug();
		TwoLegPlug electricityPlugInWall = new TwoLegPlug();
		
		// the below won't work... we have to either change the 'ThreeLegPlug' or "TwoLegPlug' classes.. that makes things a lot more
		// complicated
		// electricityPlugInWall.connect(laptopChargerPlug);
	}
	
	public static void withDesignPattern() {
		System.out.println("With the 'Adapter' design pattern - trying to get 2 initially incompatible objects to be able to communicate");
		
		// i want to plug in the three leg plug for my laptop into the wall socket's two leg plug connected to the electricty.. so i 
		// can charge my laptop
		ThreeLegPlug laptopChargerPlug = new ThreeLegPlug();
		TwoLegPlug electricityPlugInWall = new TwoLegPlug();	
		
		// look at how easy this is! Just get an adapter and plug your laptop charger's plug into it - then you can connect
		// the adapter's plug into the electricity plug's wall socket (this 'plugs' analogy is quite bad - should specifiy
		// input/output plugs.. oh well)...  cool! this means we don't have to change any of the code in the 'ThreeLegPlug'
		// or 'TwoLegPlug' classes - just have to define a new class to act as the 'adapter' for when you want these two
		// classes of objects to interact... cool!
		ThreeLegPlugToTwoLegPlugAdapter adapter = new ThreeLegPlugToTwoLegPlugAdapter(laptopChargerPlug);
		electricityPlugInWall.connect(adapter);
	}

}
