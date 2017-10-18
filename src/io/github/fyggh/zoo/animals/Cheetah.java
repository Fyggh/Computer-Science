package io.github.fyggh.zoo.animals;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Cheetah {
	int xCoord, yCoord;
	
	public Cheetah(int x, int y) {
		xCoord = x;
		yCoord = y;
		
	}

	public void draw(Graphics2D g2){
		
		Ellipse2D.Double body = new Ellipse2D.Double(150, 150, 240, 50);
		g2.setPaint(new Color(255, 185, 99));
		g2.fill(body);
		
		Ellipse2D.Double leg1 = new Ellipse2D.Double(170, 170, 10, 100);
		g2.fill(leg1);
		
		Ellipse2D.Double leg2 = new Ellipse2D.Double(190, 160, 10, 100);
		g2.fill(leg2);
		
		Ellipse2D.Double leg3 = new Ellipse2D.Double(350, 170, 10, 100);
		g2.fill(leg3);
		
		Ellipse2D.Double leg4 = new Ellipse2D.Double(330, 160, 10, 100);
		g2.fill(leg4);
		
		Ellipse2D.Double paw1 = new Ellipse2D.Double(170, 260, 20, 10);
		g2.fill(paw1);
		
		Ellipse2D.Double paw2 = new Ellipse2D.Double(190, 250, 20, 10);
		g2.fill(paw2);
		
		Ellipse2D.Double paw3 = new Ellipse2D.Double(350, 260, 20, 10);
		g2.fill(paw3);
		
		Ellipse2D.Double paw4 = new Ellipse2D.Double(330, 250, 20, 10);
		g2.fill(paw4);
		
		Ellipse2D.Double tail1 = new Ellipse2D.Double(125, 170, 50, 10);
		g2.fill(tail1);
		
		Ellipse2D.Double tail2 = new Ellipse2D.Double(125, 170, 10, 25);
		g2.fill(tail2);
		
		Ellipse2D.Double tail3 = new Ellipse2D.Double(110, 185, 25, 10);
		g2.fill(tail3);
		
		Ellipse2D.Double tail4 = new Ellipse2D.Double(105, 187, 10, 20);
		g2.fill(tail4);
		
		Ellipse2D.Double tail6 = new Ellipse2D.Double(95, 197, 20, 10);
		g2.fill(tail6);
		
		Ellipse2D.Double tail5 = new Ellipse2D.Double(93, 165, 10, 40);
		g2.fill(tail5);
		
		Ellipse2D.Double tail7 = new Ellipse2D.Double(83, 165, 20, 10);
		g2.fill(tail7);
		
		Ellipse2D.Double head1 = new Ellipse2D.Double(365, 133, 20, 50);
		g2.fill(head1);
		
		Ellipse2D.Double head2 = new Ellipse2D.Double(380, 133, 20, 50);
		g2.fill(head2);
		
		Ellipse2D.Double head4 = new Ellipse2D.Double(365, 140, 47, 20);
		g2.fill(head4);
		
		Ellipse2D.Double head3 = new Ellipse2D.Double(365, 145, 60, 40);
		g2.fill(head3);
		
		Ellipse2D.Double eye1 = new Ellipse2D.Double(400, 145, 7, 7);
		g2.setColor(Color.black);
		g2.fill(eye1);
		
		Ellipse2D.Double eye2 = new Ellipse2D.Double(385, 145, 7, 7);
		g2.setColor(Color.black);
		g2.fill(eye2);
		
		Ellipse2D.Double nose = new Ellipse2D.Double(413, 155, 8, 5);
		g2.setColor(Color.black);
		g2.fill(nose);
		
		Ellipse2D.Double nose1 = new Ellipse2D.Double(415, 158, 5, 5);
		g2.setColor(Color.black);
		g2.fill(nose1);

		
		Line2D.Double mouth1 = new Line2D.Double(418, 165, 419, 170);
		g2.draw(mouth1);
		
		Line2D.Double mouth2 = new Line2D.Double(417, 173, 419, 170);
		g2.draw(mouth2);
		
		Line2D.Double mouth3 = new Line2D.Double(423, 171, 419, 170);
		g2.draw(mouth3);
		
		Ellipse2D.Double a = new Ellipse2D.Double(180, 180, 6, 6);
		g2.fill(a);
		
		Ellipse2D.Double b = new Ellipse2D.Double(355, 170, 6, 6);
		g2.fill(b);
		
		Ellipse2D.Double c = new Ellipse2D.Double(340, 157, 6, 6);
		g2.fill(c);
		
		Ellipse2D.Double d = new Ellipse2D.Double(320, 160, 6, 6);
		g2.fill(d);
		
		
		Ellipse2D.Double e = new Ellipse2D.Double(305, 170, 6, 6);
		g2.fill(e);
		
		Ellipse2D.Double f = new Ellipse2D.Double(325, 175, 6, 6);
		g2.fill(f);
		
		Ellipse2D.Double g = new Ellipse2D.Double(319, 185, 6, 6);
		g2.fill(g);
		
		Ellipse2D.Double h = new Ellipse2D.Double(275, 185, 6, 6);
		g2.fill(h);
		
		Ellipse2D.Double i = new Ellipse2D.Double(245, 182, 6, 6);
		g2.fill(i);
		
		Ellipse2D.Double j = new Ellipse2D.Double(230, 160, 6, 6);
		g2.fill(j);
		
		Ellipse2D.Double k = new Ellipse2D.Double(222, 178, 6, 6);
		g2.fill(k);
		
		Ellipse2D.Double l = new Ellipse2D.Double(355, 180, 6, 6);
		g2.fill(l);
		
		Ellipse2D.Double m = new Ellipse2D.Double(270, 165, 6, 6);
		g2.fill(m);
		
		Ellipse2D.Double n = new Ellipse2D.Double(157, 166, 6, 6);
		g2.fill(n);
		
		Ellipse2D.Double o = new Ellipse2D.Double(333, 215, 4, 4);
		g2.fill(o);
		
		Ellipse2D.Double p = new Ellipse2D.Double(335, 205, 4, 4);
		g2.fill(p);
		
		Ellipse2D.Double q = new Ellipse2D.Double(332, 232, 4, 4);
		g2.fill(q);
		
		Ellipse2D.Double r = new Ellipse2D.Double(195, 200, 4, 4);
		g2.fill(r);
		
		Ellipse2D.Double s = new Ellipse2D.Double(192, 225, 4, 4);
		g2.fill(s);
		
		Ellipse2D.Double t = new Ellipse2D.Double(183, 170, 6, 6);
		g2.fill(t);
		
		Ellipse2D.Double u = new Ellipse2D.Double(200, 153, 6, 6);
		g2.fill(u);
		
		Ellipse2D.Double v = new Ellipse2D.Double(370, 175, 6, 6);
		g2.fill(v);
		
		Ellipse2D.Double w = new Ellipse2D.Double(290, 165, 6, 6);
		g2.fill(w);
		
		Ellipse2D.Double x = new Ellipse2D.Double(300, 155, 6, 6);
		g2.fill(x);
		
		Ellipse2D.Double y = new Ellipse2D.Double(127, 180, 4, 4);
		g2.fill(y);
		
		Ellipse2D.Double z = new Ellipse2D.Double(205, 170, 6, 6);
		g2.fill(z);
		
		Ellipse2D.Double ab = new Ellipse2D.Double(174, 200, 6, 6);
		g2.fill(ab);
		Ellipse2D.Double bc = new Ellipse2D.Double(171, 235, 6, 6);
		g2.fill(bc);
		Ellipse2D.Double cd = new Ellipse2D.Double(352, 200, 6, 6);
		g2.fill(cd);
		Ellipse2D.Double de = new Ellipse2D.Double(353, 240, 6, 6);
		g2.fill(de);
		
		Ellipse2D.Double ef = new Ellipse2D.Double(90, 170, 4, 4);
		g2.fill(ef);
		
		Ellipse2D.Double fg = new Ellipse2D.Double(100, 188, 4, 4);
		g2.fill(fg);
		
		Ellipse2D.Double gh = new Ellipse2D.Double(107, 196, 4, 4);
		g2.fill(gh);
	}
}

