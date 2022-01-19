// First import JOptionPane from javax.swing
import javax.swing.JOptionPane;


public class JOptionPaneClass {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Type your Complete name please: ");
		String age = JOptionPane.showInputDialog("How old are you sir? ");
		
		// we need to convert age in a Int variable
		int age_next = Integer.parseInt(age);
		
		System.out.println("You are "+name+ "and next year you will have "+(age_next+1)+" years old");
		
	}
}
