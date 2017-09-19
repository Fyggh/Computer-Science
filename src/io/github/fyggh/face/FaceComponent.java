package io.github.fyggh.face;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class FaceComponent extends JComponent {

	private Ellipse2D head;
	private Arc2D eyeTop;
	private Rectangle2D leftEye;
	private Rectangle2D rightEye;
	private Line2D mouth;
	
	private Color color;
	
	public FaceComponent(double x, double y, double width, double height) {
		
		head = new Ellipse2D.Double(x, y, width, height);
		leftEye = new Rectangle2D.Double(x + width/3 - 10, y + (height/2) - 5, 20, 10);
		rightEye = new Rectangle2D.Double(x + 2*width/3 - 10, y + (height/2) -5, 20, 10);
		mouth = new Line2D.Double(x + width/3, y + 2*height/3, x+2*width/3, y+2*height/3);
		
		//color = Color.BLUE;
		//System.out.println("We out here");
		
		//eyeTop = new Arc2D.Double()
		
	}
	
	
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setPaint(color);
		
		
		g2.draw(head);
		g2.draw(leftEye);
		g2.draw(rightEye);
		g2.draw(mouth);
		
		
		
	}
	
}
