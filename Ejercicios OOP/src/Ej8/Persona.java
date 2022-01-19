package Ej8;

public abstract class Persona {
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private char sexo;
	
	//CONSTANTES
	private final int EDAD_DEF = 15;
	private final char SEXO_DEF = 'H';
	
	//CONSTRUCTOR
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		comprobarEdad(edad);
		this.sexo = sexo;
	}
	
	//METODOS PARA COMPROBAR DATOS
	public void comprobarEdad(int edad) {
		if (edad > 18 || edad < 12) {
			this.edad = EDAD_DEF;
		}else {
			this.edad = edad;
		}
	}
	
	public void comprobarSexo(char sexo) {
		if(sexo != 'H' && sexo != 'M') {
			this.sexo = SEXO_DEF;
		}else {
			this.sexo = sexo;
		}
	}
	
	//METODOS GETS
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public char getSexo() {
		return sexo;
	}
	
	public abstract String toString();

}
