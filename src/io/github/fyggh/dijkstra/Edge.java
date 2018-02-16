/**
 * 
 */
package io.github.fyggh.dijkstra;

/**
 * @author 200503041
 *
 */
public abstract class Edge {
	
	Node originNode;
	Node terminalNode;
	
	public Edge(Node originNode, Node terminalNode) {
		this.originNode = originNode;
		this.terminalNode = terminalNode;
	}

	/**
	 * @return the originNode
	 */
	public Node getOriginNode() {
		return originNode;
	}

	/**
	 * @return the terminalNode
	 */
	public Node getTerminalNode() {
		return terminalNode;
	}
	
//	public Node getOtherNode(Node node) {
//		return node.equals(originNode) ? terminalNode : originNode;
//	}
	
}
