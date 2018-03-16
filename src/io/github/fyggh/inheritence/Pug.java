/**
 * 
 */
package io.github.fyggh.inheritence;

/**
 * @author 200503041
 *
 */
public class Pug extends Dog {

	/**
	 * @param name
	 */
	public Pug(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String speak() {
		return super.speak() + " The pug breathes heavily.";
	}

}
