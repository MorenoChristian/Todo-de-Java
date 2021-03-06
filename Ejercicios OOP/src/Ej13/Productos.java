package Ej13;

public class Productos {
	//ATRIBUTOS
	private String nombre;
	private double precio;
	
	//CONSTRUCTOR
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//METODOS GETS
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	
	//METODOS SETS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//METODO toString
	public String toString() {
		return "Nombre: "+nombre+"\nPrecio: "+precio;
	}
	
	public double calcular(int cantidad) {
		double total = 0;
		total = precio * cantidad;
		return total;
	}

}
