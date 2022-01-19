package Ej2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre: ");
		String nombre = scan.nextLine();
		
		System.out.print("Ingrese la edad: ");
		int edad = scan.nextInt();
		
		System.out.print("Ingrese el sexo: ");
		char sexo = scan.next().charAt(0);
		
		System.out.print("Ingrese el peso: ");
		double peso = scan.nextDouble();
		
		System.out.println("Ingrese la altura: ");
		double altura = scan.nextDouble();
		
		Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
		Persona persona2 = new Persona(nombre,edad,sexo);
		Persona persona3 = new Persona();
		
		persona3.setNombre("Martin");
		persona3.setEdad(26);
		persona3.setPeso(68);
		persona3.setAltura(1.60);
		
		//Comprobar el peso
		if(persona1.calcuarIMC() == 0){
			System.out.println(persona1.getNombre()+" tiene sobre peso");
		}
		else if(persona1.calcuarIMC() == -1) {
			System.out.println(persona1.getNombre()+" tiene bajo peso");
		}
		else {
			System.out.println(persona1.getNombre()+" está en su peso ideal");
		}
		
		//Comprobamos si es mayor de edad
		System.out.println(persona1.getNombre()+" es mayor de edad? -> "+persona1.esMayorDeEdad());
		System.out.println(persona2.getNombre()+" es mayor de edad? -> "+persona2.esMayorDeEdad());
		System.out.println(persona3.getNombre()+" es mayor de edad? -> "+persona3.esMayorDeEdad());
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
	}

}
