package Ej6;


public class Main {
	public static void main(String[] args) {
		//INSTANCIAMOS LOS OBJETOS LIBROS
		Libro libro1 = new Libro();
		Libro libro2 = new Libro(true, "Los ojos del perro siberiano", "Antonio Santa Ana", 220);
		Libro libro3 = new Libro(false, "El Alquimista", "Paulo Coelho", 120);
		
		Libro[] lista_libros = new Libro[3];
		lista_libros[0] = libro1;
		lista_libros[1] = libro2;
		lista_libros[2] = libro3;
		
		Libro mayor = lista_libros[0];
		
		for(Libro e: lista_libros) {
			if(e.getPaginas() > mayor.getPaginas()) {
				mayor = e;
			}
		}
		
		System.out.println("El libro con mas paginas es:\n"+mayor.toString());
	}
}
