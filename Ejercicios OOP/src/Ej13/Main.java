package Ej13;

public class Main {
	public static void main (String [] args) {
		
		Productos[] lista_productos = new Productos[6];
		
		lista_productos[0] = new Perecedero("Pure de Tomate",50,1);
		lista_productos[1] = new Perecedero("Yogurt",100,2);
		lista_productos[2] = new Perecedero("Galletita",150,3);
		
		lista_productos[3] = new NoPerecedero("Harina",45,"Triple A");
		lista_productos[4] = new NoPerecedero("Aceite",200,"Valentin");
		lista_productos[5] = new NoPerecedero("Arroz",100,"Don Cacho");
		
		for(Productos p: lista_productos) {
			System.out.println(p.toString());
			System.out.println("Precio total: "+p.calcular(3));
		}
		
	}
}
