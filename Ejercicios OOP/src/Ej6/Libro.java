package Ej6;

public class Libro {
	//ATRIBUTOS
	private boolean isbn;
	private String titulo;
	private String autor;
	private int paginas;
	
	//CONSTRUCTORES
	public Libro() {
		this.isbn = false;
		this.titulo = "";
		this.autor = "";
		this.paginas = 0;
	}
	
	public Libro(boolean isbn, String titulo, String autor, int paginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	//METODOS GETS
	public boolean getIsbn() {
		return isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getPaginas() {
		return paginas;
	}
	
	//METODOS SETS
	public void setIsbn(boolean isbn) {
		this.isbn = isbn;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	//METODO toString
	public String toString() {
		if(isbn == true) {
			return "El libro con ISBN creado por "+autor+" tiene "+paginas+" paginas";
		}else {
			return "El libro sin ISBN creado por "+autor+" tiene "+paginas+" paginas";
		}
	}
	
}
