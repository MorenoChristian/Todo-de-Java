package exeptions_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Data_Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("What would you like to do?");
		System.out.println("1. Input Data");
		System.out.println("2. Exit Program");
		
		Scanner scan = new Scanner(System.in);
		
		int decision = scan.nextInt();

		if (decision == 1) {
			try {
				ask_data();
			}
			catch(InputMismatchException e) {
				System.out.println("You have input a wrong data");
			}
			
		}else {
			System.out.println("Good bye");
			
			System.exit(0);
		}
		
		scan.close();
	}
	
	static void ask_data() throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		//try {
			System.out.println("Input your name, please");
			
			String user_name = scan.nextLine();
			
			System.out.println("Input your age, please");
			
			int age = scan.nextInt();
			
			System.out.println("Hello "+ user_name +" , next year you will have "+ (age+1) +" years old");
		//}catch(InputMismatchException e) {
			//System.out.println("You have input a wrong data");
		//}
		scan.close();
		
		System.out.println("We have finished");
	}

}
