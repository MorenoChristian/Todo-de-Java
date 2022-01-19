package OOP;

public class Van extends Car{
	
	private int extra_capacity;
	
	private int extra_places;
	
	public Van(int extra_places, int extra_capacity) {
		
		super(); //call the constructor of the father class
		
		this.extra_places = extra_places;
		
		this.extra_capacity = extra_capacity;
		
	}
	
	//GETTER METHOD
	public String get_van_data() {
		return "Loading capacity is: "+extra_capacity+""
				+ ", and Capacity of seats is: "+extra_places;
	}
	
}
