package Stack.Queue;


public class Stack {
	
	protected Node top;
	protected int size;
	
	public Stack() {
		this.top = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(Node n) throws Exception {
		if (top == null) {
			top = n;
			size++;
		}else {
		Node pos = top;
		n.setNext(top);
		top = n;
		size++;}
		
	}
	public Node pop() throws Exception {
		if(size != 0) {
			Node pos = top;
			Node newHead = pos.getNext();
			top = newHead;
			pos.setNext(null); // to garbage collecter
			size--;
			return pos;
		}
		else {
			throw new Exception("Can not pop any node from empty stack.");
		}
		
	}
	
	public String[] returnAllData() {
		Node pos = top;
		String[] arrayOfData = new String[size];
		for (int i = 0; i < size; i++) {
			arrayOfData[i] = pos.getItem();
			pos = pos.getNext();
		}
		return arrayOfData;
	}
	
	
	

}
