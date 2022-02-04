package Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Ej6 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 6: uso de la colección de mapas (1)

		1. Ahora hay un mapa establecido de la siguiente manera:

		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put (1, " ");
		map.put (2, "Zhou Zhiruo");
		map.put (3, "Wang Feng");
		map.put (4, "Exterminador también");

		Reclamación:

		1. Recorre la colección e imprime el número de serie y el nombre correspondiente.

		2. Inserte un mensaje codificado como 5 y llamado Li Xiaohong en el conjunto de mapas
		
		3. Elimine la información numerada 1 en el mapa

		4. Modifique la información del nombre numerada 2 en el mapa establecido en "Zhou Lin"
		 */
		
		//CREAMOS EL MAPA
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "");
		map.put(2, "Zhou Zhirou");
		map.put(3, "Wang Feng");
		map.put(4, "Exterminador también");
		
		//1
		for(Map.Entry<Integer, String> entrada: map.entrySet()) {
			int key = entrada.getKey();
			String value = entrada.getValue();
			
			System.out.println("Num de serie: "+key+", Nombre: "+value);
		}
		
		System.out.println("\n");
		
		//2
		map.put(5, "Li Xiaohong");
		
		//3
		map.remove(1);
		
		
		//4
		map.put(2, "Zhou Lin");
		
		System.out.println("Mostrando mapa modificado: ");
		
		for(Map.Entry<Integer, String> entrada: map.entrySet()) {
			int key = entrada.getKey();
			String value = entrada.getValue();
			
			System.out.println("Num de serie: "+key+", Nombre: "+value);
		}
	}

}
