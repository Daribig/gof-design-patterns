package Structural.Adapter.Adapters;

import Structural.Adapter.ThreeLegPlug;
import Structural.Adapter.TwoLegPlug;

public class ThreeLegPlugToTwoLegPlugAdapter extends TwoLegPlug {
	
	// what to adapt from
	private ThreeLegPlug threeLegPlug;
	
	public ThreeLegPlugToTwoLegPlugAdapter(ThreeLegPlug threeLegPlug) {
		// call the parent class' (TwoLegPlug') constructor... even tho the parent's constructor doesn't set up anything, it's good practice
		super(); 
		this.threeLegPlug = threeLegPlug;
	}

}
