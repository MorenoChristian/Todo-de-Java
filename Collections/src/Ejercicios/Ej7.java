package Ejercicios;
import java.util.HashMap;
import java.util.Map;

public class Ej7 {

	public static void main(String[] args) {
		/*
		 * 1. Hay 2 conjuntos: el contenido del primer conjunto es: 
		 * [Provincia de Heilongjiang, Provincia de Zhejiang, Provincia de Jiangxi, Provincia de Guangdong, Provincia de Fujian], 
		 * y el segundo conjunto es: [Harbin, Hangzhou, Nanchang, Guangzhou, Fuzhou]. 
		 * El primer elemento de la matriz se usa como la clave, y el segundo elemento de la matriz se almacena en la colección Map 
		 * como el valor. Tales como {Provincia de Heilongjiang = Harbin, Provincia de Zhejiang = Hangzhou, ...}.
		 */
		
		//CREAMOS LOS CONJUNTOS
		String[] provincias = {"Provincia de Chaco", "Provincia de Corrientes", "Provincia de Cordoba"};
		String[] capitales = {"Resistencia", "Corrientes", "Cordoba"};
		
		//CREAMOS EL MAP
		Map<String, String> map = new HashMap<>();
		
		for(int i = 0; i<provincias.length; i++) {
			
			map.put(provincias[i], capitales[i]);
		}
		
		//RECORREMOS EL MAPA
		for(Map.Entry<String, String> entrada: map.entrySet()) {
			String key = entrada.getKey();
			String value = entrada.getValue();
			
			System.out.println(key+": "+value);
		}
		
		

	}

}
