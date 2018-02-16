package io.github.fyggh.dijkstra;

public class WeightedEdge extends Edge {

	private final static int DEFAULT_WEIGHT = 0;
	
	private int weight;
	
	public WeightedEdge(Node a, Node b) {
		this(a, b, DEFAULT_WEIGHT);
	}
	
	public WeightedEdge(Node a, Node b, int weight) {
		super(a, b);
		this.weight = weight;
	}

}
