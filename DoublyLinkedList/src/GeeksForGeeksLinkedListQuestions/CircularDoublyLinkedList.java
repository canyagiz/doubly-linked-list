package GeeksForGeeksLinkedListQuestions;

public class CircularDoublyLinkedList extends DoublyLinkedList {
	public CircularDoublyLinkedList() {
		super();
	}

	public void addFirst(Node n) {
		super.addFirst(n);
		if (size == 1) {
			n.setNext(head); // n, tail and head are have same Node object reference.
			n.setPrev(head);
			tail = head; // or tail = n etc.
		} else {
			tail.setNext(head);
			head.setPrev(tail);
		}
	}

	public void addLast(Node n) {
		super.addLast(n);
		if (size == 1) {
			head.setNext(head); // n, tail and head are have same Node object reference.
			head.setPrev(head);
			tail = head; // or tail = n etc.
		} else {	
			tail.setNext(head);
			head.setPrev(tail);
		}
	}
	@Override
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
				if (nodeAfter_n == head) { // Reason of overriding insert method at DoublyLinkedList
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
}
