package Ej5;

public class Main {

	public static void main(String[] args) {
		Serie[] lista_series = new Serie[3];
		Videojuego[] lista_juegos = new Videojuego[3];
		
		//INSTANCIAS DE CLASE SERIE
		lista_series[0] = new Serie();
		lista_series[1] = new Serie("Squid Game", "Torishiba");
		lista_series[2] = new Serie("Bojack Horseman", "Tim Burton", "Drama-Comedia", 6);
		
		//INSTANCIAS DE CLASE VIDEOJUEGOS
		lista_juegos[0] = new Videojuego();
		lista_juegos[1] = new Videojuego("God of War", 120);
		lista_juegos[2] = new Videojuego("The Witcher 3", "Aventura-Sandbox", "CD-Projekt", 40);
		
		//ENTREGAMOS SERIES Y JUEGOS
		lista_series[0].entregar();
		lista_series[1].entregar();
		lista_juegos[2].entregar();
		
		//CONTAR CUANTOS JUEGOS Y SERIES HAY ENTREGADOS
		int cont_series = 0;
		for(Serie e: lista_series) {
			if(e.isEntregado()) {
				e.devolver();
				cont_series++;
			}
		}
		System.out.println("La cantidad de series entregadas es de: "+cont_series);
		
		int cont_juegos = 0;
		for(Videojuego e: lista_juegos) {
			if(e.isEntregado()) {
				e.devolver();
				cont_juegos++;
			}
		}
		System.out.println("La cantidad de juegos entregados es de: "+cont_juegos);
		
		// SERIE CON MAS TEMPORADAS
		Serie mayorSerie = lista_series[0];
		
		for(Serie e: lista_series) {
			if(e.compareTo(mayorSerie) == true) {
				mayorSerie = e;
			}
		}
		System.out.println("La serie con mas temporadas es:\n"+mayorSerie.toString());
		
		// SERIE CON MAS TEMPORADAS
		Videojuego mayorJuego = lista_juegos[0];
				
		for(Videojuego e: lista_juegos) {
			if(e.compareTo(mayorJuego) == true) {
				mayorJuego = e;
			}
		}
		System.out.println("El juego con mas horas es:\n"+mayorJuego.toString());

	}

}
