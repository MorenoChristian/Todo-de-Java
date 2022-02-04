import javax.swing.JOptionPane;

public class Array {
	public static void main(String[] args) {
		
		/* Arrays are java Objects that can store multiple variables at the same
		 * time. Can store primitive data types (as int, long, double, etc)
		 * or objects references
		 */
		
		// create an integer dimensional array variable named "nums"
		
		int [] nums = new int[5];
		
		// using a for loop to store number in the array "nums"
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		}
		
		for (int i: nums) {
			System.out.println("Number: "+i);
		}
		
		// we create a dimensional array that store random numbers
		
		int [] random_numbers = new int[100];
		
		for (int i = 0; i < random_numbers.length; i++) {
			random_numbers[i] = (int)(Math.random()*101);
		}
		
		System.out.println("The array with random number is: ");
		
		for (int num : random_numbers) {
			System.out.printf(num+" ");
		}
		
		// Example with objects
		/*
		 * Student[] students = new Student[2];
		 * students[0] = new Student();
		 * students[1] = new Student();
		 */
		
	}
}
