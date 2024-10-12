package Stack_Queue;


public class Stack<T> {
	
	protected Node<T> top;
	protected int size;
	
	public Stack() {
		this.top = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(Node<T> n) throws Exception {
		if (top == null) {
			top = n;
			size++;
		}else {
		Node<T> pos = top;
		n.setNext(top);
		top = n;
		size++;}
		
	}
	public Node<T> pop() throws Exception {
		if(size != 0) {
			Node<T> pos = top;
			Node<T> newHead = pos.getNext();
			top = newHead;
			pos.setNext(null); // to garbage collecter
			size--;
			return pos;
		}
		else {
			throw new Exception("Can not pop any node from empty stack.");
		}
		
	}
	
	public T[] returnAllData() {
		Node<T> pos = top;
		T[] arrayOfData = (T[]) new Object[size];
		for (int i = 0; i < size; i++) {
			arrayOfData[i] =  (T) pos.getItem();
			pos = pos.getNext();
		}
		return arrayOfData;
	}
	
	
	

}
