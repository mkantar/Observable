
public class Tree implements TreeNode {

	private Node nodeH = null;
	private Node nodeG = null;
	private Node nodeF = null;
	private Node nodeE = null;
	private Node nodeD = null;
	private Node nodeC = null;
	private Node nodeB = null;
	private Node nodeA = null;
	
	public Tree() {
		nodeH = new Node('H', null, null);
		nodeG = new Node('G', null, null);
		nodeF = new Node('F', null, null);
		nodeE = new Node('E', nodeG, nodeH);
		nodeD = new Node('D', null, null);
		nodeC = new Node('C', null, nodeF);
		nodeB = new Node('B', nodeD, nodeE);
		nodeA = new Node('A', nodeB, nodeC);
	}
	
	
	@Override
	public void accept(TreeNodeVisitor visitor) {
		visitor.visit(nodeA);
	}
	
	

}
