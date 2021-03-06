package Ej8;

public class Profesor extends Persona{
	//ATRIBUTOS
	private String materia;
	private boolean asistencia;
	
	//CONSTANTES
	private final String MAT_DEF = "Matematica";
	
	//CONSTRUCTOR
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		comprobarMateria(materia);
		isAsistencia();
	}
	
	//METODOS PARA COMPROBAR
	public String[] lista_materias = {"Matematicas", "Fisica", "Filosofia"};
	public boolean encontrado = false;
	
	public void comprobarMateria(String materia) {		
		for(int i = 0; i<lista_materias.length; i++) {
			if(materia.equalsIgnoreCase(lista_materias[i])) {
				encontrado = true;
			}
			if(encontrado == true) {
				this.materia = materia;
			}else {
				this.materia = MAT_DEF;
			}
		}
	}
	
	//CALCULAR PORCENTAJE DE PRESENCIA
	public void isAsistencia() {
		int porcentaje = (int)((Math.random()*100)+1);
		
		if(porcentaje <= 20) {
			this.asistencia = false;
		}else {
			this.asistencia = true;
		}
	}
	
	//METODO GET
	public boolean getAsistencia() {
		return asistencia;
	}
	public String getMateria() {
		return materia;
	}
	
	//METODO toString
	public String toString() {
		return "Nombre: "+super.getNombre()+", Edad: "+super.getEdad()+", Sexo: "+super.getSexo()+", Materia: "+materia;

	}
}
