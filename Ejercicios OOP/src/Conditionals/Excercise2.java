package Conditionals;

import javax.swing.JOptionPane;

public class Excercise2 {

	public static void main(String[] args) {
		/*
		 * Asking 2 numbers and say which is greater or if they are equal
		 */
		
		int number1, number2;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
		
		if (number1 > number2) {
			System.out.println("The number "+number1+" is greater than "+number2);
		}else if (number2 > number1) {
			System.out.println("The number "+number2+" is greater than "+number1);
		}else {
			System.out.println("The numbers are the same");
		}
		

	}

}
