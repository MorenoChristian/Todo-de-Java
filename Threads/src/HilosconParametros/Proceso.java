package HilosconParametros;

public class Proceso extends Thread{
	
	int limite;
	
	public Proceso(String NombreHilo) {
		super(NombreHilo);
	}
	
	public void run() {
		for(int i = 0; i<=limite; i++) {
			System.out.println(i + " "+ this.getName());
		}
		System.out.println("");
	}
	
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
}
