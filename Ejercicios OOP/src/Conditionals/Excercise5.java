package Conditionals;

import javax.swing.JOptionPane;

public class Excercise5 {

	public static void main(String[] args) {
		/*
		 * A worker needs to calculate his weekly wage which is obtained as
		 * follows:
		 * --If he works 40 hours or less, he gets $16 per hour
		 * --If he works more than 40 hours, he gets $16 for every first 40 hours
		 * 		and $20 for every overtime
		 */
		
		int hours, extra_hours;
		double wage;
		
		hours = Integer.parseInt(JOptionPane.showInputDialog("Enter the total hours worked: "));
		
		if(hours <= 40) {
			wage = hours * 40;
		}else {
			extra_hours = hours - 40;
			wage = (16 * 40) + extra_hours * 20;
		}
		
		JOptionPane.showMessageDialog(null, "The total wage for "+hours+" hours is: "+wage);

	}

}
