
public class NumerosAleatorios_Metodo {
	
	public static int NumAleatorios(int a, int b) {
		
		//FORMULA PARA GENERAR ALEATORIOS ENTRE DOS VALORES ((A-B+1)+B)
		int numero = (int)(Math.random()*(a-b+1)+b);
		return numero;
	}
}
