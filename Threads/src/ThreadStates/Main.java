package ThreadStates;

public class Main {
	public static void main(String[] args) {
		
		//INSANCIAMOS LA CLASE QUE HEREDA DE THREAD
		HiloProceso hilo1 = new HiloProceso(); // NEW STATE
		HiloProceso hilo2 = new HiloProceso(); // NEW STATE
		
		//EJECUTAMOS LOS HILOS
		hilo1.start(); // RUNNABLE STATE
		System.out.println("HILO 1: "+hilo1.getState());
		
		try {
			hilo1.sleep(1000); //BLOCKED STATE
		}catch(InterruptedException e) {
			System.out.println("Error en el hilo 1 "+e);
		}
		
		hilo2.start(); // RUNNABLE STATE
		System.out.println("HILO 2: "+hilo2.getState());
		
		hilo2.stop(); //TERMINATED STATE
		System.out.println("HILO 2: "+hilo2.getState());
		
		try {
			hilo2.sleep(1000); //BLOCKED STATE
		} catch (InterruptedException e) {
			System.out.println("Error en el hilo 2 "+e);
		}
		
		System.out.println("HILO 1: "+hilo1.getState());
		System.out.println("HILO 2: "+hilo2.getState());
	}
}
