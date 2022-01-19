package Ej4;

public class Electrodomestico {

}
class Electrodomesticos{
	// ATRIBUTOS
	private double precio_base, peso;
	private String color;
	private char consumo;
	
	//CONSTANSTES
	private final String COLOR_DEF = "Blanco";
	private final char CONSUM_DEF = 'F';
	private final double PRECIO_DEF = 100;
	private final double PESO_DEF = 5;
	
	//CONSTRUCTORES
	public Electrodomesticos() {
		this.color = COLOR_DEF;
		this.peso = PESO_DEF;
		this.precio_base = PRECIO_DEF;
		this.consumo = CONSUM_DEF;
	}
	
	public Electrodomesticos(double precio, double peso) {
		this.peso = peso;
		this.color = COLOR_DEF;
		this.consumo = CONSUM_DEF;
		this.precio_base = precio;
	}
	
	public Electrodomesticos(double precio, double peso, String color, char consumo) {
		this.peso = peso;
		comprobarColor(color);
		comprobarConsumo(consumo);
		this.precio_base = precio;
	}
	
	
	//METODOS PRIVADOS
	private void comprobarColor(String color) {
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean encontrado = false;
		
		for(int i = 0; i<colores.length; i++) {
			
			if(color.equals(colores[i])) {
				encontrado = true;
			}
			
		}
		if(encontrado == true) {
			this.color = color;
		}else {
			this.color = COLOR_DEF;
		}
	}
	
	private void comprobarConsumo(char consumo) {
		char[] consumos = {'A','B','C','D','E','F'};
		boolean encontrado = false;
		
		for(int i = 0; i<consumos.length; i++) {
			if(Character.compare(consumo, consumos[i]) == 0) {
				encontrado = true;
			}
		}
		
		if(encontrado == true) {
			this.consumo = consumo;
		}else {
			this.consumo = CONSUM_DEF;
		}
	}
	
	public double precioFinal() {
		double plus = 0;
		
		switch(consumo) {
			case 'A':
				plus = 100;
				break;
			case 'B':
				plus = 80;
				break;
			case 'C':
				plus = 60;
				break;
			case 'D':
				plus = 50;
				break;
			case 'E':
				plus = 30;
				break;
			case 'F':
				plus = 10;
				break;			
		}
		if(peso>0 && peso<=19) {
			plus += 10;
		}
		if(peso>=20 && peso<=49) {
			plus += 50;
		}
		if(peso>=50 && peso <=79) {
			plus += 80;
		}
		if(peso>80) {
			plus += 100;
		}
		//System.out.println(this.precio_base);
		//System.out.println(precio);
		//System.out.println(plus);
		return precio_base += plus;
	}
	
	//METODOS GET
	public double getPrecio() {
		return precio_base;
	}
	public String getColor() {
		return color;
	}
	public char getConsumo() {
		return consumo;
	}
	public double getPeso() {
		return peso;
	}
	
	public String toString() {
		return "Precio: "+precio_base+", Peso: "+peso+"kg, Color: "+color+", Consumo: "+consumo;
	}
}
