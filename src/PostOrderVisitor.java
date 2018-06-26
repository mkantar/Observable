
public class PostOrderVisitor implements TreeNodeVisitor {

	@Override
	public void visit(Node node) {
		if(node.getLeftNode() != null)		
			node.getLeftNode().accept(this);
		
		if(node.getRightNode() != null)
			node.getRightNode().accept(this);
		
		System.out.print(node.getElem() + " - ");

	}

}
