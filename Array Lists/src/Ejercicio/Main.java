
package Ejercicio;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		/*
		 * El ejercicio es el siguiente. Dado un fichero con una serie de números, hay que eliminar todos los 
		 * ceros que hay en el fichero, y si una linea esta llena de ceros, hay que eliminar la linea
		 */
		
		//CREAMOS UN ARRAYLIST DE ARRAYLIST DE ENTEROS
		ArrayList<ArrayList<Integer>> arraylistNumeros = new ArrayList<ArrayList<Integer>>();
		
		//CREAMOS EL SCANNER y el FIle
		File file = new File("C:/Users/Christian/Desktop/Platzi/Java/Proyectos/Array Lists/src/Ejercicio/Numeros.txt");
		Scanner scan;
		
		try {
			
			scan = new Scanner(file);
			
			while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				String[] cortaString = linea.split(" ");
				
				//CREAMOS UN ARRAYLIST DE ENTEROS
				ArrayList<Integer> numeros = new ArrayList<Integer>();
				
				//GUARDAMOS LOS ELEMENTOS DEL ARRAY EN EL ARRAYLIST
				for(int i = 0; i<cortaString.length; i++) {
					numeros.add(Integer.parseInt(cortaString[i]));
				}
				
				//AGREGAMOS EL ARRAYLIST DENTRO DEL ARRAYLIST PRINCIPAL
				arraylistNumeros.add(numeros);
			}
			
			scan.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//VERIFICAMOS QUE ToDO SE HAYA GUARDADO CORRECTAMENTE
		System.out.println("Contenido de los arraylist del arraylist...");
		Iterator<ArrayList<Integer>> iterador = arraylistNumeros.iterator();
		
		while(iterador.hasNext()) {
			
			ArrayList<Integer> numeros = iterador.next(); //ESTE VA A GUARDAR CADA UNO DE LOS ARRAYLIST DENTRO DEL ARRAYLIST ORIGINAL
			
			Iterator<Integer> iterador2 = numeros.iterator(); //CREAMOS UN ITERADOR NUEVO PARA RECORRER EL ARRAYLIST DENTRO DEL ARRAYLIST
			
			while(iterador2.hasNext()) {
				int numero = iterador2.next();
				System.out.print(numero+" ");
			}
			System.out.println(" ");
			
		}
		
		System.out.println("");
		
		//AHORA BORRAMOS TODOS LOS 0 QUE SE ENCUENTREN EN LOS ARRAYLIST DEL ARRAYLIST
		System.out.println("Borrando 0s de la lista de numeros...");
		Iterator<ArrayList<Integer>> iterador_borrar = arraylistNumeros.iterator();
		
		while(iterador_borrar.hasNext()) {
			
			ArrayList<Integer> numeros = iterador_borrar.next();
			
			Iterator<Integer> iterador_borrar2 = numeros.iterator();
			
			while(iterador_borrar2.hasNext()) {
				
				int numero = iterador_borrar2.next();
				
				if(numero == 0) {
					iterador_borrar2.remove();
				}
			}
		}
		
		//MOSTRAMOS COMO QUEDA DESPUES DE BORRAR LOS 0S
		Iterator<ArrayList<Integer>> iterador3 = arraylistNumeros.iterator();
		
		while(iterador3.hasNext()) {
			
			ArrayList<Integer> numeros = iterador3.next(); //ESTE VA A GUARDAR CADA UNO DE LOS ARRAYLIST DENTRO DEL ARRAYLIST ORIGINAL
			
			Iterator<Integer> iterador2 = numeros.iterator(); //CREAMOS UN ITERADOR NUEVO PARA RECORRER EL ARRAYLIST DENTRO DEL ARRAYLIST
			
			while(iterador2.hasNext()) {
				int numero = iterador2.next();
				System.out.print(numero+" ");
			}
			System.out.println(" ");
			
		}
		
		System.out.println("");
		//AHORA NECESITAMOS BORRAR LAS LINEAS QUE QUEDAN VACIAS PERO AUN SE GUARDAN EN EL ARRAYLIST ORIGINAL
		System.out.println("Borrando las lineas vacias...");
		
		Iterator<ArrayList<Integer>> iterador4 = arraylistNumeros.iterator();
		
		while(iterador4.hasNext()) {
			
			ArrayList<Integer> numeros = iterador4.next();
			
			if(numeros.isEmpty()) {
				iterador4.remove();
			}
		}
		
		//MOSTRAMOS COMO QUEDA DESPUES DE BORRAR LOS 0S
		Iterator<ArrayList<Integer>> iterador5 = arraylistNumeros.iterator();
				
		while(iterador5.hasNext()) {
					
			ArrayList<Integer> numeros = iterador5.next(); //ESTE VA A GUARDAR CADA UNO DE LOS ARRAYLIST DENTRO DEL ARRAYLIST ORIGINAL
					
			Iterator<Integer> iterador2 = numeros.iterator(); //CREAMOS UN ITERADOR NUEVO PARA RECORRER EL ARRAYLIST DENTRO DEL ARRAYLIST
					
			while(iterador2.hasNext()) {
				int numero = iterador2.next();
				System.out.print(numero+" ");
			}
			System.out.println(" ");
					
			}
		
	}
}
