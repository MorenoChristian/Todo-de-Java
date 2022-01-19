package ArrayLIstObjetos;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Creamos un ArrayList de objetos de "+PartidoFutbol.class);
		
		//CREAMOS EL ARRAYLIST
		ArrayList<PartidoFutbol> partidos = new ArrayList<>();
		
		//INSTANCIAMOS EL FICHERO DONDE ESTAN LOS DATOS
		File fichero = new File("C:/Users/Christian/Desktop/Platzi/Java/Proyectos/Array Lists/src/ArrayLIstObjetos/Partidos.txt");
		//CREAMOS EL SCANNER PARA LEER EL ARCHIVO EXTERNO
		Scanner scan;
		
		try {
			System.out.println("Leemos el contenido del archivo...");
			
			scan = new Scanner(fichero);
			
			//MIENTRAS SCAN TENGA UNA LINEA SIGUIENTE
			while(scan.hasNextLine()) {
				
				String linea = scan.nextLine(); //OBTENGO UNA LINEA DEL FICHERO (UN PARTIDO DE FUTBOL)
				
				String[] cortaString = linea.split("::"); //CORTAMOS EL STRING CADA VEZ QUE ENCUENTRE UN :: Y LO GUARDA EN UN ARRAY
				
				
				//GUARDAMOS LO QUE CORTAMOS EN VARIABLES PARA LUEGO LLAMAR AL CONSTRUCTOR
				String local = cortaString[0];
				String visitante = cortaString[1];
				int golesLocal = Integer.parseInt(cortaString[2]);
				int golesVisitante = Integer.parseInt(cortaString[3]);
				
				//LLAMAMOS AL CONSTRUCTOR
				PartidoFutbol partido = new PartidoFutbol(local, visitante, golesLocal, golesVisitante);
				
				//LO AGREGAMOS AL ARRAYLIST PARTIDOS
				partidos.add(partido);
			}
			
			//CERRAMOS EL SCAN
			scan.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//MOSTRAMOS LOS RESULTADOS
		Iterator<PartidoFutbol> iterador = partidos.iterator();
		System.out.println("Resultado de los partidos de futbol...");
		while(iterador.hasNext()) {
			PartidoFutbol partido = iterador.next();
			System.out.println(partido.toString());
		}
		
		System.out.println("");
		
		//MOSTRAMOS LOS EMPATES
		System.out.println("PARTIDOS EN EMPATA...");
		Iterator<PartidoFutbol> iterador2 = partidos.iterator();
		while(iterador2.hasNext()) {
			PartidoFutbol partido = iterador2.next();
			
			if(partido.getGolesLocal() == partido.getGolesVisitante()) {
				System.out.println(partido.toString());
			}
		}
		
	}

}
