package Hilos;


//CREAMOS EL SEGUNDO THREAD PERO IMPLEMENTANDO RUNNEABLE
public class Proceso2 implements Runnable{
	
	//NECESITAMOS SOBRESCRIBIR EL METODO RUN YA QUE ES UN METODO ABSTRACTO POR IMPLEMENTAR RUNNABLE
	public void run() {
		
		for(int i = 0; i<=5; i++) {
			System.out.println("Proceso 2");
		}
		
	}

}
