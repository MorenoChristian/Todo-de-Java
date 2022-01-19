package Operators;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		/*
		 * Guillermo has N dolars. Luis has the half of Guillermo.
		 * Juan has half of Luis and Guillermo together.
		 * Make a program that calculates and prints how much money
		 * all 3 have.
		 */
		
		double guillermo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many dollars does Guillerno has: ");
		guillermo = scan.nextDouble();
		
		double luis = guillermo / 2;
		
		double juan = (guillermo + luis) / 2;
		
		System.out.println("Guillermo: "+guillermo+"\nLuis: "+luis+"\nJuan:"+juan);
		
		scan.close();
	}

}
