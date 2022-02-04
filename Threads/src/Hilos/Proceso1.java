package Hilos;


//CREAMOS EL PRIMER THREAD HEREDANDO DE THREAD
public class Proceso1 extends Thread{
	
	//SOBREESCRIBIMOS EL METODO RUN QUE HEREDAMOS DE THREAD
	public void run() {
		
		for(int i = 0; i<=5; i++) {
			System.out.println("Proceso 1");
		}
		
	}
	
}
