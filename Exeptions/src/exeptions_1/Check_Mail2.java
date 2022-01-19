package exeptions_1;

import javax.swing.JOptionPane;

public class Check_Mail2 {

	public static void main(String[] args) {
		String mail;
		mail = JOptionPane.showInputDialog("Enter a mail: ");
		
		try {
			check_mail(mail);
		}
		catch(check_mail_length e){
			System.out.println("The mail is to short!!");
			e.printStackTrace();
			System.out.println(e);
		}
		

	}
	
	static void check_mail(String mail) throws check_mail_length{
		int at = 0;
		boolean dot = false;
		
		if(mail.length() <= 3) {
			
			throw new check_mail_length("The mail cannot be lees than 3 characters");
		    //throw new check_mail_length();
			
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

class check_mail_length extends Exception{
	//this class must have 2 constructors, a default one and other with a parameter
	
	public check_mail_length(){
		
	}
	public check_mail_length(String message) {
		super(message);
	}
}

