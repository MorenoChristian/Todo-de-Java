package exeptions_1;

import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.imageio.*;

import java.io.*;

public class Read_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IOException in line 52
		
		Image_frame my_frame = new Image_frame();
		
		my_frame.setVisible(true);
		
		my_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class Image_frame extends JFrame{
	
	public Image_frame() {
		
		setTitle("Frame with Image");
		
		setBounds(750,300,300,200);
		
		Lamine_with_image my_lamine = new Lamine_with_image();
		
		add(my_lamine);
	}
}

class Lamine_with_image extends JPanel{
	
	public Lamine_with_image() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		File my_image = new File("src/Images/car.jpg");
		
		try {
			image = ImageIO.read(my_image);
		}
		catch(IOException e) {
			System.out.println("Image not found");
		}
		
		g.drawImage(image, 5, 5, null);
	}
	
	private Image image;
}
