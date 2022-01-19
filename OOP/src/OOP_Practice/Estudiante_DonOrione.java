package OOP_Practice;

public class Estudiante_DonOrione extends Persona{
	
	//atributos
	private static String colegio = "UEP n° 55 Don Orione";
	private int anio_actual;
	
	//constructor
	public Estudiante_DonOrione(String nombre, String apellido, int edad, int anio_actual) {
		super(nombre,apellido,edad);
		
		this.anio_actual = anio_actual;
	}
	
	//metodos	
	public String get_descripcion() {
		return "Hola, soy el estudiante "+super.get_nombre()+" "+super.get_apellido()+" , soy del colegio "+colegio+""
				+ " y estoy cursando mi "+anio_actual+" anio";
	}
}
