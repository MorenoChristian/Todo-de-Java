package exeptions_1;

import javax.swing.JOptionPane;

public class Fails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//with this we can try to found some  like ArrayOutOfBounds..., Syntax
		
		int[] my_array = new int[5];
		
		my_array[0] = 5;
		my_array[1] = 28;
		my_array[2] = -15;
		my_array[3] = 92;
		my_array[4] = 71;
		
		for(int i=0; i<5; i++) {
			System.out.println("Position "+ i +" = "+ my_array[i]);
		}
		
		String name = JOptionPane.showInputDialog("Type your name: ");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Type your age"));
		
		System.out.println("Hi "+ name +", You have "+ age +" years old. " + ""
				+ "The program has finished it´s execution");
		
		
		
	}

}
