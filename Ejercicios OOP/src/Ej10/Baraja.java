package Ej10;

public class Baraja {
	
	public int cant_cartas = 0;
	
	//AUXILIARES
	private int SIGUI_DEF = 0;
	private int DISP_DEF = 40;
	
	//AUXILIAR PARA DAR CARTA
	private int DAR_CART = 0;
	
	//CREAMOS UNA ARRAY DE CARTA
	Carta[] carta = new Carta[40];

	
	//CONSTANTES
	private int[] lista_numeros = {1,2,3,4,5,6,7,10,11,12};
	private String[] palos = {"oro","basto","espada","copa"};
	
	//CONSTRUCTOR
	public Baraja() {
			
		crearBaraja();

	}

	
	//METODO PARA CREAR LAS CARTAS DE LA BARAJA
	private void crearBaraja() {
		int aux = 0;
		while(cant_cartas < 4) {
			for(int i = 0; i<lista_numeros.length; i++) {
				carta[aux] = new Carta(lista_numeros[i], palos[cant_cartas]);
				aux++;
			}
			cant_cartas++;
		}
	}
	
	
	//METODO PARA MOSTRAR LAS CARTAS DE LA BARAJA
	public void mostrarBaraja() {
		for(Carta c: carta) {
			 System.out.println(c.getNumero()+" de "+c.getPalo());
		}
	}
	
	//METODO PARA BARAJAR LA BARAJA
	public void barajar() {
		//creamos las variables para guardas los valores del numero y palo
		int aux_num;
		String aux_palo;
		
		//recorremos el array "carta"
		for(int i = 0; i<carta.length; i++) {
			
			//pedimos un numero aleatorio del 0 al 40
			int aleatorio = (int)(Math.random()*40);
			
			//guaramos el valor de la carta actual en los aux´s
			aux_num = carta[i].getNumero();
			aux_palo = carta[i].getPalo();
			
			//cambiamos del aleatorio al actual
			carta[i].setNumero(carta[aleatorio].getNumero());
			carta[i].setPalo(carta[aleatorio].getPalo());
			
			//cambiamos del actual al aleatorio
			carta[aleatorio].setNumero(aux_num);
			carta[aleatorio].setPalo(aux_palo);
		}
		
	}
	
	//METODO PARA VER LA SIGUIENTE CARTA
	public String siguienteCarta() {
		if(SIGUI_DEF < 40) {
			//devolvemos el toString de la siguiente carta
			return "La siguiente carta es: "+carta[SIGUI_DEF].toString();
		}
		else {
			return "No hay mas cartas en la baraja";
		}
	}
	
	//METODO PARA MOSTRAR LAS CARTAS DISPONIBLES
	public String cartasDisponibles() {
		return "La cantidad de cartas disponibles es: "+DISP_DEF;
	}
	
	
	//METODO PARA DAR CARTAS
	public void darCartas(int numero) {
		
		if(numero < DISP_DEF) {
			
			for(int i = 0; i<numero; i++) {
				System.out.println("Se da la carta "+carta[DAR_CART].toString());
				DAR_CART ++;
			}
			
			//RESTAMOS LAS CARTAS DE LAS DISPONIBLES
			DISP_DEF -= numero;
			
		}else {
			System.out.println("No hay cartas suficientes para dar");
		}
	}
	
	//METODO PARA MOSTRAR LAS CARTAS QUE YA SE DIERON
	public void cartasMonton() {
		if(DAR_CART > 0) {
			System.out.println("Las cartas que se dieron son: ");
			for(int i = 0; i<DAR_CART; i++) {
				System.out.println(carta[i].toString());
			}
		}else {
			System.out.println("No se dieron cartas aun");
		}
	}
}
