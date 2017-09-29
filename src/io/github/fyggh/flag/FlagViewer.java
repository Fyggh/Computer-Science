package io.github.fyggh.flag;

import java.awt.BorderLayout;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlagViewer {

	JFrame frame = new JFrame();
	JPanel panel = new MouseDemo(new BorderLayout());
	
	JComponent textBox = new JTextField();
	JTextField anotherBox = new JTextField();
	
	FlagComponent flag = new FlagComponent(20, 30);
	
	/*
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("File");
	JPopupMenu fileList = new JPopupMenu("Help!");
	JMenuItem open = new JMenuItem("OPen");
	*/
	
	public void initializeFrame() {
		
		frame.setTitle("Hello World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		
		panel.setOpaque(true);
		
		frame.setContentPane(panel);
		
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
