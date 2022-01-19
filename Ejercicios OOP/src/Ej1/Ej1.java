package Ej1;

public class Ej1 {

	public static void main(String[] args) {
		/*
		 * Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
		   El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
		   Crea sus métodos get, set y toString.
		   Tendrá dos métodos especiales:
				ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
				retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
		 */
		
		Cuenta cuenta1 = new Cuenta("Moreno", 15000);
		
		System.out.println(cuenta1.getCantidad());
		cuenta1.ingresar(5000);
		cuenta1.ingresar(-10000);
		cuenta1.retirar(5000);
		cuenta1.retirar(1500000);
		
		System.out.println(cuenta1.toString());
		
	}

}

class Cuenta{
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	// Devuelve el estado del objeto
	
	public String toString() {
		return "El titular es: "+titular+", y la cantidad es "+cantidad;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
		else {
			System.out.println("No se pueden ingresar valores negativos");
		}
	}
	
	public void retirar(double cantidad) {
		double total = this.cantidad - cantidad;
		
		if (total > 0) {
			this.cantidad = total;
		}
		else {
			this.cantidad = 0;
		}
	}
}
