/**
 * 
 */
package io.github.fyggh.inheritence.abstractclasses;

import com.sun.corba.se.spi.orbutil.fsm.State;

/**
 * @author 200503041
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal s = new Starfish();
		Starfish star = new Starfish();
		s.eat();
		star.eat();
	}

}
