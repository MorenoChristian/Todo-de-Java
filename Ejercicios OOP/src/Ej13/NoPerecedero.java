package Ej13;

public class NoPerecedero extends Productos{
	//ATRIBUTOS
	private String tipo;
	
	//CONSTRUCTOR
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	
	//METODOS GET
	public String getTipo() {
		return tipo;
	}
	//METODO SET
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//METODO toString
	public String toString() {
		return super.toString()+"\nTipo "+tipo;
	}
	
	public double calcular(int cantidad) {
		double total = 0;
		total = super.getPrecio() * cantidad;
		return total;
	}
}
