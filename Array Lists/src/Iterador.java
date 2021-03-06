import java.util.ArrayList;
import java.util.Iterator;

public class Iterador {

	public static void main(String[] args) {
		// CREAMOS UN ARRAY LIST DE 10 ELEMENTOS
		
		ArrayList<String> arraylist = new ArrayList<>();
		
		//RELLENAMOS CON LOS ELEMENTOS
		for(int i = 1; i<=10; i++) {
			arraylist.add("Elemento "+i);
		}
		
		//A?ADIMOS UN NUEVO ELEMENTO EN LA POSICION 2
		arraylist.add(2, "Elemento 3");
		
		//CREAMOS EL ITERADOR
		Iterator<String> iterador = arraylist.iterator();
		
		//RECORREMOS LOS ELEMENTOS CON EL ITERADOR
		
		while(iterador.hasNext()) { //MIENTRAS EL ITERADOR TENGA UN SIGUIENTE
			String elemento = iterador.next();
			System.out.print(elemento+" / ");
		}
		
	}

}
