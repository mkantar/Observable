
public class InOrderVisitor implements TreeNodeVisitor {

	@Override
	public void visit(Node node) {
		if(node.getLeftNode() != null)		
			node.getLeftNode().accept(this);
		System.out.print(node.getElem() + " - ");
		
		if(node.getRightNode() != null)
			node.getRightNode().accept(this);

	}

}
