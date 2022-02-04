package Sets;

public class Cliente {
	
	//ATRIBUTOS
	private String nombre;
	private String num_cuenta;
	private double saldo;
	
	//CONSTRUCTOR
	public Cliente(String nombre, String num_cuenta, double saldo) {
		this.nombre=nombre;
		this.num_cuenta=num_cuenta;
		this.saldo=saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Nombre: "+getNombre()+", Cuenta: "+getNum_cuenta()+", Saldo: "+getSaldo();
	}
	
}
