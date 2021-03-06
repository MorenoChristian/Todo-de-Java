package Ej122;

public abstract class Empleado {
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private double salario;
	
	//CONSTANTE
	private final double plus = 300;
	
	//CONSTRUCTOR
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	//METODOS GETER
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getSalario() {
		return salario;
	}
	public double getPlus() {
		return plus;
	}
	
	//METODOS SETS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//METODO toString
	public String toString() {
		return "Empleado: "+nombre+"\nEdad: "+edad+"\nSalario: "+salario;
	}
	
	public abstract double plus();
}
