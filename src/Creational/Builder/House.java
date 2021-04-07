package Creational.Builder;

public class House {
	private int countRooms;
	private int countDoors;
	private int countWindows;
	private String landlordName;
	
	public House() {
		
	}

	public int getCountRooms() {
		return countRooms;
	}

	public void setCountRooms(int countRooms) {
		this.countRooms = countRooms;
	}

	public int getCountDoors() {
		return countDoors;
	}

	public void setCountDoors(int countDoors) {
		this.countDoors = countDoors;
	}

	public int getCountWindows() {
		return countWindows;
	}

	public void setCountWindows(int countWindows) {
		this.countWindows = countWindows;
	}

	public String getLandlordName() {
		return landlordName;
	}

	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}
	
}
