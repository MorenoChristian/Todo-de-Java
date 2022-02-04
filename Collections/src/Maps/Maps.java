
package Maps;
import java.util.*;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREAMOS EL MAPA
		HashMap<String, Empleado> personal = new HashMap<>();
		
		//AGREGAMOS ELEMENTOS AL MAPA
		personal.put("141", new Empleado("Christian"));
		personal.put("142", new Empleado("Gonzalo"));
		personal.put("143", new Empleado("Martin"));
		personal.put("144", new Empleado("Vanesa"));
		
		//IMPRIMIMOS EL MAPA
		System.out.println(personal);
		
		//PODEMOS SOBREESCRIBIR UN ELEMENTO DEL MAPA CON SU KEY
		personal.put("144", new Empleado("Carla"));
		System.out.println("\nReemplazando Vanesa por Carla");
		System.out.println(personal);
		
		//PODEMOS REMOVER UN ELEMENTO DESDE SU KEY
		personal.remove("143");
		System.out.println("\nRemoviendo key 143");
		System.out.println(personal);
		
		
		//RECORREMOS EL MAPA COMO SI FUERA UN SET
		System.out.println("\nImprimiendo el Map como si fuera un Set");
		for(Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave = "+clave+", Valor = "+valor);
		}
	}

}

class Empleado{
	public Empleado(String nombre) {
		this.nombre=nombre;
		this.sueldo = 2000;
	}
	
	private String nombre;
	private int sueldo;
	
	public String toString() {
		return "[Nombre = "+nombre+", Sueldo = "+sueldo+"]";
	}
}
