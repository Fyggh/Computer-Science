package io.github.fyggh.zoo;

import java.awt.BorderLayout;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AardvarkViewer {

	JFrame frame = new JFrame();
	
	AardvarkComponent aardvark = new AardvarkComponent(20, 30);
	
	public void initializeFrame() {
		
		frame.setTitle("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		
		frame.add(aardvark);
		
		//frame.setBackground(Color.WHITE);
		
		//frame.setJMenuBar(createMenuBar());
		
		//frame.add(anotherBox);
		//frame.add(flag);
		
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
