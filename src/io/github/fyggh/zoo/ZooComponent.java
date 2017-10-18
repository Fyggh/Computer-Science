/**
 * 
 */
package io.github.fyggh.zoo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import io.github.fyggh.zoo.animals.*;

import javax.swing.JComponent;

/**
 * @author 200503041
 *
 */
public class ZooComponent extends JComponent {

	/**
	 * 
	 */
	public ZooComponent() {
		// TODO Auto-generated constructor stub
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Aardvark aardvark = new Aardvark(200, 20);
		aardvark.draw(g2);
		
		//Bear bear = new Bear(10, 30, 222, 1);
		//bear.draw(g2);
		
		Buffalo buffalo = new Buffalo(100, 200);
		buffalo.draw(g2);
		
		//Cheetah cheetah = new Cheetah(200, 0);
		//cheetah.draw(g2);
		
		//Chicken chicken = new Chicken(600, 1000);
		//chicken.draw(g2);
		
		Cow cow = new Cow(500, 0);
		cow.draw(g2);
		
		g2.translate(300, 200);
		
		Doggo doggo = new Doggo(10, 600, 1, 1);
		doggo.draw(g2);
		
		g2.translate(-300, -200);
		
		Dragon dragon = new Dragon(30, 40, 0.5);
		dragon.paint(g2);
		
		//Eagle eagle = new Eagle(200, 500, "EAGLE");
		//eagle.draw(g2);
		
		Elephant elephant = new Elephant(300, 400);
		elephant.draw(g2);
		
		Fish fish = new Fish(0, 0);
		fish.draw(g2);
		
		Flamingo flamingo = new Flamingo(400, 100);
		flamingo.draw(g2);
		
		GiraffeMain giraffe = new GiraffeMain(700, 10, 1, 1);
		giraffe.draw(g2);
		
		Gorilla gorilla = new Gorilla(800, 10);
		gorilla.draw(g2);
		
		Hippo hippo = new Hippo(600, 300);
		hippo.draw(g2);
		
		Koala koala = new Koala(200, 140);
		koala.draw(g2);
		
		Lion lion = new Lion(100, 600);
		lion.draw(g2);
		
		g2.translate(500, 0);
		
		Monkeh monkeh = new Monkeh(700, 500);
		monkeh.draw(g2);
		
		g2.translate(-500, 0);
		
	}
	
}
