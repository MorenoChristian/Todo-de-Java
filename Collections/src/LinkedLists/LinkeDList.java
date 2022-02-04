package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkeDList {

	public static void main(String[] args) {
		
		
		//CREAMOS UN LINKEDLIST
		LinkedList<String> nombres = new LinkedList<>();
		
		//AGREGAMOS ELEMENTOS A LA LINKEDLIST
		nombres.add("Christian");
		nombres.add("Jorge");
		nombres.add("Vanesa");
		nombres.add("Carmen");
		
		//CREAMOS UN ITERADOR PARA PODER RECORRER LA LINKED LIST
		ListIterator<String> it = nombres.listIterator();
		
		it.next();
		
		it.add("Gonzalo");
		
		for(String nombre: nombres) {
			System.out.println(nombre);
		}
	}

}
