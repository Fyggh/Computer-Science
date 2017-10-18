package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Rhino {
	int xPos, yPos, w, h;
	
	public Rhino(){
		xPos = 0;
		yPos = 0;

		
	}
	
	public Rhino(int x, int y){
		xPos= x;
		yPos= y;
		
	}		
	
	public void draw(Graphics2D g2){
		
		g2.setColor(Color.gray);
		Ellipse2D.Double body = new Ellipse2D.Double(xPos + 100, yPos + 100, 480, 280);
		g2.fill(body);
		
		g2.setColor(Color.gray);
		Rectangle backleg = new Rectangle(xPos + 125,yPos + 225, 100, 200);
		g2.fill(backleg);
		
		g2.setColor(Color.gray);
		Rectangle frontleg = new Rectangle(xPos + 450,yPos + 225, 100, 200);
		g2.fill(frontleg);
		
		g2.setColor(Color.gray);
		Rectangle head = new Rectangle(xPos + 550,yPos + 140,200, 120);
		g2.fill(head);
		
		//Rectangle smallhorn = new Rectangle(xPos + 670, yPos + 100, 25, 50);
		//g2.fill(smallhorn);
		
		//Rectangle largehorn = new Rectangle(xPos + 700, yPos + 80, 35, 100);
		//g2.fill(largehorn);
		
		//SmallHorn
		g2.setColor(Color.gray);
		g2.fillPolygon(new int [] {xPos + 670, xPos + 695,xPos + 682} , new int[] {yPos + 140, yPos + 140, yPos + 120}, 3 );
		
		//LargeHorn
		g2.setColor(Color.gray);
		g2.fillPolygon(new int [] {xPos + 700, xPos + 745,xPos + 722} , new int[] {yPos + 140, yPos + 140, yPos + 70}, 3 );
		
		g2.setColor(Color.BLACK);
		Rectangle eye = new Rectangle(xPos + 570, yPos + 150, 20, 10);
		g2.fill(eye);
		
		Rectangle nose = new Rectangle(xPos + 740, yPos + 145, 7, 7);
		g2.fill(nose);
		
		g2.setColor(Color.black);
		Ellipse2D.Double outermouth = new Ellipse2D.Double(xPos + 665, yPos + 205, 80, 50);
		g2.fill(outermouth);
		
		g2.setColor(Color.pink);
		Ellipse2D.Double innermouth = new Ellipse2D.Double(xPos + 675, yPos + 215, 70, 40);
		g2.fill(innermouth);
		
		g2.setColor(Color.white);
		Rectangle righttooth = new Rectangle(xPos + 716, yPos + 216, 7, 10);
		g2.fill(righttooth);
		
		g2.setColor(Color.white);
		Rectangle lefttooth = new Rectangle(xPos + 699, yPos + 216, 7, 10);
		g2.fill(lefttooth);
		
		g2.setColor(Color.gray);
		Rectangle tail = new Rectangle(xPos + 101, yPos + 250, 20, 90);
		g2.fill(tail);
		
		g2.setColor(Color.black);
		Rectangle tailtip = new Rectangle(xPos + 101, yPos + 320, 20, 20);
		g2.fill(tailtip);
	}
}