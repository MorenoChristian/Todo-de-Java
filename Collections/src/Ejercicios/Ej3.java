package Ejercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ej3 {

	public static void main(String[] args) {
		/*
		 * La matriz conocida almacena un lote de números QQ. El número QQ más largo es de 11 dígitos y el
		 * más corto es de 5 dígitos String [] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933" }.
		   Almacene todos los números qq en la matriz en LinkedList, elimine los elementos repetidos en la lista e
		   imprima todos los elementos en la lista con un iterador y un bucle for mejorado.
		 */
		
		String[] qq = {"12345","67891","12347809933","98765432102","67891","12347809933"};
		
		LinkedList<String> numeros = new LinkedList<>();
		
		for(String num: qq) {
			numeros.add(num);
		}
		
		ListIterator<String> it = numeros.listIterator();
		
		System.out.println("LinkedList Original");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n");
		
		//BORRAMOS LOS ELEMENTOS REPETIDOS
		for(int i = 0; i<numeros.size(); i++) {
			for(int j = i+1; j<numeros.size(); j++) {
				
				if(numeros.get(i).equals(numeros.get(j))) {
					numeros.remove(j);
				}
			}
		}
		
		System.out.println("LinkedList con elementos repetidos borrados");
		
		it = numeros.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}

	}

}
