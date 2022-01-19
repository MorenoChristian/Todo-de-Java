package Ej12;

public class Revolver {
	//ATRIBUTOS
	private int pos_actual;
	private int pos_bala;
	
	//CONSTRUCTOR
	public Revolver() {
		posActual();
		posBala();
	}
	
	//METODOS PARA DETERMINAR LAS POSICIONES
	private void posActual() {
		this.pos_actual = (int)(Math.random()*6)+1;
	}
	private void posBala() {
		this.pos_bala = (int)(Math.random()*6)+1;
	}
	
	//METOTO DISPARA
	public boolean dispara() {
		if(pos_actual == pos_bala) {
			return true;
		}else {
			return false;
		}
	}
	
	//METODO PARA CAMBIAR POSICION DEL TAMBOR
	public void siguienteBala() {
		if(pos_actual < 6) {
			pos_actual++;
		}else {
			pos_actual = 1;
		}
	}
	
	public String toString() {
		return "Posicion actual: "+pos_actual+"\nPosicion bala: "+pos_bala;
	}
}
