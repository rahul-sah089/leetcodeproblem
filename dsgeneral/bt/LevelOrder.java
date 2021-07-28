package dsgeneral.bt;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Using Queue
 * 1) Create an empty Queue
 * 2) temp_node = root
 * 3) Loop while the temp_node is not NULL
 *  a) print temp_node->data
 *  b) Enqueue temp_node children to q
 *  c) Dequeue a node from q
 */

public class LevelOrder {
	
	public static void printLevelOrder(Node root) {
		Queue<Node> queue =  new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.key + " ");
			//enqueue the left child
			if(tempNode.left != null) {
				queue.add(tempNode.left);
			}
			//enqueue the right child
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		
		printLevelOrder(root);
	}
}
