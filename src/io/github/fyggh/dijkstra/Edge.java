/**
 * 
 */
package io.github.fyggh.dijkstra;

/**
 * @author 200503041
 *
 */
public abstract class Edge {
	
	Node a;
	Node b;
	
	public Edge(Node a, Node b) {
		this.a = a;
		this.b = b;
	}
	
}
