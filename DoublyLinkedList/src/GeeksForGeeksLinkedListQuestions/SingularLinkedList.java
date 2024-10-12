package GeeksForGeeksLinkedListQuestions;

import GeeksForGeeksLinkedListQuestions.DoublyLinkedList.Node;

public class SingularLinkedList<T> {

	public class Node<T> {
		private T data; // data
		private Node<T> next; // address

		public Node(T data) {
			this.data = data;
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setData(T data) {
			this.data = data;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

	protected Node<T> head;
	protected int size;

	public SingularLinkedList() {
		this.head = null;
		this.size = 0;
	}

	// We can not insert anything rather than a node to LinkedList, so parameter'
	// reference is Node
	public void addFirst(Node<T> n) {
		// previous head is next of new head.
		n.setNext(head);
		// init new head as head.
		head = n;
		size++;
	}

	// parameter = after what, insert what.
	public void addAfter(Node<T> v, Node<T> n) {
		n.setNext(v.getNext());
		v.setNext(n);
		size++;
	}

	public void addLast(Node<T> n) {
		Node<T> temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(n);
		size++;
	}

	public Node<T> get(int i) throws Exception {
		if (i <= size) {
			throw new Exception("that index is not valid.");
		}
		Node<T> position = head;
		for (int k = 0; k < i; k++) {
			position = position.getNext();
		}
		return position;
	}

	public void remove(int i) throws Exception {
		if (i <= size) {
			throw new Exception("that index is not valid.");
		}
		Node<T> position = head;
		for (int k = 0; k < i; k++) {
			position = position.getNext();
		}

	}

	public void removeAfter(Node<T> after) throws Exception {
		Node<T> pos = head;
		if (head == null) {
			throw new Exception("List is empty");
		} else {
			while (pos != after && pos == null) {
				pos = pos.getNext();
			}
			if (pos == null) {
				throw new Exception("Node after does not exist in list.");
			} else {
				// pos is after rn. node1 node2 node3 node4(after) node5(deletingNode) node6 we
				// want do remove node5
				Node<T> deletingNode = pos.getNext();
				pos.setNext(deletingNode.getNext());
				deletingNode.setNext(null); // To collection of garbage memory.
				size--;

			}
		}
	}

	public void remove(Node<T> n) {
		Node<T> position = head;
		Node<T> prevPos = head;
		while (position.getNext().getData() != n.getData()) {
			prevPos = position;
			position = position.getNext();
		}
		prevPos.setNext(position.getNext());
		position.setNext(null);

	}

	public void removeFirst() {
		Node<T> n = head;
		head = head.getNext();
		n.setNext(null);
		size--;
	}

	public void removeLast() {
		Node<T> position = head;
		for (int k = 0; k < size - 2; k++) {
			position = position.getNext();
		}
		Node<T> prevTail = position.getNext(); // must be defined before position.setNext(null)
		position.setNext(null);
		size--;
	}

	/*
	 * public int sumAll() { Node<T> position = head; int sum =0; for (int k =0; k <
	 * size; k++) { sum += position.getData(); position = position.getNext(); }
	 * return sum; }
	 */
	public void swapFirstAndSecondNodeReference() {
		Node first = head;
		Node second = first.getNext();
		Node third = second.getNext();
		Node forth = third.getNext();

		first.setNext(third);
		third.setNext(second);
		second.setNext(forth);

	}

	public T middleData() throws Exception {
		if (head == null) {
			throw new Exception("List is empty");
		} else {
			int middleIndex = size / 2;
			Node<T> pos = head;

			for (int i = 0; i < middleIndex; i++) {
				pos = pos.getNext();
			}
			return pos.getData();

		}

	}

	public int occurenceRate(T data) {
		if (head == null) {
			return 0;
		}
		Node<T> pos = head;
		int count = 0;
		while (pos.getNext() != null) {
			if (pos.getData() == data) {
				count++;
			}
			pos = pos.getNext();
		}
		return count;
	}

	public T[] returnAllData() {
	    Node pos = head;
	    T[] arrayOfData = (T[]) new Object[size]; // Object arrayini T arrayine cast ediyoruz.
	    for (int i = 0; i < size; i++) {
	        arrayOfData[i] = (T) pos.getData(); // Her bir elemanı T türüne cast ediyoruz.
	        pos = pos.getNext();
	    }
	    return arrayOfData;
	}

	public void reverseLinkedList() {

		Node<T> nextHead = head.getNext();
		for (int i = 0; i < size-1; i++) {
			Node pos = head;
			head = nextHead;
			nextHead = nextHead.getNext();
			head.setNext(pos);
		}
	}

}
