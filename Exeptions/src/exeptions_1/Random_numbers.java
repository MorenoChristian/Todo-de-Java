package exeptions_1;

import javax.swing.JOptionPane;

public class Random_numbers {

	public static void main(String[] args) {
		
		
		int elements = Integer.parseInt(JOptionPane.showInputDialog("Enter the numbers of elements in the array: "));
		
		int[] array = new int[elements];
		
		for(int i=0; i<array.length; i++) {
			
			array[i] = (int)(Math.random()*100);
			
		}
		
		for(int i: array) {
			
			System.out.print(i+" ");
			
		}

	}

}
