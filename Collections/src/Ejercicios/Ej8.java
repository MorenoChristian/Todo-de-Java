package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej8 {

	public static void main(String[] args) {
		/*
		 * 1. Defina una colección de Lista cuyo tipo genérico sea Cadena y cuente el número de ocurrencias de 
		 * cada carácter (nota, no una cadena) en la colección. Por ejemplo: hay dos elementos "abc" y "bcd" en 
		 * el conjunto, el resultado final del programa es: "a = 1, b = 2, c = 2, d = 1"
		 */
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("abc");
		arraylist.add("bcd");
		
		//ACUMULADOR
		int acumA = 0; 
		int acumB = 0; 
		int acumC = 0; 
		
		//System.out.println(arraylist.get(0).charAt(0));
		
		//CREAMOS EL ITERADOR
		Iterator<String> it = arraylist.iterator();
		
		while(it.hasNext()) {
			String elemento = it.next();
			
			
			
			
			for(int i = 0; i<elemento.length(); i++) {
				
				if(elemento.charAt(i) == 'a') {
					acumA++;
				}else if(elemento.charAt(i) == 'b') {
					acumB++;
				}else {
					acumC++;
				}
			}
		}
		
		System.out.println("a = "+acumA+". b = "+acumB+", c = "+acumC);
		
		
	}

}
