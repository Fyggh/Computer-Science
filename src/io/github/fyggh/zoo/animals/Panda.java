package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;


public class Panda{
		int xCoord, yCoord;
		
			public Panda (int x, int y){
			xCoord= x;
			yCoord= y;
			}
			private Ellipse2D.Double head;
			private Ellipse2D.Double body;
			private Ellipse2D.Double rleg;
			private Ellipse2D.Double lleg;
			private Ellipse2D.Double arm;
			private Ellipse2D.Double rightear;
			private Ellipse2D.Double leftear;
			private Rectangle eye;
			private Ellipse2D.Double outereye;
			private Ellipse2D.Double tail;

			
			public void draw(Graphics2D g2) {

				rightear = new Ellipse2D.Double(xCoord+11, yCoord+4, 40, 40);
				leftear = new Ellipse2D.Double(xCoord+0, yCoord+0, 40, 40);
				body = new Ellipse2D.Double(xCoord+100/2, yCoord+100/2, 110, 100);
				head = new Ellipse2D.Double(xCoord+12,yCoord+15,85,75);
				eye = new Rectangle(xCoord+50, yCoord+36, 15, 15);
				outereye = new Ellipse2D.Double(xCoord+50,yCoord+26,20,20);
				rleg= new Ellipse2D.Double(xCoord+110, yCoord+20, 50, 80);
				tail= new Ellipse2D.Double(xCoord+145, yCoord+89, 20, 30);
				arm= new Ellipse2D.Double(xCoord+65, yCoord+40, 50, 60);

				g2.draw(body);
				g2.draw(eye);
				g2.draw(rightear);
				g2.draw(leftear);
				g2.draw(outereye);
				g2.draw(tail);
				
				g2.draw(rleg);
				g2.fill(rightear);
				g2.fill(tail);
				g2.setColor(Color.WHITE);
				g2.fill(body);
				g2.fill(head);
				g2.setColor(Color.BLACK);
			
				g2.draw(arm);
				g2.fill(rleg);
				
				g2.setColor(Color.BLACK);
				g2.fill(leftear);
				g2.fill(arm);
				
				
				g2.setColor(Color.BLACK);
			
			

				
				
				g2.draw(head);
				g2.setColor(Color.WHITE);
			
				
				//g2.setClip(outereye);
				g2.setColor(Color.BLACK);
				g2.fill(eye);
		
				

				/*belly.addPoint(30, 40);
				belly.addPoint(20,40);
				belly.addPoint(1000, 40);
				g2.draw(belly);
				g2.setColor(Color.WHITE);
				g2.fill(belly);
				 int [] x = {91,90,93,107,110,140,150};
				 int [] y = {10,0,5,7,5,7,5};
				 g2.drawPolygon(x, y, 6);*/
			}

}
