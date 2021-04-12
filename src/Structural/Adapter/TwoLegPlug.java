package Structural.Adapter;

public class TwoLegPlug {

	public TwoLegPlug() {
		
	}
	
	public void connect(TwoLegPlug twoLegPlug) {
		System.out.println(this + " and " + twoLegPlug + " 2-leg plugs connected!");
	}
	
}
