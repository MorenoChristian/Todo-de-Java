import java.util.ArrayList;
import java.util.Iterator;

public class IteradorRemove {
	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<>();
		
		//RELLENAMOS LOS ELEMENTOS DEL ARRAY LIST
		for(int i = 1; i<=10; i++) {
			arraylist.add("Elemento "+i);
		}
		
		//AGREGAMOS EL ELEMENTO 3 NUEVAMENTE EN POSICION 2
		arraylist.add(2, "Elemento 3");
		
		//ELIMINAMOS EL PRIMER ELEMENTO DEL ARRAYLIST, EL QUE ESTA EN POSICION 0
		System.out.println("Eliminando el primer elemento del Arraylist ("+arraylist.get(0)+")...");
		arraylist.remove(0);
		
		//COMPROBAMOS LA CANTIDAD DE ELEMENTOS DEL ARRAYLIST
		System.out.println("El array list tiene: "+arraylist.size()+" elementos");
		
		//CREAMOS EL ITERADOR
		Iterator<String> iterador = arraylist.iterator();
		
		
		//RECORREMOS EL ARRAYLIST Y ELIMINAMOS LOS ELEMENTOS IGUALES A ELEMENTO 3
		while(iterador.hasNext()) {
			String elemento = iterador.next();
			
			//COMPARAMOS Y BORRAMOS CON REMOVE
			if(elemento.equals("Elemento 3")) {
				iterador.remove();
			}
		}
		
		Iterator<String> iterador2 = arraylist.iterator();
		
		while(iterador2.hasNext()) {
			System.out.print(iterador2.next()+" | ");
		}
		
		System.out.println("El array list tiene: "+arraylist.size()+" elementos");
		
		}
	}

