package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Turtle {
	
	int xCoord, yCoord, w, h;
	
	
	public Turtle() {
		
	}
	
	public Turtle(int x, int y) {
		
		xCoord = x;
		yCoord = y;

	}
	
	public void draw(Graphics2D g2) {
		
		Ellipse2D.Double circle = new Ellipse2D.Double(xCoord + 76, yCoord + 77, 30, 39);
		g2.setColor(new Color(10, 180, 90));
		g2.fill(circle);
		g2.draw(circle);
		
		Ellipse2D.Double circle1 = new Ellipse2D.Double(xCoord + 78, yCoord + 78, 26, 36);
		g2.setColor(new Color(190, 70, 10));
		g2.fill(circle1);
		g2.draw(circle1);
		
		Ellipse2D.Double circle2 = new Ellipse2D.Double(xCoord + 81 , yCoord + 63 , 20, 16);
		g2.setColor(new Color(34, 180, 34));
		g2.fill(circle2);
		g2.draw(circle2);
		
		Ellipse2D.Double circle3 = new Ellipse2D.Double(xCoord + 86, yCoord + 64, 3, 3);
		g2.setColor(Color.black);
		g2.fill(circle3);
		g2.draw(circle3);
		
		Ellipse2D.Double circle4 = new Ellipse2D.Double(xCoord + 92, yCoord + 64, 3, 3);
		g2.setColor(Color.black);
		g2.fill(circle4);
		g2.draw(circle4);
		
		int[] xpts = {89,92,95};
		int[] ypts = {116,128,116};
		
		Polygon tail = new Polygon(xpts, ypts, xpts.length);
		g2.setColor(new Color(10, 180, 90));
		g2.fill(tail);
		
		Ellipse2D.Double rightarm = new Ellipse2D.Double(xCoord + 102, yCoord + 84, 10,4);
		g2.setColor(new Color(10, 180, 90));
		g2.fill(rightarm);
		g2.draw(rightarm);
		
		Ellipse2D.Double leftarm = new Ellipse2D.Double(xCoord + 69, yCoord + 84, 10, 4);
		g2.setColor(new Color(10, 180, 90));
		g2.fill(leftarm);
		g2.draw(leftarm);
		
		Ellipse2D.Double rightarm2 = new Ellipse2D.Double(xCoord + 103, yCoord + 100, 10, 4);
		g2.setColor(new Color(10, 180, 90));
		g2.fill(rightarm2);
		g2.draw(rightarm2);
		
		Ellipse2D.Double leftarm2 = new Ellipse2D.Double(xCoord + 69, yCoord + 100, 10, 4);
		g2.setColor(new Color(10, 180, 90));
		g2.fill(leftarm2);
		g2.draw(leftarm2);
		
		int[] xpts2 = {90,91,91,93,93,94};
		int[] ypts2 = {83,81,85,81,85,83};
		
		Polygon spot = new Polygon(xpts2, ypts2, xpts2.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot);
		
		int[] xpts3 = {94,95,95,97,97,98};
		int[] ypts3 = {87,85,89,85,89,87};
		
		Polygon spot2 = new Polygon(xpts3, ypts3, xpts3.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot2);
		
		int[] xpts4 = {86,87,87,89,89,90};
		int[] ypts4 = {87,85,89,85,89,87};
		
		Polygon spot3 = new Polygon(xpts4, ypts4, xpts4.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot3);
		
		int[] xpts5 = {90,91,91,93,93,94};
		int[] ypts5 = {87,85,89,85,89,87};
		
		Polygon spot5 = new Polygon(xpts5, ypts5, xpts5.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot5);
		
		int[] xpts6 = {90,91,91,93,93,94};
		int[] ypts6 = {91,89,93,89,93,91};
		
		Polygon spot6 = new Polygon(xpts6, ypts6, xpts6.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot6);
		
		int[] xpts7 = {90,91,91,93,93,94};
		int[] ypts7 = {95,93,97,93,97,95};
		
		Polygon spot7 = new Polygon(xpts7, ypts7, xpts7.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot7);
		
		int[] xpts8 = {90,91,91,93,93,94};
		int[] ypts8 = {99,97,101,97,101,99};
		
		Polygon spot8 = new Polygon(xpts8, ypts8, xpts8.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot8);
		
		int[] xpts9 = {90,91,91,93,93,94};
		int[] ypts9 = {103,101,105,101,105,103};
		
		Polygon spot9 = new Polygon(xpts9, ypts9, xpts9.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot9);
		
		int[] xpts10 = {90,91,91,93,93,94};
		int[] ypts10 = {107,105,109,105,109,107};
		
		Polygon spot10 = new Polygon(xpts10, ypts10, xpts10.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot10);
		
		int[] xpts11 = {86,87,87,89,89,90};
		int[] ypts11 = {91,89,93,89,93,91};
		
		Polygon spot11 = new Polygon(xpts11, ypts11, xpts11.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot11);
		
		int[] xpts12 = {86,87,87,89,89,90};
		int[] ypts12 = {95,93,97,93,97,94};
		
		Polygon spot12 = new Polygon(xpts12, ypts12, xpts12.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot12);
		
		int[] xpts13 = {86,87,87,89,89,90};
		int[] ypts13 = {99,97,101,97,101,99};
		
		Polygon spot13 = new Polygon(xpts13, ypts13, xpts13.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot13);
		
		int[] xpts14 = {86,87,87,89,89,90};
		int[] ypts14 = {103,101,105,101,105,103};
		
		Polygon spot14 = new Polygon(xpts14, ypts14, xpts14.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot14);
		
		int[] xpts15 = {94,95,95,97,97,98};
		int[] ypts15 = {91,89,93,89,93,91};
		
		Polygon spot15 = new Polygon(xpts15, ypts15, xpts15.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot15);
		
		int[] xpts16 = {94,95,95,97,97,98};
		int[] ypts16 = {95,93,97,93,97,95};
		
		Polygon spot16 = new Polygon(xpts16, ypts16, xpts16.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot16);
		
		int[] xpts17 = {94,95,95,97,97,98};
		int[] ypts17 = {99,97,101,97,101,99};
		
		Polygon spot17 = new Polygon(xpts17, ypts17, xpts17.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot17);
		
		int[] xpts18 = {94,95,95,97,97,98};
		int[] ypts18 = {103,101,105,101,105,103};
		
		Polygon spot18 = new Polygon(xpts18, ypts18, xpts18.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot18);
		
		int[] xpts19 = {98,99,99,101,101,102};
		int[] ypts19 = {91,89,93,89,93,91};
		
		Polygon spot19 = new Polygon(xpts19, ypts19, xpts19.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot19);
		
		int[] xpts20 = {98,99,99,101,101,102};
		int[] ypts20 = {95,93,97,93,97,95};
		
		Polygon spot20 = new Polygon(xpts20, ypts20, xpts20.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot20);
		
		int[] xpts21 = {98,99,99,101,101,102};
		int[] ypts21 = {99,97,101,97,101,99};
		
		Polygon spot21 = new Polygon(xpts21, ypts21, xpts21.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot21);
		
		int[] xpts22 = {82,83,83,85,85,86};
		int[] ypts22 = {91,89,93,89,93,91};
		
		Polygon spot22 = new Polygon(xpts22, ypts22, xpts22.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot22);
		
		int[] xpts23 = {82,83,83,85,85,86};
		int[] ypts23 = {95,93,97,93,97,95};
		
		Polygon spot23 = new Polygon(xpts23, ypts23, xpts23.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot23);
		
		int[] xpts24 = {82,83,83,85,85,86};
		int[] ypts24 = {99,97,101,97,101,99};
		
		Polygon spot24 = new Polygon(xpts24, ypts24, xpts24.length);
		g2.setColor(new Color(120, 70, 55));
		g2.fill(spot24);
	 }
	
		
}	

