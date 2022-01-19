package OOP_Practice;

public class Empleado extends Persona implements Obligaciones_empleado{	
	
	//variables de instancia
	private String ocupacion;
	private double salario;
	private int antiguedad;
	
	//constructor
	public Empleado(String nombre, String apellido, int edad, String ocupacion,
			double salario, int antiguedad) {
		
		super(nombre, apellido, edad);
		this.ocupacion = ocupacion;
		this.salario = salario;
		this.antiguedad = antiguedad;
		
	}
	
	//metodos
	public void set_incentivo(double incentivo) {
		salario = salario + incentivo;
	}
	
	public double get_salario() {
		return salario;
	}
	
	//metodo obligatorio de Clase Persona
	public String get_descripcion() {
		return "Hola, soy el empleado: "+super.get_nombre()+" "+super.get_apellido()+", mi ocupacion es "+ocupacion+", con una"
				+ " antiguedad de "+antiguedad+" anios";
	}
	
	//metodos obligatorios de Interfaz Obligaciones_empleado
	public String cumplirHorario() {
		return "Siendo "+ocupacion+", cumplo un horario de "+Obligaciones_empleado.hora_entrada+" hasta las"
				+ " "+Obligaciones_empleado.hora_salida;
	}
	
	public String cobrarSueldo() {
		return "Como "+ocupacion+", cobro un sueldo de: "+get_salario();
	}
	
	public String vacaciones() {
		return "Tengo 1 mes de vacaiones al anio";
	}
	
}
