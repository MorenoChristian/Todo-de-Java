package HilosconParametros;

public class Main {

	public static void main(String[] args) {
		
		Proceso hilo1 = new Proceso("Hilo 1");
		Proceso hilo2 = new Proceso("Hilo 2");
		
		hilo1.setLimite(3);
		hilo2.setLimite(5);
		
		hilo1.start();
		hilo2.start();

	}

}
