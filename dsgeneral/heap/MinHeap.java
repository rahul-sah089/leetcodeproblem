package dsgeneral.heap;

import java.util.Arrays;

public class MinHeap {
	private int capacity = 10;
	private int size = 0;

	int[] items = new int[capacity];

	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	};

	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	};

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}

	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}

	private boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	private int leftChild(int index) {
		int leftIndex = getLeftChildIndex(index);
		return items[leftIndex];
	}

	private int rightChild(int index) {
		int rightIndex = getRightChildIndex(index);
		return items[rightIndex];
	}

	private int parent(int index) {
		int parentIndex = getParentIndex(index);
		return items[parentIndex];
	}

	private void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}

	private void ensureExtraCapacity() {
		if (size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity *= 2;
		}
	}

	public int peek() {
		if (size == 0)
			throw new IllegalStateException();
		return items[0];
	}

	public int poll() {
		if (size == 0)
			throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size - 1];
		size--;
		heapifyDown();
		return item;
	}
	
	/*delete the element from the heap sort
	 * 1) Insert -Infinity element at the target index
	 * 2) Run heapifyTop
	*/
	public void delete(int a) {
		
	}
	
	public void add(int item) {
		ensureExtraCapacity();
		size++;
		items[size] = item;
		heapifyUp();
	}
	
	public void decreaseKey(int index, int x) {
		if(index > size) {
			return;
		}
		items[index] = x;
		heapifyUpfromIndex(index);
	}
	
	public void heapifyUp() {
		int index = size - 1;
		while(hasParent(index) && parent(index) > items[index]) {
			//out of order
			swap(getParentIndex(index),index);
			index = getParentIndex(index);
		}
	}
	
	public void heapifyUpfromIndex(int index) {
		while(hasParent(index) && parent(index) > items[index]) {
			//out of order, so needs to be corrected
			swap(getParentIndex(index),index);
			index = getParentIndex(index);
		}
	}
	
	
	public void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}
			if(items[index] < items[smallerChildIndex]) {
				break;
			}else {
				swap(index,smallerChildIndex);
				index = smallerChildIndex;
			}
			index = smallerChildIndex;
		}
	}

}
