package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		
		//CREAMOS LA LINKEDLIST Paises
		LinkedList<String> paises = new LinkedList<>();
		
		//AGREGAMOS LOS ELEMENTOS A PAISES
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Perú");
		
		
		//CREAMOS LA LINKEDLIST Capitales
		LinkedList<String> capitales = new LinkedList<>();
				
		//AGREGAMOS LOS ELEMENTOS A PAISES
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("DF");
		capitales.add("Lima");
		
		//COMPROBAMOS QUE TODO VA BIEN
		System.out.println(paises);
		System.out.println(capitales);
		
		//CREAMOS LOS LISTITERATOR
		ListIterator<String> itPaises = paises.listIterator();
		
		ListIterator<String> itCapitales = capitales.listIterator();
		
		//AGREGAMOS EN LA PRIMERA LINKEDLIST LOS ELEMENTOS DEL SEGUNDO LINKEDLIST
		while(itCapitales.hasNext()) {
			
			if(itPaises.hasNext()) {
				itPaises.next();
				itPaises.add(itCapitales.next());
			}
		}
		
		System.out.println("\nLinkedList Paises con sus Capitales");
		System.out.println(paises);
		
		//ELIMINAMOS LAS POSICIONES PARES
		itCapitales = capitales.listIterator(); //REINICIAMOS EN LA POSICION 0 EL ITERADOR
		
		while(itCapitales.hasNext()) {
			
			itCapitales.next();
			
			if(itCapitales.hasNext()) {
				
				itCapitales.next();
				
				itCapitales.remove();
				
			}
		}
		System.out.println("\nLinkedList Capitales sin pares");
		System.out.println(capitales);
		
		//REMOVEMOS DE PAISES TODOS LOS ELEMENTOS QUE HAY EN LA COLECCION CAPITALES
		paises.removeAll(capitales);
		System.out.println("\nLinkedList paises sin los elementos que quedaron el la linkedlist capitales");
		System.out.println(paises);
		
		
	}

}







































