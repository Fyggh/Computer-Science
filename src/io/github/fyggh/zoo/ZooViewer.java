package io.github.fyggh.zoo;

import javax.swing.JFrame;

public class ZooViewer {

	JFrame frame;
	ZooComponent zoo;
	
	public ZooViewer() {
		
		frame = new JFrame("Zoo");
		zoo = new ZooComponent();
		
	}
	
	public void initializeFrame() {
		
		frame.setTitle("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		
		frame.add(zoo);
		
		//frame.setBackground(Color.WHITE);
		
		//frame.setJMenuBar(createMenuBar());
		
		//frame.add(anotherBox);
		//frame.add(flag);
		
		frame.setVisible(true);

		
	}

}
