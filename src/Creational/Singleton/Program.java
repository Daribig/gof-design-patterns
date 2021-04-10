package Creational.Singleton;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, from the 'Singleton' design pattern's demo!!!");
		Program.withDesignPattern();
	}
	
	// not showing without design pattern, as there isn't really a reasonable way to solve this problem without using the 
	// singleton design pattern
	public static void withDesignPattern() {
		// i only ever want there to be 1 ruler of the world (1 instance of the 'RulerOfTheWorld' class) in my program
		// at a time
		RulerOfTheWorld rulerOne = RulerOfTheWorld.getInstance();
		RulerOfTheWorld rulerTwo = RulerOfTheWorld.getInstance();
		boolean isBothRulersArePointersToSameRuler = rulerOne == rulerTwo;
		if(isBothRulersArePointersToSameRuler) {
			System.out.println("There is only 1 ruler of this world!");
		}
		else {
			System.out.println("Oh no! There are 2 rulers of the world");
		}
	}

}
