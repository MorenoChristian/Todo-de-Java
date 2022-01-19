package Conditionals;

import javax.swing.JOptionPane;

public class Excercise3 {

	public static void main(String[] args) {
		/*
		 * Make a program that read a character by keyboard
		 * and check if it´s a capital letter
		 */
		
		char letter = JOptionPane.showInputDialog("Enter a letter: ").charAt(0);
		
		if (Character.isUpperCase(letter)) {
			JOptionPane.showMessageDialog(null, "Is a Capital Letter");
		}else {
			JOptionPane.showMessageDialog(null, "Is not a Capital Letter");
		}

	}

}
