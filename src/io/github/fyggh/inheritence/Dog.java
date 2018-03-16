/**
 * 
 */
package io.github.fyggh.inheritence;

/**
 * @author 200503041
 *
 */
public class Dog {
	
	/**
	 * The name of the dog.
	 */
	private String name;
	
	
	/**
	 * Create a new {@link Dog} object with a given name.
	 * @param name
	 */
	public Dog(String name) {
		super();
		this.name = name;
	}
	
	public String speak() {
		return String.format("%s says woof.", name);
	}

}
