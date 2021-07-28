package dsgeneral.stack;

public class MyStack {
	int capacity;
	int stack[];
	int top;

	public MyStack(int capacity) {
		this.top = -1;
		this.capacity = capacity;
		stack = new int[capacity];
	}

	public void push(int item) throws Exception{
		System.out.println("Top >>"+top);
		System.out.println("Capacity >> "+ capacity);
		if(top == capacity - 1) {
			throw new Exception("Stack is Full");
		}
		top++;
		stack[top] = item;
	}

	public int pop() throws Exception{
		if(top == -1) {
			throw new Exception("Stack is Empty");
		}
		int res = stack[top];
		top--;
		return res;
	}

	public int peek() {
		return stack[top];
	}

	public boolean isEmpty() {
		return( top == -1);
	}

	public boolean isFull() {
		if (top == capacity) {
			return true;
		}
		return false;
	}

	public int size() {
		return top + 1;
	}
	

}
