/**
 * 
 */
package io.github.fyggh.zoo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.ArrayList;

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
		//Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		//this.setSize(dimension);
		
		// TODO Auto-generated constructor stub
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Aardvark aardvark = new Aardvark(60, 70);
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
		
		Dragon dragon = new Dragon(1800, 1000, 1);
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
		
		Hippo hippo = new Hippo(900, 500);
		hippo.draw(g2);
		
		Koala koala = new Koala(200, 140);
		koala.draw(g2);
		
		Lion lion = new Lion(150, 800);
		lion.draw(g2);
		
		g2.translate(900, 0);
		
		Monkeh monkeh = new Monkeh(700, 500);
		monkeh.draw(g2);
		
		g2.translate(-900, 0);
		
		Octopus octopus = new Octopus(100,800);
		octopus.draw(g2);
		
		Owl owl = new Owl(950,260);
		owl.draw(g2);
		
		Panda panda = new Panda(1200,500);
		panda.draw(g2);
	
		Panther panther = new Panther(1400,500,"Why");
		panther.draw(g2);
		
		//Parrot parrot = new Parrot(1200, 600, 1, 1);
		//parrot.draw(g2);
		
		//Peacock peacock = new Peacock(1500, 800, 1, 1);
		//peacock.draw(g2);
		
		//Penguin penguin = new Penguin(1400, 1000, "Pablee");
		//penguin.draw(g2);
		
		g2.translate(1500, 1000);
		Pig pig = new Pig(1300, 1000, 1, 1);
		pig.draw(g2);
		g2.translate(-1500, -1000);
		
		Platypus platypus = new Platypus(1400, 300, 1, 1);
		platypus.draw(g2);
		
		Rabbit rabbit = new Rabbit(1400, 200);
		rabbit.draw(g2);
		
		Rhino rhino = new Rhino(600, 800);
		rhino.draw(g2);
		
		g2.translate(0, 1100);
		Shark shark = new Shark(300, 1000);
		shark.draw(g2);
		g2.translate(0, -1100);
		
		Snake snake = new Snake(1200, 400, 1, 1);
		snake.draw(g2);
		
		TRex tRex = new TRex(1600, 30);
		tRex.draw(g2);
		
		Turtle turtle = new Turtle(500, 1300);
		turtle.draw(g2);
		
		g2.translate(1600, 400);
		Whale whale = new Whale(1600, 400);
		whale.draw(g2);
		g2.translate(-1600, -400);
		
		//Zebra zebra = new Zebra(2000,0);
		//zebra.draw(g2);
		
		//Aardvark a2 = new Aardvark(100, 600);
		//a2.draw(g2);
		
		//MovingPanda panda = new MovingPanda();
	}
	
}
