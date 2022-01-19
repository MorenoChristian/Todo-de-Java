package exeptions_1;

import javax.swing.JOptionPane;

public class Check_Mail {

	public static void main(String[] args) {
		
		String mail;
		mail = JOptionPane.showInputDialog("Enter a mail: ");
		
		try {
		check_mail(mail);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The mail is to short");
		}

	}
	
	static void check_mail(String mail) throws ArrayIndexOutOfBoundsException {
		int at = 0;
		boolean dot = false;
		
		if(mail.length() <= 3) {
			
			//ArrayIndexOutOfBoundsException ai = new ArrayIndexOutOfBoundsException();
			//throw ai;
			
			// OR
			
			throw new ArrayIndexOutOfBoundsException();
		
		}else {
		
			for (int i = 0; i<mail.length(); i++) {
				if(mail.charAt(i) == '@') {
					at = 1;
				}
			}
			
			for(int i = 0; i<mail.length(); i++) {
				if(mail.charAt(i) == '.') {
					dot = true;
				}
			}
			
			if(at == 1 && dot == true) {
				JOptionPane.showMessageDialog(null, "The mail is correct!");
			}else {
				JOptionPane.showMessageDialog(null, "The mail is incorrect!");
			}
		}
	}
}
