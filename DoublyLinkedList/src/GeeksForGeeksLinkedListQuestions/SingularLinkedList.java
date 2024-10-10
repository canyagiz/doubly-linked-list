package GeeksForGeeksLinkedListQuestions;

import GeeksForGeeksLinkedListQuestions.DoublyLinkedList.Node;

public class SingularLinkedList {
	

	public class Node {
	private int data; //data
	private Node next;   //address
	
	public Node(int data) {
		this.data = data;
		this.next = null;
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
	protected int size;

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
	public void removeAfter(Node after) throws Exception {
		Node pos = head;
		if (head == null) {
			throw new Exception("List is empty");
		}
		else {
			while (pos != after && pos == null) {
				pos = pos.getNext();
			}
			if(pos == null) {
				throw new Exception("Node after does not exist in list.");
			}
			else {
			// pos is after rn.  node1 node2 node3 node4(after) node5(deletingNode) node6 we want do remove node5
			Node deletingNode = pos.getNext();
			pos.setNext(deletingNode.getNext());
			deletingNode.setNext(null); // To collection of garbage memory.
			size--;
			
		}}
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
	
	public void removeLast() {
		Node position = head;
		for (int k=0; k<size-2; k++) {
			position = position.getNext();
		}
		Node prevTail = position.getNext(); //must be defined before position.setNext(null)
		position.setNext(null);
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
	public int middleData() throws Exception {
		if (head == null) {
			throw new Exception("List is empty");
		} else {
			int middleIndex = size / 2 ;
			Node pos = head;
			
			for (int i = 0; i < middleIndex; i++) {
				pos = pos.getNext();
			}
			return pos.getData();

		}

	}
	
	public int occurenceRate(int data) {
		if (head == null) {return 0;}
		Node pos = head;
		int count =0;
		while (pos.getNext() != null) {
			if (pos.getData() == data) {count++;}
			pos = pos.getNext();
		}
		return count;
	}
	
	public int[] returnAllData() {
		Node pos = head;
		int[] arrayOfData = new int[size];
		for (int i = 0; i < size; i++) {
			arrayOfData[i] = pos.getData();
			pos = pos.getNext();
		}
		return arrayOfData;
	}
	

	
	

}

