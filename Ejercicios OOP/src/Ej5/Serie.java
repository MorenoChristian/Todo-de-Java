package Ej5;

public class Serie implements Entregable {
	//ATRIBUTOS
	private String titulo, genero, creador;
	private int num_temp;
	private boolean entregado;
	
	//CONSTANTES
	private int NUM_TEMP_DEF = 3;
	private boolean ENTREGADO_DEF = false;
	
	//CONSTRUCTORES
	public Serie() {
		this.titulo = "";
		this.genero = "";
		this.creador = "";
		this.num_temp = NUM_TEMP_DEF;
		this.entregado = ENTREGADO_DEF;
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		
		this.num_temp = NUM_TEMP_DEF;
		this.entregado = ENTREGADO_DEF;
	}
	
	public Serie(String titulo, String creador, String genero, int num_temp) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.num_temp = num_temp;
		this.entregado = ENTREGADO_DEF;
	}
	
	//METODOS GET
	public String getTitulo() {
		return titulo;
	}
	public String getCreador() {
		return creador;
	}
	public String getGenero() {
		return genero;
	}
	public int getNumTemp() {
		return num_temp;
	}
	
	//METODOS SET
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setNumTemp(int num_temp) {
		this.num_temp = num_temp;
	}
	
	//METODO toString
	public String toString() {
		return "Serie: "+titulo+", Creador: "+creador+", Genero: "+genero+", Numero de temporadas: "+num_temp+
				", Entregado?: "+entregado;
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
		Serie objecto = (Serie) o;
		if(num_temp > objecto.getNumTemp()) {
			return mayor = true;
		}else {
			return mayor;
		}
		
		
	}
}
