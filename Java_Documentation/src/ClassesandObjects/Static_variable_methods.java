package ClassesandObjects;

public class Static_variable_methods {
	
	public static void main(String[] args) {
		
		// instance from Bicycle
		
		Bicycle b1 = new Bicycle(100, 20, 25);
		System.out.println(b1.getID());
		System.out.println(Bicycle.getNumberOfBicycles());
		Bicycle b2 = new Bicycle(200, 30, 35);
		System.out.println(b2.getID());
		System.out.println(Bicycle.getNumberOfBicycles());
		Bicycle b3 = new Bicycle(200, 30, 35);
		System.out.println(b3.getID());
		
		
	}
	
}

class Bicycle{
	
	private int cadence;
	private int gear;
	private int speed;
	
	// add an instance variable for the object ID
	private int id;
	
	// add a class variable for the number of Bicycle objects instantiated
	private static int numberOfBicycle = 0;
	
	// you can use the constructor to set the id instance variable and increment
	// the number numberOfBicycle
	public Bicycle(int cadence, int gear, int speed) {
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
		
		// increment number of Bicycle and assign ID number
		id = ++numberOfBicycle;
	}
	
	// GETTER METHODS
	public int getID() {
		return id;
	}
	
	public static int getNumberOfBicycles() {
		return numberOfBicycle;
	}
	
	
	public int getCadence() {
		return cadence;
	}
	
	public int getGear() {
		return gear;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	// SETTER METHODS
	public void setCadence(int newvalue) {
		cadence = newvalue;
	}
	
	// BEHAVIOR METHODS
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
}
