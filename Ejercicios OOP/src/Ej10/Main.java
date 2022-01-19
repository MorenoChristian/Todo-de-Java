package Ej10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Baraja baraja = new Baraja();
		
		//baraja.mostrarBaraja();
		baraja.barajar();
		System.out.println("Cartas Mezcladas");
		baraja.mostrarBaraja();
		baraja.cartasMonton();
		System.out.println(baraja.siguienteCarta());
		System.out.println(baraja.cartasDisponibles());
		baraja.darCartas(10);
		System.out.println(baraja.cartasDisponibles());
		baraja.darCartas(5);
		System.out.println(baraja.cartasDisponibles());
		baraja.cartasMonton();
	}

}
