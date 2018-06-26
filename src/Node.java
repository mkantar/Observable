
public class Node  implements TreeNode{
	private char elem;
	private Node left = null;
	private Node right = null;
	
	public Node(char elem, Node left, Node right) {
		this.elem = elem;
		this.left = left;
		this.right = right;
	}
	
	public char getElem() {
		return this.elem;
	}
	
	public Node getLeftNode() {
		return this.left;
	}
	
	public Node getRightNode() {
		return this.right;
	}
	
	@Override
	public void accept(final TreeNodeVisitor visitor) {
		visitor.visit(this);
	}

}
