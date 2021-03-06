package Ej12;

public class Jugador {
	//ATRIBUTOS
	public int id;
	private String nombre;
	private boolean vivo;
	
	//VARIABLE STATIC PARA AUMENTAR EL ID
	private static int siguiente_id = 1;
	
	//CONSTRUCTOR
	public Jugador(String nombre) {
		this.id = siguiente_id;
		this.nombre = nombre;
		this.vivo = true;
		siguiente_id++;
	}
	
	//METODO DISPARAR
	public boolean disparar(Revolver r) {
		//SI EL REVOLVER SE DISPARA, EL JUGADOR MUERE
		if(r.dispara() == true) {
			return vivo = false;
		}else {
			return vivo = true;
		}
	}
	
	public boolean getVivo() {
		return vivo;
	}
	
	public String toString() {
		return "Jugador: "+nombre+", id: "+id;
	}

}
