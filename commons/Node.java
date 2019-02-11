package m2j.commons;

public class Node {

	private int info;
	private Node nextNode;

	public Node(int info) {
		this.info = info;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
