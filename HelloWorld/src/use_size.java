
import java.util.Scanner;

public class use_size {
	
	//enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};
	
	enum Size{
		SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
		
		//constructor
		private Size(String abbreviation) {
			this.abbreviation = abbreviation;
		}
		
		//Getter method
		public String get_abbreviation() {
			return abbreviation;
		}
		
		private String abbreviation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Size s = Size.SMALL;
		
		Size m = Size.MEDIUM;
		
		Size l = Size.LARGE;
		
		Size xl = Size.EXTRA_LARGE;
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a Size (SMALL, MEDIUM, LARGE, EXTRA_LARGE): ");
		
		String data_input = scan.next().toUpperCase();
		
		Size the_size = Enum.valueOf(Size.class, data_input);
		
		System.out.println("Size = "+the_size);
		
		System.out.println("Abbreviation = "+the_size.get_abbreviation());

	}

}
