package OOP_Practice;

public class Principal {

	public static void main(String[] args) {
		
		// instancias de empleado
		Empleado[] mis_empleados = new Empleado[2];
		mis_empleados[0] = new Empleado("Christian","Moreno",24,"Java Developer", 60000, 1);
		
		//mostramos la variable estatica de la clase Persona
		System.out.println(Persona.get_siguiente_dni());
		
		mis_empleados[1] = new Empleado("Gonzalo","Garcia",25,"Python Developer", 150000, 4);
		
		mis_empleados[1].set_incentivo(50000);
		
		// bucle for each para mostrar toda la informacion relevante
		for(Empleado e: mis_empleados) {
			System.out.println("Informacion de Personal: "+e.get_info());
			System.out.println("Descripcion del Empleado: "+e.get_descripcion());
			System.out.println(e.cumplirHorario());
			System.out.println(e.cobrarSueldo());
		}

	}

}
