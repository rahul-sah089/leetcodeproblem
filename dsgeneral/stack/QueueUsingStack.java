package dsgeneral.stack;

import java.util.Stack;

/*Make the dequeue operation costly*/
class Queue2{
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	void enqueue(int value) {
		s1.push(value);
	}
	
	int dequeue() {
		//if both the stack are empty 
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Queue is Empty");
		}
		
		if(s2.isEmpty()) {
			//Move all the element from s1 to s2
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
}
/*Make the Enqueue operation costly*/
class Queue1{
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	/*Make the Enqueue operation costly
	 * 1) While element is Stack1 is empty push it to Stack2
	 * 2) Push the element to Stack1
	 * 3) Push all the element to stack online
	 */
	public void enqueue(Integer value) {
		//Move all the element from s1 to s2
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		//Push element to s1
		s1.push(value);
		
		//Push everything from s1 to s2
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	
	//Dequeue an item from the queue
	public int dequeue() {
		if(s1.isEmpty()) {
			System.out.println("Q is Empty");
			System.exit(0);
		}
		//Return from the top
		int top = s1.pop();
		return top;
	}
}
public class QueueUsingStack {
	public static void main(String[] args) {
		Queue1 queue1 = new Queue1();
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.enqueue(40);
		queue1.enqueue(50);
		
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		
		/*Queue 2 implementation*/
		Queue2 queue2 = new Queue2();
		queue2.enqueue(10);
		queue2.enqueue(20);
		queue2.enqueue(30);
		queue2.enqueue(40);
		queue2.enqueue(50);
		
		System.out.println(queue2.dequeue());
		System.out.println(queue2.dequeue());
		System.out.println(queue2.dequeue());
		System.out.println(queue2.dequeue());
		
		
		
	}
}
