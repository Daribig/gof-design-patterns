package Creational.Singleton;

public class RulerOfTheWorld {

	private static RulerOfTheWorld currentRulerOfTheWorld;
	
	private RulerOfTheWorld() {
		// means clients can't the constructor for this class - i never knew you could make a constructor
		// of a class private before (in java)... cool!
	}
	
	public static RulerOfTheWorld getInstance() {
		if(RulerOfTheWorld.currentRulerOfTheWorld == null) {
			RulerOfTheWorld.currentRulerOfTheWorld = new RulerOfTheWorld();
		}
		return RulerOfTheWorld.currentRulerOfTheWorld;
	}
	
}
