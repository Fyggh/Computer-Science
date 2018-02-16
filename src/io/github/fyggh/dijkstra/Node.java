/**
 * 
 */
package io.github.fyggh.dijkstra;

import java.util.List;

/**
 * @author 200503041
 *
 */
public class Node {

	private List<WeightedEdge> connections;
	private int distance;
	private boolean reached = false;
	
	/**
	 * 
	 */
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	// TODO what would be a more useful return type?
	public Node addBalancedWeightedConnection(Node node, int weight) {
		connections.add(new WeightedEdge(this, node, weight));
		node.addBalancedWeightedConnection(this, weight);
		return node;
	}
	
	/**
	 * @return the connections
	 */
	public List<WeightedEdge> getConnections() {
		return connections;
	}

	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}

	public int setDistance(int distance) {
		this.distance = distance;
		return this.distance;
	}

	public boolean isReached() {
		return reached;
	}

	public void setReached(boolean reached) {
		this.reached = reached;
	}

}
