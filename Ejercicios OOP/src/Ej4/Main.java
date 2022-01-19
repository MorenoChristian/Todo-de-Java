package Ej4;

public class Main {

	public static void main(String[] args) {
		
		Electrodomesticos[] lista_elect = new Electrodomesticos[6];
		
		lista_elect[0] = new Electrodomesticos(300, 50, "blanco", 'E');
		lista_elect[1] = new Lavadora(50, 200, 20, "verde", 'A');
		lista_elect[2] = new Electrodomesticos(190, 15, "negro", 'D');
		lista_elect[3] = new Television(200, 10, "rojo", 'B', 50, false);
		lista_elect[4] = new Lavadora(25, 195, 75, "amarillo", 'D');
		lista_elect[5] = new Television(500, 40, "gris", 'C', 70, true);
		
		// RECORREMOS LOS OBJETOS
		System.out.println("Precios Originales");
		for (Electrodomesticos e: lista_elect) {
			System.out.println(e.getPrecio());
		}
		
		System.out.println("Precios Finales");
		for (Electrodomesticos e: lista_elect) {
			System.out.println(e.precioFinal());
		}

	}

}
