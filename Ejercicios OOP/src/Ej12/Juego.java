package Ej12;

public class Juego {
	//ATRIBUTOS
	private Jugador[] jugadores;
	private Revolver revo;
	
	//CONSTRUCTOR
	public Juego(Jugador[] jugadores, Revolver revo) {
		this.jugadores = jugadores;
		this.revo = revo;
	}
	
	//METODO RONDA
	public void ronda(Jugador[] jugadores, Revolver revo) {
		
		for(int i = 0; i<jugadores.length; i++) {
			System.out.println("El jugador "+jugadores[i].toString()+", presiona lel gatillo");
			
			
			if(jugadores[i].disparar(revo) == false) {
				System.out.println("El jugador "+jugadores[i].toString()+", ha muerto");
				finJuego(jugadores[i]);
				System.exit(0);
				
			}else {
				revo.siguienteBala();
				System.out.println("Se da vuelta el tambor, y empieza la siguiente ronda");
			}
		}
	}
	
	private boolean finJuego(Jugador j) {
		boolean terminado = false;
		if(j.getVivo() == false) {
			System.out.println("El juego ha terminado");
			return terminado;
		}else {
			return terminado;
		}
	}
	
}
