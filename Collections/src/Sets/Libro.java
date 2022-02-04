package Sets;

public class Libro {
	
	//ATRIBUTOS
	private String titulo;
	private String autor;
	private int ISBN;
	
	public Libro(String titulo, String autor, int ISBN) {
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	public String toString() {
		return "El titulo es: "+titulo+", El autor es: "+autor+", El ISBN es: "+ISBN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	
	
	/*
	//SOBREESCRIBIMOS EL METODO equals
	public boolean equals(Object obj) {
		
		if(obj instanceof Libro) { //SI obj ES UNA INSTANCIA DE Libro
			
			Libro libro = (Libro)obj; //REALIZAMOS UN CASTING, CONVERTIMOS obj EN UN OBJETO DE TIPO LIBRO
			
			if(this.ISBN == libro.ISBN) { //SI EL ISBN DE ESTE LIBRO ES IGUAL AL QUE SE ESTÁ COMPARANDO
				
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	*/
}
