package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsoCliente {

	public static void main(String[] args) {
		
		//INSTANCIAMOS LOS CLIENTES
		Cliente cl1 = new Cliente("Christian", "0001", 20000);
		Cliente cl2 = new Cliente("Martin", "0002", 30000);
		Cliente cl3 = new Cliente("Gonzalo", "0003", 40000);
		Cliente cl4 = new Cliente("Marcelo", "0004", 50000);
		
		
		//CREAMOS UN HASHSET, NO SE PUEDE INSTANCIAR SET AL SER UNA INTERFAZ, PERO SI HASHSET AL SER UNA CLASE
		Set<Cliente> cuentaClientes = new HashSet<>();
		
		//AGREGAMOS LOS OBJETOS AL HASHSET
		cuentaClientes.add(cl1);
		cuentaClientes.add(cl2);
		cuentaClientes.add(cl3);
		cuentaClientes.add(cl4);
		cuentaClientes.add(cl1); //VEREMOS QUE NO AGREGA ESTE ELEMENTO, YA QUE SE ENCUENTRA ANTERIORMENTE ADHERIDO
		
		/*
		//RECORREMOS LOS ELEMENTOS DEL HASHSET CON UN FOR EACH
		for(Cliente cl: cuentaClientes) {
			System.out.println(cl.toString());
		}
		*/
		
		
		//REMOVER UN OBJETO DEL HASHSET
		//CREAMOS UN ITERADOR
		Iterator<Cliente> it = cuentaClientes.iterator();
		
		while(it.hasNext()) {
			String nombre = it.next().getNombre();
			
			if(nombre.equals("Christian")) {
				it.remove();
			}else {
				System.out.println(nombre);
			}
		}

	}

}






































