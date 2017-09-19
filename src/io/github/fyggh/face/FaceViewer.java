package io.github.fyggh.face;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class FaceViewer {

	JFrame frame = new JFrame();
	
	JComponent textBox = new JTextField();
	JTextField anotherBox = new JTextField();
	
	FaceComponent face = new FaceComponent(10, 10, 100, 160);
	
	/*
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("File");
	JPopupMenu fileList = new JPopupMenu("Help!");
	JMenuItem open = new JMenuItem("OPen");
	*/
	
	public void initializeFrame() {
		
		frame.setTitle("Hello World");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBackground(Color.WHITE);
		
		frame.setJMenuBar(createMenuBar());
		
		//frame.add(anotherBox);
		frame.add(face);
		
		frame.setVisible(true);

		
	}
	
	private JMenuBar createMenuBar() {
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("A Menu");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("A text-only menu item");
		menu.add(menuItem);
		
		return menuBar;
		
	}
	
}
