package Hilos;

public class Main {

	public static void main(String[] args) {
		//CREAMOS UNA INSTANCIA DEL PROCESO 1
		Proceso1 hilo1 = new Proceso1();
		
		//PARA EL PROCESO 2 NECESTIAMOS INSTANCIAR THREAD Y PASARLE COMO ARGUMENTO NUESTRO THREAD PROCESO2
		Thread hilo2 = new Thread(new Proceso2());
		
		/*
		//O SINO DE ESTA FORMA
		Runnable r = new Proceso2();
		Thread hilo3 = new Thread(r);
		*/
		
		//AHORA EJECUTAMOS LOS HILOS CON start()
		//SIEMPRE VAMOS A OBTENER RESULTADOS DISTINTOS YA QUE LOS DOS HILOS SE EJECUTAN DE FORMA SIMULTANEA
		hilo1.start();
		hilo2.start();
		
		

	}

}
