import javax.swing.JOptionPane;

public class Ej6 {

	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog("Ingrese una frase: ");
		
		char[] letras = new char[frase.length()];
		
		for(int i = 0; i<frase.length(); i++) {
			
			letras[i] = frase.charAt(i);
		}
		
		for(int i = 0; i<letras.length; i++) {
			System.out.print(letras[i]+" ");
		}

	}

}
