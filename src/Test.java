
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		System.out.println("Pre-order tree traversal: ");
		t.accept(new PreOrderVisitor());
		System.out.println();
		System.out.println("In-order tree traversal: ");
		t.accept(new InOrderVisitor());
		System.out.println();
		System.out.println("Post-order tree traversal: ");
		t.accept(new PostOrderVisitor());
	}

}
