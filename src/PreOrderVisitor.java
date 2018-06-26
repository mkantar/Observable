
public class PreOrderVisitor implements TreeNodeVisitor{
	
	@Override
	public void visit(Node node) {
		System.out.print(node.getElem() + " - ");
		if(node.getLeftNode() != null)
			node.getLeftNode().accept(this);
		
		if(node.getRightNode() != null)
			node.getRightNode().accept(this);
	}

}
