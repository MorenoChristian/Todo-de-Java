package Ejercicios;

import java.util.TreeSet;

public class Ej5 {

	public static void main(String[] args) {
		
		/*
		 * Ejercicio cinco: el uso de Comparable y Comparator

		   Use las interfaces Comparable y Comparator para ordenar los puntajes de los siguientes cuatro estudiantes 
		   en orden descendente. Si los puntajes son los mismos, se ordenarán en orden descendente según los puntajes.
		 */
		
		Estudiantes estu1 = new Estudiantes("Ilusan", 20, 90);
		Estudiantes estu2 = new Estudiantes("Lisi", 22, 91);
		Estudiantes estu3 = new Estudiantes("Wangwu", 20, 99);
		Estudiantes estu4 = new Estudiantes("Sinliu", 22, 100);
		
		
		
		TreeSet<Estudiantes> estudiantes = new TreeSet<Estudiantes>();
		
		estudiantes.add(estu1);
		estudiantes.add(estu3);
		estudiantes.add(estu4);
		estudiantes.add(estu2);
		
		for(Estudiantes es: estudiantes) {
			System.out.println(es.toString());
		}
		
		
		
	}

}

class Estudiantes implements Comparable<Estudiantes>{
	
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private double nota;
	
	//CONSTRUCTOR
	public Estudiantes(String nombre, int edad, double nota) {
		this.nombre=nombre;
		this.edad=edad;
		this.nota=nota;
	}
	
	
	
	public String toString() {
		return "Nombre: "+nombre+", Edad: "+edad+", Nota: "+nota;
	}



	@Override
	public int compareTo(Estudiantes o) {
		// TODO Auto-generated method stub
		return (int)(nota - o.nota);
	}
	
	
}
