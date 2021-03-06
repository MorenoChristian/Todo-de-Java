import javax.swing.JOptionPane;

public class Ej3 {

	public static void main(String[] args) {
		//ARRAY CON NUMEROS PRIMOS
		int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Tamanio del array: "));
		
		int[] numeros = new int[tamanio];
		
		rellenar(numeros, 1, 101);
		mostrar(numeros);

	}
	
	public static void rellenar(int[] array, int a, int b) {
		
		
		
		for(int i = 0; i<array.length; i++) {
			//PARA SABER SI ES PRIMO O NO
			int conta = 0;
			//CREAMOS EL NUMERO ALEATORIO
			int numero =  NumerosAleatorios_Metodo.NumAleatorios(a, b);
			
			//RECORREMOS DESDE 0 A ESE NUMERO HACIENDO LAS DIVISIONES
			for(int j = 1; j<=numero; j++) {
				
				//SI EL RESTO ES 0, SUMAMOS EL CONTADOR
				if(numero % j == 0) {
					conta++;
				}
				
			}
			 
			//SI EL CONTADOR ES IGUAL A DOS, SIGNIFICA QUE EL NUMERO TIENE SOLAMENTE 2 DIVISORE, EL MISMO Y EL 1
			if(conta == 2) {
				array[i] = numero;
			}
		}
	}
	
	public static void mostrar(int[] array) {
		int mayor = 0;
		for(int i = 0; i<array.length; i++) {
			System.out.println("Posicion: "+i+" -> "+array[i]);
			if(array[i] > mayor) {
				mayor = array[i];
			}
		}
		System.out.println("El numero mayor es el: "+mayor);
	}

}
