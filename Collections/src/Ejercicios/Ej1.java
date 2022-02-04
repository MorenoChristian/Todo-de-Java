package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej1 {

	public static void main(String[] args) {
		/*
		 * 1. Genere 10 números aleatorios que van del 1 al 100 y colóquelos en una matriz 
		 * Coloque los números mayores o iguales a 10 en la matriz en un conjunto de listas e 
		 * imprímalos en la consola.
		 */
		
		int[] numeros = new int[60];
		ArrayList<Integer> iguales10 = new ArrayList<>();
		
		for(int i = 0; i<numeros.length; i++) {
			numeros[i] = (int)(15*Math.random());
		}
		
		System.out.println("\nVector de numeros aleatorios");
		for(int num: numeros) {
			System.out.print(num+" ");
		}
		
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i] == 10) {
				iguales10.add(numeros[i]);
			}
		}
		
		Iterator<Integer> it = iguales10.iterator();
		
		System.out.println("\nImprimiendo el ArrayList");
		while(it.hasNext()) {
			int num = it.next();
			System.out.print(num+ " ");
		}
	}

}
