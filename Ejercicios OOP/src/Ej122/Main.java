package Ej122;

public class Main {
	public static void main(String[] args) {
		
		Comercial comercial = new Comercial("Christian", 55, 250, 201);
		
		System.out.println(comercial.toString());
		comercial.plus();
		System.out.println(comercial.toString());
		
		Repartidor repartidor = new Repartidor("Gonzalo", 23, 200, "ZoNa 3");
		
		System.out.println(repartidor.toString());
		repartidor.plus();
		System.out.println(repartidor.toString());
		
	}
}
