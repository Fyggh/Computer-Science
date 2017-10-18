package io.github.fyggh.zoo.animals;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class FrameViewer extends JFrame{

	public static void main(String[] args) {
		JFrame frame = new JFrame (); /*If it has a red wavy thing and yellow error= need to import, so fix it by importing javax.swing.JFrame;*/
		frame.setSize(200,200);
		frame.setTitle("Panda");
		MovingPanda thing = new MovingPanda();
		frame.add(thing);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}