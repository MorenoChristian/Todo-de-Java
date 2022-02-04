package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej2 {

	public static void main(String[] args) {
		/*
		 * Defina un método listTest (ArrayList al, Integer s), que requiere devolver el 
		 * índice de la primera aparición de s en al, o -1 si no ha aparecido s
		 */
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		
		System.out.println(listTest(numeros, 6));
		
	}
	
	public static int listTest(ArrayList<Integer> al, int s) {
		
		if(al.indexOf(s) != 0) {
			return al.indexOf(s);
		}else{
			return -1;
		}
		
		
	}

}
