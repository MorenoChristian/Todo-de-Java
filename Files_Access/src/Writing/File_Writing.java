package Writing;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		write_file write_sentence = new write_file();
		
		write_sentence.write();
	}

}

class write_file{
	
	public void write() {
		
		String sentence = "This is a write test";
		
		try {
			FileWriter entry = new FileWriter("C:/Users/Christian/Desktop/new_text.txt");
			
			for(int i = 0; i<sentence.length(); i++) {
				
				entry.write(sentence.charAt(i));
				
			}
			
			entry.close();
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




































