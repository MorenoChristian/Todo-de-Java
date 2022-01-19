import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		//OPERACIONES BASICAS CON LOS ARRAY LIST
		
		//DECLARACION DE UN ARRAY LIST DE STRINGS, PUEDE CONTENER CUALQUIER TIPO
		ArrayList<String> arraylist = new ArrayList<String>();
		
		//AGREGAMOS UN ELEMENTO AL ARRAYLIST
		arraylist.add("Elemento 1");
		arraylist.add("Elemento 3");
		arraylist.add("Elemento 4");
		arraylist.add("Elemento 1");
		
		//AGREGAR UN ELEMENTO EN CIERTA POSICION
		arraylist.add(1, "Elemento 2");
		
		//DEVUELVE EL NUMERO DE ELEMENTOS DEL ARRAYLIST
		System.out.println("Numero de elementos en el arraylist: "+arraylist.size());
		
		//DEVUELVE EL ELEMENTO DE LA POSICION
		System.out.println("Elemento en posicion 1: "+arraylist.get(1));
		
		//COMPRUEBA QUE EXISTA EL ELEMENTO "Elemento 2" EN EL ARRAY LIST
		System.out.println("Existe en el array list Elemento 1?: "+arraylist.contains("Elemento 1"));
		
		//DEVUELVE EL INDICE DE LA PRIMERA OCURRENCIA DE "Elemento 2"
		System.out.println("Índice del elemento Elemento 2: "+arraylist.indexOf("Elemento 2"));
		
		//DEVUELVE EL INDICE DE LA ULTIMA OCURRENCIA DE "Elemento 1"
		System.out.println("Indice de ultima ocurrencia de Elemento 1: "+arraylist.lastIndexOf("Elemento 1"));
		
		//REMUEVE EL ELEMENTO EN LA POSICION DESEADA
		System.out.println("Removiendo el elemento: "+arraylist.get(2)+" del array list");
		
		//BORRA TODOS LOS ELEMENTOS DEL ARRAY LIST
		arraylist.clear();
		
		//DEVUELVE TRUE SI LA LISTA ESTA VACIA
		System.out.println("La lista está vacia?: "+arraylist.isEmpty());
		
		//CREAR UNA COPIA DE UN ARRAY LIST
		ArrayList arraylistCopia = (ArrayList) arraylist.clone();
		
		//PASAMOS EL ARRAY LIST A UN ARRAY NORMAL
		Object[] array = arraylist.toArray();
		
		

	}

}
