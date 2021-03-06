import javax.swing.JOptionPane;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Tama?o de los arrays: "));
		
		//CREAMOS LOS ARRAYS
		int[] array1 = new int[tamanio];
		int[] array2 = new int[tamanio];
		
		//RELLENAMOS EL PRIMERO ARRAY
		rellenar(array1);
		
		//APUNTAMOS EL SEGUNDO ARRAY AL PRIMERO
		array2 = array1;
		
		//CREAMOS UN NUEVO ARRAY CON EL PRIMER ARRAY
		array1 = new int[tamanio];
		
		rellenar(array1);
		
		
		//MOSTRAMOS LOS ARRAYS PARA TENER UNA REFERENCIA
		mostrar(array1);
		System.out.println("");
		mostrar(array2);
		System.out.println("");
		
		//MULTIPLICAMOS LOS ARRAYS
		mostrar(multiplicar(array1, array2));
		
		
		//LLAMAMOS AL RECOLECTOR DE BASURA
		System.gc();
		
	}
	
	public static void rellenar(int[] array) {
		for(int i = 0; i<array.length; i++) {
			int numero = NumerosAleatorios_Metodo.NumAleatorios(1, 101);
			array[i] = numero;
		}
	}
	
	public static int[] multiplicar(int[] array, int[] array_2) {
		
		//CREAMOS EL ARRAY QUE NOS VA A DEVOLVER
		int[] array3 = new int[array.length];
		
		for(int i = 0; i<array.length; i++) {
			array3[i] = array[i] * array_2[i];
		}
		
		return array3;
	}
	
	public static void mostrar(int[] array) {
		for(int i: array) {
			System.out.print(i+" ");
		}
	}

}
