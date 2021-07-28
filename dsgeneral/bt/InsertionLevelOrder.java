package dsgeneral.bt;

import java.util.LinkedList;
import java.util.Queue;

/*Insertion in a Binary Tree in level order
  Given a Binary Tree , insert a key into the Binary tree at the first aviable position
 *
 * The idea is to do the iterative level order traversal of the given tree using queue.
 * 
 * If we find the node whose left child is empty we will make the new key the left child of that Node
 * If we find the node whose right child is empty we will make the new key the right child of that Node
 * 
 */
public class InsertionLevelOrder {

	// Print the Binary Tree inOrder
	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.key + ">>");
		inOrder(root.right);
	}
	
	
	
	//Print the Binary Tree Pre Order
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.key + ">>");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//Print the Binary Tree Post Order 
	public static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.key + ">>");
	}
	
	//Get the Height of the sub-tree
	public static int getHeight(Node root) {
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}
	
	//Space Complexity : O(n) where n is number of nodes in binary tree
	//Time  Complexity:  O(n) where n is number of nodes in the binary tree 
	public static void printLevelOrder(Node root) {
		System.out.println();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			//Get the data from the Queue
			Node tempNode = queue.poll();
			System.out.print(tempNode.key + ">>");
			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}
	
	public static void insertToBinaryTree(Node root, int key) {
		
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		inOrder(root);
		System.out.println();
		int val = getHeight(root);
		System.out.println(val);
		printLevelOrder(root);
		
	}
}
