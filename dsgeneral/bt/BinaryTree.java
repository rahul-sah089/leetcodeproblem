package dsgeneral.bt;

public class BinaryTree {
	//Root of the Binary Tree
	Node root;
	public BinaryTree(Node root) {
		this.root = root;
	}
	
	public static void main(String[] args) {
		Node root = new Node(10);
		BinaryTree tree = new BinaryTree(root);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		
		
		
		
	}
}
