package Ej4;

public class Television extends Electrodomesticos {
	//ATRIBUTOS
	private double resolucion;
	private boolean sintonizador;
	
	//ATRIBUTOS POR DEFECTO
	private final double RESO_DEF = 20;
	private final boolean SINTO_DEF = false;
	
	//CONSTRUCTORES
	public Television() {
		this.resolucion = RESO_DEF;
		this.sintonizador = SINTO_DEF;
	}
	public Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion = RESO_DEF;
		this.sintonizador = SINTO_DEF;
	}
	public Television(double precio, double peso, String color, char consumo,
			double resolucion, boolean sintonizador) {
		super(precio, peso, color, consumo);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	
	//METODOS GET
	public double getResolucion() {
		return resolucion;
	}
	public boolean getSintonizador() {
		return sintonizador;
	}
	
	//METODOS
	public double precioFinal() {
		double plus = super.precioFinal();
		if(resolucion > 40) {
			plus += plus*0.3;
		}
		if(sintonizador == true) {
			plus += 50;
		}
		return plus;
	}
}



































