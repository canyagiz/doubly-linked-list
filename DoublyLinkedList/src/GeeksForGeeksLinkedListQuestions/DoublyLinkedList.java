package GeeksForGeeksLinkedListQuestions;

public class DoublyLinkedList {
	protected Node head, tail;
	protected int size;

	protected class Node {
		protected int data;
		protected Node next;
		protected Node previous;

		public Node(int data) {
			this.data = data;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setPrev(Node prev) {
			previous = prev;
		}

		public void setData(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

		public Node getPrevious() {
			return previous;
		}
	}

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	// Methods
		public int size() {
			return this.size;
		}

		public boolean isEmpty() {
			return this.size == 0;
		}

	public void addFirst(Node n) {
		if (head == null) {
			head = n;
			tail = n;
			size++;
		} else {
			head.setPrev(n);
			n.setNext(head);
			head = n;
			size++;
		}
	}

	public void addLast(Node n) {
		if (tail == null) {
			head = n;
			tail = n;
			size++;
		} else {
			tail.setNext(n); //n1.setNext(n2)
			n.setPrev(tail); //n2.setPrev(n1)
			tail = n;		 // tail = n2
			size++;
		}
	}

	public void insert(Node after, Node n) throws Exception {
		if (head == null) {
			throw new Exception("List is empty!");
		} else {
			Node pos = head;
			while (pos != null && pos != after) {
				pos = pos.getNext();
			}
			if (pos == null) {
				throw new Exception("After does not exist in the list!");
			} else { //pos = n1
				Node nodeAfter_n = after.getNext(); //null
				if (nodeAfter_n == null) { // we are adding to last.
					addLast(n);
				} else {
					nodeAfter_n.setPrev(n);
					n.setNext(nodeAfter_n);
					pos.setNext(n);
					n.setPrev(after);
					size++;
				}

			}
		}
	}
	/* Q1) Find Middle of the Linked List
	* Given a singly linked list, the task is to find the middle of the linked list. 
	* If the number of nodes are even, then there would be two middle nodes, so return the second middle node.
	 */
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
	
	public int[] returnAllData() {
		Node pos = head;
		int[] arrayOfData = new int[size];
		for (int i = 0; i < size; i++) {
			arrayOfData[i] = pos.getData();
			pos = pos.getNext();
		}
		return arrayOfData;
	}
	
	//Q2) Write a function that counts the number of times a given int occurs in a Linked List
	public int occurenceRate(int data) {
		if (head == null) {return 0;}
		Node pos = head;
		int count =0;
		while (pos != tail) {
			if (pos.getData() == data) {count++;}
			pos = pos.getNext();
		}
		return count;
	}
	public boolean isNodeThere(Node n) {
		if (head ==null) {return false;}
		Node pos = head;
		
		for (int i = 0; i<size; i++) {
			if(pos == n) {return true;}
			pos = pos.getNext();
		}
		
			
		
		/*If not boolean returned when list is empty(false), and inside while loop (true), it means
		 *  list is not empty also DNode n does not exist in list.
		 *  So, return false in there*/
		return false;
	}
}
