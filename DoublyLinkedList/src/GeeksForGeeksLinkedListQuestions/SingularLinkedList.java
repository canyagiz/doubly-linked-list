package GeeksForGeeksLinkedListQuestions;

public class SingularLinkedList {
	

	public class Node {
	private int data; //data
	private Node next;   //address
	
	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}

	protected Node head;
	protected long size;

	public SingularLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	//We can not insert anything rather than a node to LinkedList, so parameter' reference is Node
	public void addFirst(Node n) { 
		//previous head is next of new head.
		n.setNext(head);
		//init new head as head.
		head = n;
		size++;
	}
	//parameter = after what, insert what.
	public void addAfter(Node v, Node n) {
		n.setNext(v.getNext());
		v.setNext(n);
		size++;
	}
	
	public void addLast(Node n) {
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		} 
		temp.setNext(n);
	}
	
	public Node get(int i) throws Exception {
		if (i<=size) {
			throw new Exception("that index is not valid.");
		}
		Node position = head;
		for (int k =0; k<i; k++) {
			position = position.getNext();
		}
		return position;
	}
	
	public void remove(int i) throws Exception{
		if (i<=size) {
			throw new Exception("that index is not valid.");
		}
		Node position = head;
		for (int k =0; k<i; k++) {
			position = position.getNext();
		}
		
	}
	public void removeLast() {
		Node position = head;
		for (int k=0; k<size-2; k++) {
			position = position.getNext();
		}
		Node prevTail = position.getNext(); //must be defined before position.setNext(null)
		position.setNext(null);
		size--;
	}
	
	public void remove(Node n) {
		Node position = head;
		Node prevPos = head;
		while (position.getNext().getData() != n.getData()) {
			prevPos = position;
			position = position.getNext();
		}
		prevPos.setNext(position.getNext());
		position.setNext(null);
		
	}
	
	public void removeFirst() {
		Node n = head;
		head = head.getNext();
		n.setNext(null);
		size--;
	}
	
	public int sumAll() {
		Node position = head;
		int sum =0;
		for (int k =0; k < size; k++) {
			sum += position.getData();
			position = position.getNext();
		}
		return sum;
	}
	
	public void swapFirstAndSecondNodeReference(){
		Node first = head;
		Node second = first.getNext();
		Node third = second.getNext();
		Node forth = third.getNext();
		
		first.setNext(third);
		third.setNext(second);
		second.setNext(forth);

	}
	
	
	

}

