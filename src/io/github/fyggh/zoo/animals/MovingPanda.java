package io.github.fyggh.zoo.animals;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class MovingPanda extends JComponent { //All below in object RectangleComponent.//

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; //Needs name and parameters for graphics//
		
		Panda f = new Panda(0, 0);
		f.draw(g2);
	}
}
