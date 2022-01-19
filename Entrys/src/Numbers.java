import javax.swing.JOptionPane;


public class Numbers {
	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Type a float number: ");
		
		double num2 = Double.parseDouble(num);
		
		System.out.print("The square root of "+num2+" is: ");
		
		System.out.printf("%1.2f",Math.sqrt(num2));
		
		
	}
}
