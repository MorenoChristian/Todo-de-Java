package Operators;
import java.util.Scanner;

public class Excersice5 {

	public static void main(String[] args) {
		/*
		 * The final grade of a Computer Science student is calculated based
		 * on the grades of 4 aspects of their academy performance: Participation,
		 * first quest, second quest, and final quest. Knowing that the previous 
		 * qualifications go into the final qualification with weight of 10%,
		 * 25%, 25% and 40%. Make a program that calculates and prints the final
		 * qualifications obtained by a student 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		float participation, first_quest, second_quest, final_quest;
		
		System.out.println("Participation note: ");
		participation = scan.nextFloat();
		
		System.out.println("First quest note: ");
		first_quest = scan.nextFloat();
		
		System.out.println("Second quest note: ");
		second_quest = scan.nextFloat();
		
		System.out.println("Final quest note: ");
		final_quest = scan.nextFloat();
		
		participation *= 0.10;
		first_quest *= 0.25;
		second_quest *= 0.25;
		final_quest *= 0.40;
		
		float final_grade = participation + first_quest + second_quest + final_quest;
		
		System.out.println("The final grade of the student is: "+final_grade);
		
		scan.close();
	}

}
