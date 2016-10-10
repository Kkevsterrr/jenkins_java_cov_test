package BstToList;

public class BinaryTreeNode {
	private int value;
	private BinaryTreeNode leftChild;
	private BinaryTreeNode rightChild;
	
	public BinaryTreeNode(int value, BinaryTreeNode leftChild, BinaryTreeNode rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	public void toLink(BinaryLinkNode head) {
		if(leftChild != null) {
			leftChild.toLink(head);
		}
		head.append(value);
		if(rightChild != null) {
			rightChild.toLink(head);
		}
	}
}
