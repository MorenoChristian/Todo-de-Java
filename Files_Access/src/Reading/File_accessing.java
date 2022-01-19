package Reading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_accessing {

	public static void main(String[] args) {
		
		read_file accessing = new read_file();
		
		accessing.reading();

	}

}

class read_file {
	
	public void reading() {
		
		try {
			FileReader entry = new FileReader("C:/Users/Christian/Desktop/Platzi/Java/Proyectos/Files_Access/src/Files/Example.txt");
			
			/*
			int c = 0;
			
			while(c != -1) { //while we won´t reached the final of the file
				
				c = entry.read(); //return the int value of the first character on the file
				
				char letter = (char)c;
				
				System.out.print(letter+" ");
			}*/
			
				/////////////// BUFFERS /////////////////
			BufferedReader mybuffer = new BufferedReader(entry);
			
			String line = "";
			
			while(line != null) {
				
				line = mybuffer.readLine();
				
				if(line != null) {
					System.out.println(line+"\n");
				}
			}
			
			entry.close();
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("404 File Not Found");
		}
		catch (IOException e) {
			System.out.println(e.getStackTrace());
		}		
	}
}























