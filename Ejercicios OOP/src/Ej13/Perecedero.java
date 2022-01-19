package Ej13;

public class Perecedero extends Productos{
	//ATRIBUTO
	private int dias_caducar;
	
	//CONSTRUCTOR
	public Perecedero(String nombre, double precio, int dias_caducar) {
		super(nombre,precio);
		this.dias_caducar = dias_caducar;
	}
	
	//METODOS GETS
	public int getDias() {
		return dias_caducar;
	}
	//METODOS SET
	public void setDias(int dias_caducar) {
		this.dias_caducar = dias_caducar;
	}
	
	//METODO toString
	public String toString() {
		return super.toString()+"\nDias para caducar: "+dias_caducar;
	}
	
	public double calcular(int cantidad) {
		double total = super.getPrecio();
		if(dias_caducar == 1) {
			return (total /= 4)*cantidad;
		}
		else if(dias_caducar == 2) {
			return (total /= 3)*cantidad;
		}
		else {
			return (total /= 2)*cantidad;
		}
	}
}
