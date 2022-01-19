package Operators;

import java.util.Scanner;

public class Exercise2_SemanalSalary {

	public static void main(String[] args) {
		/*
		 * Make a program that calculates and prints an
		 * employee´s wage by his weekly hours and his
		 * hourly wage
		 */
		
		double hourly_wage;
		int weekly_hours;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many hours does the employee works per week?");
		weekly_hours = scan.nextInt();
		
		System.out.println("How much does he gain by hour?");
		hourly_wage = scan.nextDouble();
		
		double total = ((double)weekly_hours * hourly_wage);
		
		System.out.println("The employee gains: "+total);
		
		scan.close();

	}

}
