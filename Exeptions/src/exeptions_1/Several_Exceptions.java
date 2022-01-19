package exeptions_1;

import javax.swing.JOptionPane;

public class Several_Exceptions {

	public static void main(String[] args) {
		
		try {
			
			division();
			
		}
		catch(ArithmeticException | NumberFormatException e) {
			
			if(e.getClass().getSimpleName().equals("ArithmeticException")) {
				System.out.println("You can´t divide by 0");
			}
			else if(e.getClass().getSimpleName().equals("NumberFormatException")){
				System.out.println("You have entered a string instead of a number");
				System.out.println(e.getMessage());
				System.out.println("An error of this type was appear: "+e.getClass().getName());
			}
			
		}
		
		///////////////////////// OR ///////////////////////////////*
		/*
		 * try{
		 * 	   division();
		 * }
		 * catch(ArithmeticException e){
		 * 	   System.out.println("You can´t divide by 0");
		 * }
		 * catch(NumberFormatException e){
		 *     System.out.println("You have entered a string instead of a number");
			   System.out.println(e.getMessage());
			   System.out.println("An error of this type was appear: "+e.getClass().getName());
		 * }
		 * 
		 */
		
	}
	
	static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
		
		int div = num1/num2;
		
		System.out.println("The result of the division is: "+div);
	}

}
