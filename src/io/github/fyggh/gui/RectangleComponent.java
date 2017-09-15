package io.github.fyggh.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent {

	public RectangleComponent() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawRect(20, 60, 40, 100);
	}
	
}
