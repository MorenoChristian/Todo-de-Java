package Read_write_byte;

import java.io.*;

public class reading_writing {

	public static void main(String[] args) {
		
		int cont = 0;
		
		int[] entry_data = new int[5485];
		
		try {
			
			FileInputStream file_reading = new FileInputStream("C:/Users/Christian/Desktop/Platzi/Java/Proyectos/Files_Access/src/Files/imagen.jpg");
			
			boolean final_ar = false;
			
			System.out.println(!final_ar);
			
			while(!final_ar) {
				
				int enter_byte = file_reading.read();
				
				if(enter_byte != -1) {
					entry_data[cont] = enter_byte;
				}
				else{
					final_ar = true;
				}
				
				//System.out.print(enter_byte+" ");
				
				System.out.println("\nContador entry data: "+entry_data[cont]);
				
				cont++;
			}
			
			file_reading.close();
			
		} 
		catch (IOException e) {
			
			System.out.println("File Not Found");
			
		}
		
		System.out.println("\nContador:"+cont);
		
		create_file(entry_data);

	}
	
	static void create_file(int data_new_file[]) {
		
		try {
			
			FileOutputStream new_file = new FileOutputStream("C:/Users/Christian/Desktop/Platzi/Java/Proyectos/Files_Access/src/Files/imagen_copia.jpg");
			
			for(int i = 0; i < data_new_file.length ; i++) {
				
				new_file.write(data_new_file[i]);
				
			}
			
			new_file.close();
			
		}
		catch(IOException e) {
			
			System.out.println("Can´t create a new file");
			
		}
	}
	
}





























