import javax.swing.JOptionPane;

public class Ej9 {

	public static void main(String[] args) {
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N',
				'J','Z','S','Q','V','H','L','C','K','E'};
		
		int dni = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su dni: "));
		
		System.out.println(dni%23);
		System.out.println("Su dni es: "+dni+" y su letra es: "+letras[dni%23]);

	}

}
