package Sets;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		
		//EJEMPLO DE TREESET
		TreeSet<String> nombres = new TreeSet<>();
		
		//AGREGO NOMBRES
		nombres.add("Nerina");
		nombres.add("Christian");
		nombres.add("Gonzalo");
		
		for(String nomb: nombres) {
			System.out.println(nomb);
		} //COMO SE PUEDE VER, ORDENA LOS ELEMENTOS CUANDO SON STRINGS
		
		
		//CREAMOS UN TREESET DE ARTICULOS CON SUS ELEMENTOS
		Articulo art1 = new Articulo(1, "Primer Articulo");
		Articulo art2 = new Articulo(2, "Segundo Articulo");
		Articulo art3 = new Articulo(3, "Tercer Articulo");
		
		TreeSet<Articulo> articulos = new TreeSet<>();
		
		articulos.add(art3);
		articulos.add(art1);
		articulos.add(art2);
		
		System.out.println("\nArticulos por orden numerico");
		for(Articulo ar: articulos) {
			System.out.println(ar.getDescripcion());
		}
		
		Articulo comparadorArticulos = new Articulo();
		
		//CREAMOS UN TREESET QUE LLEVE COMO PARAMETRO UN COMPARADOR, PARA QUE ORDENE LOS ELEMENTOS
		//SEGUN EL COMPARADOR, EN ESTE CASO, EN ORDEN ALFABETICO
		TreeSet<Articulo> ordenaArticulo = new TreeSet<Articulo>(comparadorArticulos);
		
		ordenaArticulo.add(art1);
		ordenaArticulo.add(art3);
		ordenaArticulo.add(art2);
		
		System.out.println("\nArticulos por orden alfabetico");
		for(Articulo ar: ordenaArticulo) {
			System.out.println(ar.getDescripcion());
		}
		
	}
	
}

//EL ORDENAMIENTO NO SUCEDE CON CLASES PROPIAS, EN DICHO CASO
//HAY QUE MODIFICAR EL METODO compareto() DE LA INTERFAZ COMPARABLE
class Articulo implements Comparable<Articulo>, Comparator<Articulo>{ //LA INTERFAZ COMPARATOR ES PARA ORDENAR EL TREESET POR ORDEN ALFABETICO	
	
	//ATRIBUTOS
	private int num;
	private String desc;
	
	//CONSTRUCTOR
	public Articulo(int num, String desc) {
		this.num=num;
		this.desc=desc;
	}
	
	//CONSTRUCTOR POR DEFECTO PARA LA INTERFAZ COMPARATOR
	public Articulo() {
		
	}
	
	//SOBREESCRIBIMOS PARA QUE PUEDA ORDENAR LOS ELEMENTOS POR SUS NUMEROS
	//DEVUELVE UN -1, 0 O 1 SI EL ELEMENTOS ES MENOR, IGUAL O MAYOR
	@Override
	public int compareTo(Articulo o) {
		
		return num - o.num; 
	}
	
	public String getDescripcion() {
		return desc;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
	}
	
}

















