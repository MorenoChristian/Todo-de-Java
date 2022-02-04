package Sets;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro("Titulo","Chritiasn",10);
		Libro libro2 = new Libro("Titulo 2","Martin", 10);
		
		//NECESITAMOS SOBREESCRIBIR EL METODO equals() DE Objects (CLASE COSMICA) PARA PODER COMPARAR CORRECTAMENTE LOS OBJETOS
		if(libro1.equals(libro2)) {
			System.out.println("Los libros son iguales");
		}else {
			System.out.println("Los libros no son iguales");
		}
		System.out.println(libro1.getClass()+" "+ libro2.getClass());
	}

}
