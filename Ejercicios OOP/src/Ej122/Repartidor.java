package Ej122;

public class Repartidor extends Empleado{
	//ATRIBUTOS
	private String zona;
	
	//CONSTRUCTOR
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre,edad,salario);
		this.zona = zona;
	}
	
	//METODOS GET
	public String getZona() {
		return zona;
	}
	//METODO SET
	public void setZona() {
		this.zona = zona;
	}
	
	//METODO toString
	public String toString() {
		return super.toString()+"\nZona: "+zona;
	}
	
	//METODO HEREDADO
	public double plus() {
		if(super.getEdad() < 25 && zona.equalsIgnoreCase("zona 3")) {
			super.setSalario(super.getSalario()+super.getPlus());
			return super.getSalario();
		}else {
			return super.getSalario();
		}
	}
}
