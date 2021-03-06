package Ej122;

public class Comercial extends Empleado {
	//ATRIBUTOS
	private double comision;
	
	//CONSTRUCTOR
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
	
	//METODO GET
	public double getComision() {
		return comision;
	}
	//METODO SET
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	//METODO toString
	public String toString() {
		return super.toString()+"\nComision: "+comision;
	}
	
	//METODO PLUS
	public double plus() {
		if(super.getEdad() > 30 && super.getSalario() > 200) {
			super.setSalario(super.getSalario()+super.getPlus());
			return super.getSalario();
		}else {
			return super.getSalario();
		}
	}
}
