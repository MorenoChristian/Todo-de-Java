
public class Ej10 {

	public static void main(String[] args) {
		String[] nombres = {"Christian","Gonzalo","Martin","Vanesa","Carmen"};
		
		double[] notas = new double[nombres.length];
		
		rellenar(notas);
		
		//CREAMOS EL ARRAY CON LAS NOTAS FINALES
		String[] notasFinales = notaFinal(notas);
		
		//MOSTRAMOS LAS NOTAS FINALES
		mostrar(nombres,notas,notasFinales);
	}
	
	public static void rellenar(double[] array) {
		for(int i = 0; i<array.length; i++) {
			int numero = NumerosAleatorios_Metodo.NumAleatorios(0, 11);
			array[i] = numero;
		}
	}
	
	public static String[] notaFinal(double[] array) {
		String[] nota_final = new String[array.length];
		for(int i = 0; i<array.length; i++) {
			if(array[i] > 0 && array[i] < 5) {
				nota_final[i] = "Suspension";
			}
			else if(array[i] >=5 && array[i] < 7) {
				nota_final[i] = "Bien";
			}
			else if(array[i] >= 7 && array[i] < 8) {
				nota_final[i] = "Notable";
			}
			else {
				nota_final[i] = "Sobresaliente";
			}
		}
		return nota_final;
	}
	
	public static void mostrar(String[] nombres, double[] notas, String[] finales) {
		for(int i = 0; i<nombres.length; i++) {
			System.out.println("El alumno "+nombres[i]+" con nota: "+notas[i]+", Tiene un: "+finales[i]);
		}
	}
}
