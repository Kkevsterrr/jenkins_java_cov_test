package BstToList;

public class BinaryLinkNode {

	private int value;
	private BinaryLinkNode left;
	private BinaryLinkNode right;
	
	public BinaryLinkNode(){}
	
	public BinaryLinkNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void append(int value) {
		BinaryLinkNode oldTail = getTail();
		BinaryLinkNode newTail = new BinaryLinkNode(value);
		oldTail.right = newTail;
		newTail.left = oldTail;
	}
	
	public String toString() {
		String result = "[";
		BinaryLinkNode currentNode = this;
		while(!currentNode.isTail()) {
			result += currentNode.nodeString() + ",";
			currentNode = currentNode.right;
		}
		result += currentNode.nodeString() + "]";
		return result;
	}
	
	private String nodeString() {
		return String.valueOf(value);
	}
	
	private BinaryLinkNode getTail() {
		BinaryLinkNode tail = this;
		while(!tail.isTail()) {
			tail = tail.right;
		}
		return tail;
	}
	
	private boolean isTail() {
		return right == null;
	}
}
