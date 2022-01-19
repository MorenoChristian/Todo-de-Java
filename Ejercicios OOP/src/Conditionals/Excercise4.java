package Conditionals;

import javax.swing.JOptionPane;

public class Excercise4 {
	
	public static void main(String[] args) {
		/*
		 * In MegaPlaza a 20% discount is given to customers whose
		 * purchase exceeds $300
		 * What will be the amount that a person will pay for their
		 * purchase
		 */
		
		float purchase_value = Float.parseFloat(JOptionPane.showInputDialog("Enter the puchase value: "));
		float total_to_pay, discount;
		
		if(purchase_value > 300) {
			discount = (purchase_value * 20) / 100;
			total_to_pay = purchase_value - discount;
		}else {
			total_to_pay = purchase_value;
		}
		
		JOptionPane.showMessageDialog(null, "The total to pay is: "+total_to_pay);
	}

}
