package Structural.Bridge;

import Structural.Bridge.ColourTree.Black;
import Structural.Bridge.HeadphonesTree.BoseQC35;
import Structural.Bridge.HeadphonesTree.MDR1000X;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the 'Bridge' design pattern's demo!!");
		Program.withoutDesignPattern();
		Program.withDesignPattern();
	}
	
	public static void withoutDesignPattern() {
		// i want to get black mdr 1000x headphones
		
		// haven't implemented the class, but it'd be ugly af as it's so specific - so using 
		// something like that could look as follows:
		// BlackMDR1000X headphones = new BlackMDR1000x();
	}
	
	public static void withDesignPattern() {
		// i want to get black mdr 1000x headphones
		Black black = new Black();
		MDR1000X sonyHeadphones = new MDR1000X(black);
		
		// and now i want to get some bose qc35 headphones (i'm able to reuse the type of 'Colour' class, as
		// opposed to having to create a too-specific type of qc35 class (eg: BlackQC35)... such a nicer hierarchy
		// ... nice! - so i'm favouring being more specific with the construction of the type of headphone (passing
		// in argument(s) into the constructor) as opposed to being more specific with the class definition of 'this'
		// type of headphone... cool!
		BoseQC35 boseHeadphones = new BoseQC35(black);
	}
	


}
