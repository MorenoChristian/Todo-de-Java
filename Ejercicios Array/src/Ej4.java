
public class Ej4 {

	public static void main(String[] args) {
		
		int contador = 0;
		
		int[] numeros = new int[101];
		
		for(int i = 0; i<numeros.length; i++) {
			numeros[i] = i;
			contador += numeros[i];
		}
		
		double media = (double)(contador / numeros.length);
		
		System.out.println("La suma de los 100 numeros es: "+contador);
		System.out.println("Su media es: "+media);
	}

}
