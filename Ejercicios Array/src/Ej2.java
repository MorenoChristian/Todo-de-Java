import javax.swing.JOptionPane;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano del array: "));
		
		//CREAMOS EL ARRAY CON EL TAMA�O POR TECLADO
		int[] numeros = new int[tamanio];
		
		//LLAMAMOS A LOS METODOS
		rellenar(numeros, 50, 101);
		mostrar(numeros);
		suma(numeros);
		
	}
	
	//CREAMOS EL METODO PARA RELLENAR EL ARRAY CON NUMEROS ALEATORIOS ENTRE a Y b excluyendo al b
	public static void rellenar(int[] array, int a, int b) {
		
		for(int i = 0; i<array.length; i++) {
			
			
			int numero = NumerosAleatorios_Metodo.NumAleatorios(a, b);
			
			array[i] = numero;
		}
	}
	
	//METODO PARA MOSTRAR LOS NUMEROS
	public static void mostrar(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println("Posisicon: "+i+" -> "+array[i]);
		}
	}
	
	public static void suma(int[] array) {
		int acum = 0;
		for(int i = 0; i<array.length; i++) {
			acum += array[i];
		}
		System.out.println("Suma total de los numero es: "+acum);
	}
	
	
	

}
