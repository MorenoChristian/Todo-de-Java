package Operators;
import javax.swing.JOptionPane;

public class Excercise4 {
	
	public static void main(String[] args) {
		/*
		 * A used car sales company pays its sales employees a monthly 
		 * salary of $1000, plus a commission of $150 for each car sold, plus
		 * 5% of the sales value per car. Each month the company´s capturist
		 * enters pertinent data into the computer. Make a program that calculates
		 * and prints the monthly salary of an specific employee.
		 */
		
		float monthly_salary = 1000;
		float comision = 150;
		
		int sold_cars = Integer.parseInt(JOptionPane.showInputDialog("How many cars did this employee sell?: "));
		float sold_cars_prices = Float.parseFloat(JOptionPane.showInputDialog("Input the value of the sold cars: "));
		
		float comision_total = comision * sold_cars;
		float aditional_porcent = ((sold_cars_prices * 5) / 100) * sold_cars;
		
		float total = monthly_salary + comision_total + aditional_porcent;
		
		System.out.println("The salary of the employee is: "+total);
	}
}
