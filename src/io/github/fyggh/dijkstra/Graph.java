package io.github.fyggh.dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Graph {
	
	private List<Node> nodes;
	
	private List<Node> solution;

	public Graph(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	public int solve(Node startNode, Node endNode) {
		startNode.setDistance(0);
		solution.add(startNode);
		for (ListIterator<WeightedEdge> iter = startNode.getConnections().listIterator(); iter.hasNext(); ) {
			Node currentNode = iter.next().getTerminalNode(); // TODO bad bad bad
			if (currentNode.isReached()) {
				//if (currentNode.getDistance() > )
			}
		}
	}
	
	// for testing
	public static void main(String[] args) {
		Graph graph = new Graph(new ArrayList<Node>() {{
			add(new Node());
			add(new Node());
			add(new Node());
			this.get(0).addBalancedWeightedConnection(this.get(1), 5);
			this.get(0).addBalancedWeightedConnection(this.get(2), 10);
			this.get(1).addBalancedWeightedConnection(this.get(2), 4);
		}});
		
		
	}
	
	
	
}
