package Conditionals;

import javax.swing.JOptionPane;

public class Excercise6 {

	public static void main(String[] args) {
		/*
		 * Make a program that take 2 numbers and tells if they are
		 * both odd or even 
		 */
		
		int number1, number2;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
		
		if((number1 % 2 == 0) && (number2 % 2 == 0)) {
			JOptionPane.showMessageDialog(null, "Both numbers are even");
		}else {
			JOptionPane.showMessageDialog(null, "Both numbers are not even");
		}

	}

}
