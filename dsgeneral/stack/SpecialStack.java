package dsgeneral.stack;

import java.util.Stack;

/*
 * Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() 
 * and an additional operation getMin() which should return minimum element from the SpecialStack.
 *  All these operations of SpecialStack must be O(1). To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, . etc. 
 * 
 */
public class SpecialStack extends Stack<Integer> {
	Stack<Integer> minStack = new Stack<>();

	public Integer pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(0);
		}
		return minStack.pop();
	}

	void push(int x) {
		if (isEmpty()) {
			super.push(x);
			minStack.push(x);
		} else {
			super.push(x);
			int y = minStack.peek();
			if (x < y) {
				minStack.push(x);
			} else {
				minStack.push(y);
			}
		}
	}
}
