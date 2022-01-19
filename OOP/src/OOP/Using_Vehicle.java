package OOP;
import javax.swing.JOptionPane;

public class Using_Vehicle {
	
	public static void main(String[] args) {
		
		/*
		Car Renault = new Car(); //instance of Car Class
		
		System.out.println(Renault.get_general_info());
		
		// Using JOptionPane to input Strings request
		// modify car color
		
		Renault.set_color(JOptionPane.showInputDialog("Write car color: "));
		System.out.println(Renault.get_color());
		
		Renault.config_seat(JOptionPane.showInputDialog("The car has Leather Seats?: "));
		System.out.println(Renault.get_seat());
		
		//System.out.println("This car have "+Renault.wheels+" ruedas");
		
		Renault.set_air(JOptionPane.showInputDialog("The car has Air Conditioner?: "));
		System.out.println(Renault.get_air());
		
		System.out.println(Renault.set_get_weigth());
		
		System.out.println("The total cost of the car is: "+Renault.get_car_cost());
		*/
		
		Car my_car1 = new Car();
		
		my_car1.set_color("Black");
		
		Van my_van1 = new Van(7, 580);
		
		my_van1.set_color("White");
		my_van1.config_seat("yes");
		my_van1.set_air("yes");
		
		
		System.out.println(my_car1.get_general_info()+" "+my_car1.get_color());
		
		System.out.println(my_van1.get_general_info()+ " " +my_van1.get_van_data());
		
		
	}
}
