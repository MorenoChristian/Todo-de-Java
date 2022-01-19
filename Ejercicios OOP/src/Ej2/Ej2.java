package Ej2;

import java.util.Random;

public class Ej2 {

}

class Persona{
	private String nombre;
	private int edad, dni;
	private char sexo;
	private double peso, altura;
	
	// variables para los metodos
	int retorno = 0;
	boolean mayor = false;
	
	//CONSTRUCTORES
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = 0;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo, double peso
			,double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int getdni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int calcuarIMC() {
		double peso_ideal = peso / (Math.pow(altura, 2));
		
		
		if (peso_ideal < 20) {
			return retorno = 1;
		}
		if(peso_ideal > 20 && peso_ideal < 25) {
			return retorno = -1;
		}
		if (peso_ideal > 25) {
			return retorno = 0;
		}
		
		return retorno;
	}
	
	public boolean esMayorDeEdad() {
		if(edad >= 18) {
			return mayor = true;
		}
		else {
			return mayor;
		}
	}
	
	public void comprobarSexo() {
		if(sexo != 'H' || sexo != 'M') {
			this.sexo = 'H';
		}
	}
	
	public void generarDni() {
		Random rand = new Random();
		this.dni = rand.nextInt(100000000);
	}
	
	public String toString() {
		return "Nombre: "+nombre+", edad: "+edad+", sexo: "+sexo+", dni: "+dni+""
				+ ", peso: "+peso+", altura: "+altura;
	}
}






















