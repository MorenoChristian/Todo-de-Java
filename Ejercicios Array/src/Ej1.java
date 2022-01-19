import javax.swing.JOptionPane;

public class Ej1 {
	public static void main (String[] args) {
		
		//CREAMOS UN ARRAY CON TANTAS POSICIONES
		int[] numeros = new int[10];
		
		rellenar(numeros);
		mostrar(numeros);
	}
	
	public static void rellenar(int lista[]) {
		int numero = 0;
		
		for(int i = 0; i<lista.length; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
			lista[i] = numero;
		}
	}
	
	public static void mostrar(int lista[]) {
		for(int i = 0; i<lista.length; i++) {
			System.out.println("Posicion: "+i+" -> "+lista[i]);
		}
	}
}
