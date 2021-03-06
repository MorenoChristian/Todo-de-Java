package Ej8;

public class Alumno extends Persona{
	//ATRIBUTOS
	private int calificacion;
	private boolean asistencia;
	
	//CONSTRUCTOR
	public Alumno(String nombre, int edad, char sexo, int calificacion) {
		super(nombre,edad,sexo);
		this.calificacion = calificacion;
		isAsistencia();
	}
	
	//METODOS PARA COMPROBAR
	public void comprobarCalif(int calificacion) {
		if(calificacion > 10) {
			this.calificacion = 10;
		}
		else if(calificacion < 1) {
			this.calificacion = 1;
		}
		else {
			this.calificacion = calificacion;
		}
	}
	
	//CALCULAR PORCENTAJE DE PRESENCIA
	public void isAsistencia() {
		int porcentaje = (int)(Math.random()*2);
		//System.out.println(porcentaje);
		
		if(porcentaje == 0) {
			this.asistencia = false;
		}else {
			this.asistencia = true;
		}
	}
	
	//METODO GET
	public boolean getAsistencia() {
		return asistencia;
	}
	public int getNota() {
		return calificacion;
	}
	
	//METODO toString
	public String toString() {
		return "Nombre: "+super.getNombre()+", Edad: "+super.getEdad()+", Sexo: "+super.getSexo()+", Calificacion: "+calificacion;
	}
}
