// In first place we need to import the Scanner class from java.util
import java.util.Scanner;


public class ScannerClass {
	public static void main(String[] args) {
		
		// create an object from Scanner class
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		String last_name = "";
		int age;
		
		
		System.out.print("Type your name : ");
		name = scan.nextLine();
		
		System.out.print("Type your last name: ");
		last_name = scan.nextLine();
		
		System.out.print("How old are you?: ");
		age = scan.nextInt();
		
		System.out.print("D.N.I: ");
		int dni = scan.nextInt();
		
		System.out.println("Your complete name is: "+name+" "+last_name);
		System.out.println("Age: "+age+" and DNI: "+dni);
		
		
	}
}
