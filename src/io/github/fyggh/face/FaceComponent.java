package io.github.fyggh.face;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class FaceComponent extends JComponent {

	private Ellipse2D head;
	private Arc2D eyeTop;
	
	private Color color;
	
	public FaceComponent(double x, double y, double width, double height) {
		
		head = new Ellipse2D.Double(x, y, width, height);
		
		
		//color = Color.BLUE;
		//System.out.println("We out here");
		
		//eyeTop = new Arc2D.Double()
		
	}
	
	
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setPaint(color);
		
		
		g2.draw(head);
		
		
		
	}
	
}
