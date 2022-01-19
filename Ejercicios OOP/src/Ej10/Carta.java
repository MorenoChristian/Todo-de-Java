package Ej10;

public class Carta {
	//ATRIBUTOS
	private int numero;
	private String palo;
	
	//CONSTRUCTOR
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	//METODOS GET
	public int getNumero() {
		return numero;
	}
	public String getPalo() {
		return palo;
	}
	
	//METODOS SETS
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}

	
	//METODO toString
	public String toString() {
		return numero+" de "+palo;
	}
}
