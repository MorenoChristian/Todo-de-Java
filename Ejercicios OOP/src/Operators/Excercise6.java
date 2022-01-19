package Operators;
import java.util.Scanner;

public class Excercise6 {

	public static void main(String[] args) {
		/*
		 * Make a program that, given a number of hours, return the equivalent
		 * number of weeks, days and hours. For example, given a total of 
		 * 1000 hours, must return 5 weeks, 6 days and 16 hours
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the total hours: ");
		int total_hours = scan.nextInt();
		
		int weeks = total_hours / 168;
	    
		int left_hours = total_hours - (168 * weeks);
		
		int days = left_hours / 24;
		
		int hours = total_hours - ((168 * weeks) + (24 * days));
		
		System.out.println("Weeks: "+weeks+"\nDays: "+days+"\nHours: "+hours);
		
		scan.close();
	}

}
