import javax.swing.JOptionPane;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','M','N','L','O',
			'P','Q','R','S','T','U','V','X','W','Y','Z'};
		
		char[] aux = new char[3];
		int i = 0;
			
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: "));
		
		while(numero != -1) {
			if(numero == 0) {
				aux[i] = letras[numero];
				i++;
			}
			else if(numero == 5) {
				aux[i] = letras[numero];
				i++;
			}
			else if(numero == 25) {
				aux[i] = letras[numero];
			}
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: "));

		}
		
		for(char c: aux) {
			System.out.print(c);
		}
	}

}
