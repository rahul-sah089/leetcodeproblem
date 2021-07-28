package dsgeneral.stack;

/*
 * Implement two stack is an array
push1(int x) –> pushes x to first stack 
push2(int x) –> pushes x to second stack
pop1() –> pops an element from first stack and return the popped element 
pop2() –> pops an element from second stack and return the popped element
 */
public class TwoStack {
	int[] arr;
	int size;
	int top1, top2;

	TwoStack(int n) {
		size = n;
		arr = new int[n];
		top1 = n / 2 + 1;
		top2 = n / 2;
	}

	// Method to push the element x to stack 1
	void push1(int x) {
		if (top1 > 0) {
			// You can insert
			top1--;
			arr[top1] = x;
		} else {
			System.out.println("Stack1 Overflow");
		}
	}

	void push2(int x) {
		if (top2 < size - 1) {
			top2++;
			arr[top2] = x;
		}else {
			System.out.println("Stack 2 Overflow");
		}
	}
}
