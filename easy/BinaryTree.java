package easy;

import java.util.ArrayList;
import java.util.List;

class Node{
	int val;
	Node right;
	Node left;
	public Node(int val) {
		super();
		this.val = val;
		this.right = this.left = null;
	}
	
}
public class BinaryTree {
	public void inOrderTraversal1(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.val);
		inOrderTraversal1(root.left);
		inOrderTraversal1(root.right);
	}
	
	public List<Integer> inOrderTraversal2(Node root) {
		List<Integer> val = new ArrayList<Integer>();
		if(root != null) {
			if(root.left != null) {
				inOrderTraversal2(root.left);
			}
			val.add(root.val);
			if(root.right != null) {
				inOrderTraversal2(root.right);
			}
		}
		return val;
	}
	
	
	
	public static void main(String[] args) {
		
	}
}
