package Ej12;

public class Main {

	public static void main(String[] args) {
		
		Revolver revo = new Revolver();
		System.out.println(revo.toString());
		
		
		Jugador[] jugadores = new Jugador[6];
		
		jugadores[0] = new Jugador("Christian");
		jugadores[1] = new Jugador("Gonzalo");
		jugadores[2] = new Jugador("Martin");
		jugadores[3] = new Jugador("Vanesa");
		jugadores[4] = new Jugador("Carmen");
		jugadores[5] = new Jugador("Brusilda");
		
		Juego juego = new Juego(jugadores, revo);
		juego.ronda(jugadores, revo);
		
		
	}

}
