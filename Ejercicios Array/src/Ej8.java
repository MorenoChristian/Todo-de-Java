import javax.swing.JOptionPane;

public class Ej8 {
	public static void main(String[] args) {
		
		int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Tama?o del array: "));
		
		int[] numeros = new int[tamanio];
		rellenar(numeros);
		System.out.println("Array Original");
		mostrar(numeros);
		
		
		int buscar = Integer.parseInt(JOptionPane.showInputDialog("Qu? numero desea buscar?: "));
		
		int[] buscados = buscar(numeros, 5);
		System.out.println("Array Buscado");
		mostrar(buscados);
		
		
		
	}
	
	public static void rellenar(int[] array) {
		for(int i = 0; i<array.length; i++) {
			int numero = NumerosAleatorios_Metodo.NumAleatorios(1, 101);
			array[i] = numero;
		}
	}
	
	public static void mostrar(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println("Numero -> "+array[i]);
		}
	}
	
	public static int[] buscar(int[] array ,int buscar) {
		int j = 0;
		int[] array2 = new int[array.length];
		for(int i = 0; i<array.length; i++) {
			if(array[i]%10 == buscar) {
				array2[j] = array[i];
				j++;
			}
		}
		return array2;
	}
}
