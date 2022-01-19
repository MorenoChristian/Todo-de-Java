package Ej8;

public class Aula {
	//ATRIBUTOS
	private int id = 0;
	private int num;
	private String destinado;
	
	//CONSTANTES
	private final String MAT_DEF = "Matematicas";
	
	//CONSTRUCTOR
	public Aula(int num, String destinado) {
		this.id = id+1;
		this.num = num;
		comprobarDestinado(destinado);
	}
	
	//COMPROBAR DESTINADO
	public String[] lista_materias = {"Matematica", "Fisica", "Filosofia"};
	public boolean encontrado = false;
	
	public void comprobarDestinado(String destinado) {
		for(int i = 0; i<lista_materias.length; i++) {
			if(destinado.equalsIgnoreCase(lista_materias[i])) {
				encontrado = true;
			}
			if(encontrado == true) {
				this.destinado = destinado;
			}else {
				this.destinado = MAT_DEF;
			}
		}
	}
	
	//METODO PARA DAR CLASES
	
	public String darClases(Alumno[] array, Profesor p) {
		
		//RECORREMOS TODOS LOS OBJECTOS ALUMNO Y VEMOS CUANTAS ASISTENCIAS HAY
		int cont_alum = 0;
		int cont_asis = 0;
		for(Alumno e: array) {
			cont_alum++;
			
			if(e.getAsistencia() == true) {
				cont_asis++;
			}
		}
		
		int cantidad_asistencia = (cont_asis*100)/cont_alum;
		
		//VERIFICAMOS SI EL PROFESOR SE ENCUENTRA PRESENTE PARA DAR CLASES
		boolean asis_profe = false;
		if(p.getAsistencia() == true) {
			asis_profe = true;
		}
		
		//COMPROBAMOS TODO
		if(cantidad_asistencia > 50 && asis_profe == true && (p.getMateria().equalsIgnoreCase(destinado)) == true) {
			System.out.println("Se puede dar clases con normalidad");
			darNotas(array);
			return "";
			
		}
		else if(cantidad_asistencia > 50 && asis_profe == true && (p.getMateria().equalsIgnoreCase(destinado)) == false) {
			return "La materia del profesor no coincide con el del Aula";
		}
		else if(cantidad_asistencia > 50 && asis_profe == false) {
			return "Faltó el profesor";
		}
		else if(cantidad_asistencia < 50 && asis_profe == true) {
			return "Hay menos del 50% de alumnos presentes";
		}
		else {
			return "Faltaron los alumnos y el profesor";
		}
		
	}
	
	
	private void darNotas(Alumno[] a) {
		int cont_mujeres = 0;
		int cont_hombre = 0;
		System.out.println("Los chicos aprobados son:\n");
		for(Alumno alu: a) {
			if(alu.getNota() > 5 && alu.getSexo() == 'H') {
				cont_hombre++;
				System.out.println(alu.toString());
			}
		}
		System.out.println("Cantidad de chicos aprobados: "+cont_hombre);
		System.out.println("Las chicas aprobadas son:\n");
		for(Alumno alu: a) {
			if(alu.getNota() > 5 && alu.getSexo() == 'M') {
				cont_mujeres++;
				System.out.println(alu.toString());
			}
		}
		System.out.println("Cantidad de chicas aprobadas: "+cont_mujeres);
	}
}
