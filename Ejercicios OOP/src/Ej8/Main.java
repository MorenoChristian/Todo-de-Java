package Ej8;

public class Main {

	public static void main(String[] args) {
		
		Alumno[] lista_alumnos = new Alumno[10];
		
		lista_alumnos[0] = new Alumno("Christian", 24, 'H', 1);
		lista_alumnos[1] = new Alumno("Gonzalo", 25, 'H', 2);
		lista_alumnos[2] = new Alumno("Vanesa", 12, 'M', 3);
		lista_alumnos[3] = new Alumno("Martin", 13, 'H', 4);
		lista_alumnos[4] = new Alumno("Carmen", 14, 'M', 5);
		lista_alumnos[5] = new Alumno("Maxi", 15, 'H', 6);
		lista_alumnos[6] = new Alumno("Edith", 16 ,'M', 7);
		lista_alumnos[7] = new Alumno("Carina", 18, 'M', 8);
		lista_alumnos[8] = new Alumno("Roberto", 17, 'H', 9);
		lista_alumnos[9] = new Alumno("Antonela", 14, 'M', 10);
		
		Alumno[] lista_alumnos2 = new Alumno[10];
		
		lista_alumnos2[0] = new Alumno("Christian", 24, 'H', 1);
		lista_alumnos2[1] = new Alumno("Gonzalo", 25, 'H', 2);
		lista_alumnos2[2] = new Alumno("Vanesa", 12, 'M', 3);
		lista_alumnos2[3] = new Alumno("Martin", 13, 'H', 4);
		lista_alumnos2[4] = new Alumno("Carmen", 14, 'M', 5);
		lista_alumnos2[5] = new Alumno("Maxi", 15, 'H', 6);
		lista_alumnos2[6] = new Alumno("Edith", 16 ,'M', 7);
		lista_alumnos2[7] = new Alumno("Carina", 18, 'M', 8);
		lista_alumnos2[8] = new Alumno("Roberto", 17, 'H', 9);
		lista_alumnos2[9] = new Alumno("Antonela", 14, 'M', 10);
		
		Profesor profe = new Profesor("Cancelarich", 55, 'H', "Fisica");
		Profesor profe2 = new Profesor("Cancelarich", 55, 'H', "Matematica");
		
		Aula aula1 = new Aula(10, "Fisica");
		Aula aula2 = new Aula(10, "Matematica");
		
		System.out.println(aula1.darClases(lista_alumnos, profe));
		//System.out.println(aula2.darClases(lista_alumnos2, profe2));
		
		
	}

}
