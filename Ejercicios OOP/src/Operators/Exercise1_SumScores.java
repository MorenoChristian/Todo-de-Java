package Operators;

import java.util.Scanner;

public class Exercise1_SumScores {

	public static void main(String[] args) {
		
		// Sum of three scores
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the first score: ");
		int score1 = scan.nextInt();
		
		System.out.print("Input the second score: ");
		int score2 = scan.nextInt();
		
		System.out.print("Input the third score: ");
		int score3 = scan.nextInt();
		
		int final_score = score1 + score2 + score3;
		
		double average_score = (double)(score1+score2+score3)/3; 
		
		System.out.println("The final score is: "+final_score);
		System.out.printf("The average score is: %.2f",average_score);
		
		scan.close();

	}

}
