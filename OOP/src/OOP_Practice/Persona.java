package OOP_Practice;

public abstract class Persona {
	
	//atributos
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	private static int siguiente_dni = 1;
	
	//constructor
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		dni = siguiente_dni;
		
		siguiente_dni++;
	}
	
	//metodos
	public String get_info() {
		return "Hola, mi nombre es "+nombre+" "+apellido+", tengo "+edad+" años, y obtuve el "
				+ "dni numero: "+dni;
	}
	
	public abstract String get_descripcion();
	
	public static int get_siguiente_dni() {
		return siguiente_dni;
	}
	
	public String get_nombre() {
		return nombre;
	}
	
	public String get_apellido() {
		return apellido;
	}
	
	
}
