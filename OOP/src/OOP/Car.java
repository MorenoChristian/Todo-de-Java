package OOP;

public class Car {
	
	// Class´s attributes
	
	private int wheels;
	
	private int width;
	
	private int heigth;
	
	private int motor;
	
	private int plataform_weight;
	
	private String color;
	
	private int total_weight;
	
	private boolean leather_seat, air_conditioner;
	
	// create a constructor from Car to give it an "Initial State"
	
	public Car() {
		
		wheels = 4;
		
		heigth = 2000;
		
		width = 300;
		
		motor = 1600;
		
		plataform_weight = 500;
	}
	
	// Getter Method
	
	public String get_general_info() {
		return ("The car has "+wheels+" wheels, is "+heigth+" cm heigth, has "+width+" cm width "
				+ "has a "+motor+" cc motor");
	}
	
	public String get_seat() {
		if (leather_seat == true) {
			return ("The car has leather seats");
		}else {
			return ("The car hasn´t leather seats");
		}
	}
	
	public String get_color() {
		return ("THe color of the car is: "+color);
	}
	
	public String get_air () {
		if (air_conditioner == true) {
			return ("The car has air conditioner");
		}else {
			return ("The car hasn´t air conditioner");
		}
	}
	
	public int get_car_cost() {
		
		int final_cost = 10000;
		
		if(leather_seat == true) {
			final_cost += 2000;
		}
		if (air_conditioner == true) {
			final_cost += 1500;
		}
		
		return final_cost;
	}
	
	// SETTER & GETTER METHOD
	public String set_get_weigth() {
		
		int weight_car = 500;
		
		total_weight = plataform_weight + weight_car;
		
		if(leather_seat == true) {
			total_weight = total_weight + 50;
		}
		if (air_conditioner == true) {
			total_weight = total_weight + 20;
		}
		
		return ("The car weigth is "+ total_weight);
	}
	
	// Setter Method
	
	public void set_color(String color) {
		this.color = color.toUpperCase();
	}
	
	
	public void set_air(String air_conditioner) {
		if (air_conditioner.equalsIgnoreCase("yes")) {
			this.air_conditioner = true;
		}else {
			this.air_conditioner = false;
		}
	}
	
	
	public void config_seat(String leather_seat) {
		if (leather_seat.equals("yes")) {
			this.leather_seat = true;
		}else {
			this.leather_seat = false;
		}
	}
	
	
	
}
