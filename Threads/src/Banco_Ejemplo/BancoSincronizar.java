package Banco_Ejemplo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco b = new Banco();
		
		for(int i = 0; i<100; i++) {
			EjecucionTransferencias ejecucion = new EjecucionTransferencias(b, i, 2000);
			
			ejecucion.start();
			
		
		}
	}

}


// CREAMOS LA CLASE DEL BANCO
class Banco{
	
	//ATRIBUTOS
	private final double[] cuentas;
	
	//INSTANCIAMOS REENTRANLOCK PARA SINCRONIZAR LOS HILOS
	private Lock cierreBanco = new ReentrantLock();
	
	//VARIABLE PARA LA CONDICION DEL BLOQUEO
	private Condition saldoSuficiente;
	
	public Banco() {
		
		// INICIALIZAMOS EL ARRAY CUENTAS
		cuentas = new double[100]; //CADA POSICION DEL ARRAY ES UNA CUENTA DE BANCO
		
		//CARGAMOS LAS CUENTAS CON $2000
		for(int i = 0; i<cuentas.length; i++) {
			
			cuentas[i] = 2000;
			
		}
		
		//LE ESTAMOS DICIENDO QUE EL BLOQUEO "cierreBanco" TIENE QUE ESTABLECERSE
		//BAJO UNA CONDICION, LA CUAL ES "saldoSuficiente"
		saldoSuficiente = cierreBanco.newCondition();
	}
	
	//METODO PARA REALIZAR LAS TRANSFERENCIAS
	public void transferencia(int cuenta_origen, int cuenta_destino, double cantidad) throws InterruptedException {
		
		cierreBanco.lock(); //BLOQUEAMOS EL METODO PARA QUE SOLO INGRESE UN HILO A LA VEZ Y NO HAYA PERDIDA DE DINERO
		
		try {
		
			//CORROBORAMOS SI LA CUENTA DE ORIGEN NO SUPERE LA CANTIDAD DE
			//SALDO QUE POSEE PARA REALIZAR LA TRANSFERENCIA
			while(cuentas[cuenta_origen] < cantidad) {
				
				//System.out.println("-----------CANTIDAD INSUFICIENTE: "+ cuenta_origen + "....SALDO: "+cuentas[cuenta_origen]+ "...."+ cantidad);
				//SI EL IF ES TRUE, PONEMOS UN RETURN PARA QUE RETORNE EL FLUJO
				//DE EJECUCION Y ASI HACER QUE ESTE MÉTODO NO HAGA NADA Y TERMINE
				//return;
				
				saldoSuficiente.await(); //MIENTRAS EL WHILE SEA TRUE, EL HILO PERMANECE A LA ESPERA
			}
			
			System.out.println(Thread.currentThread());
			
			
			cuentas[cuenta_origen] -= cantidad; //DINERO QUE SALE DE LA CUENTA ORIGEN
			 
			System.out.printf("%10.2f de %d para %d", cantidad, cuenta_origen, cuenta_destino);
			
			cuentas[cuenta_destino] += cantidad; //DINERO QUE INGRESA A LA CUENTA DESTINO
				
			System.out.printf(" Saldo Total: %10.2f\n", getSaldoTotal()); //IMPRIMIMOS EL METODO getSaldoTotal
			
			saldoSuficiente.signalAll(); //DESPERTAMOS A LOS HILOS DORMIDOS PARA QUE VUELVAN A ANALIZAR LA CONDICION WHILE, SI ES FALSE, ENTONCES REALIZAN LA TRANSFERENCIA
		
		}finally {
			cierreBanco.unlock(); //AL TERMINAR, DESBLQUEAMOS EL METODO PARA QUE OTRO HILO PUEDA INGRESAR
		}
	}
	
	public double getSaldoTotal() {
		
		double suma_cuentas = 0;
		
		for(double a: cuentas) {
			
			suma_cuentas += a;
			
		}
		
		return suma_cuentas;
		
	}
	
	
}

class EjecucionTransferencias extends Thread{
	
	//ATRIBUTOS
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMax;
	
	public EjecucionTransferencias(Banco b, int de, double max) {
		 
		banco = b;
		deLaCuenta = de;
		cantidadMax = max;
		
	}
	
	@Override
	public void run() {
		
		try {
			//CREAMOS UN BUCLE INFINITO
			while(true) {
				
				int paraLaCuenta = (int)(100*Math.random()); //NOS DA UNA CUENTA ALEATORIA ENTRE 1 Y 100
				
				double cantidad = cantidadMax*Math.random();
				
				banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
				
				
				EjecucionTransferencias.sleep(50);
			}
			
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
		
	}
	
}
















