package Ej5;

public class Videojuego implements Entregable {
	//ATRIBUTOS
	private String titulo, genero, compania;
	private int horas;
	private boolean entregado;
	
	//CONSTANTES
	private int HORAS_DEF = 10;
	private boolean ENTREGADO_DEF = false;
	
	//CONSTRUCTORES
	public Videojuego() {
		this.titulo = "";
		this.genero = "";
		this.compania = "";
		this.horas = HORAS_DEF;
		this.entregado = ENTREGADO_DEF;
	}
	public Videojuego(String titulo, int horas) {
		this.titulo = titulo;
		this.genero = "";
		this.compania = "";
		this.horas = horas;
		this.entregado = ENTREGADO_DEF;
	}
	public Videojuego(String titulo, String genero, String compania, int horas) {
		this.titulo = titulo;
		this.genero = genero;
		this.compania = compania;
		this.horas = horas;
		this.entregado = ENTREGADO_DEF;
	}
	
	//METODOS GET
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public String getCompania() {
		return compania;
	}
	public int getHoras() {
		return horas;
	}
	//METODOS SET
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	//METODO toString
	public String toString() {
		return "Juego: "+titulo+", Genero: "+genero+", Compania: "+compania+
				", Horas estimadas: "+horas+", Entregado?: "+entregado;
	}
	
	//METODOS DE LA INTERFAZ
	public void entregar() {
		this.entregado = true;
	}
	public void devolver() {
		this.entregado = false;
	}
	public boolean isEntregado() {
		return entregado;
	}
	
	public boolean compareTo(Object o) {
		boolean mayor = false;
		//casting
		Videojuego objecto = (Videojuego) o;
		if(horas > objecto.getHoras()) {
			return mayor = true;
		}else {
			return mayor;
		}
}
}
