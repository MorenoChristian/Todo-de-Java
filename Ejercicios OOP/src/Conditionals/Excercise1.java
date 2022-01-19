package Conditionals;

import javax.swing.JOptionPane;

public class Excercise1 {

	public static void main(String[] args) {
		/*
		 * Make a program that read a integer number y shows if it 
		 * multiple of 10
		 */
		
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer number: "));
		
		if (number%10 == 0) {
			System.out.println("The number "+number+" is multiple of 10");
		}else {
			System.out.println("Is not a multiple of 10");
		}

	}

}
