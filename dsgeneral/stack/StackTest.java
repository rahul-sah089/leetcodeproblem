package dsgeneral.stack;

public class StackTest {
	public static void main(String[] args) throws Exception{
		MyStack stack = new MyStack(10);
		stack.push(10);
		stack.push(20);
		
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
}
