package Ej4;

public class Lavadora extends Electrodomesticos{
	//ATRIBUTOS PROPIOS
	private int carga;
	
	//CONSTANTES
	private final int CARGA_DEF = 0;
	
	//CONSTRUCTORES
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA_DEF;
	}
	public Lavadora(int carga, double precio, double peso, String color, char consumo) {
		super(precio, peso, color, consumo);
		this.carga = carga;
	}
	
	// METODO GET
	public int getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		double plus = super.precioFinal();
		
		if(carga > 30) {
			plus += 50;
		}
		return plus;
	}
	
}
















