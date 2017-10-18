/**
 * 
 */
package io.github.fyggh.zoo;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import io.github.fyggh.zoo.animals.Aardvark;

/**
 * @author 200503041
 *
 */
public class AardvarkComponent extends JComponent {

	private int x, y;
	
	
	/**
	 * 
	 */
	public AardvarkComponent() {
		super();
		
	}
	
	/**
	 * 
	 */
	public AardvarkComponent(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO draw aardvark
		Graphics2D g2 = (Graphics2D) g;
		
		Aardvark aardvark = new Aardvark(x, y);
		aardvark.draw(g2);
		
	}

	
}
