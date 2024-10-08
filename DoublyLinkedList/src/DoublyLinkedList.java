
public class DoublyLinkedList {
	private DNode head;
	private DNode tail;
	private int size;

	// As inner class, the DNode instances gonna be initialized from
	// DoublyLinkedList object.
	public class DNode {
		private int data;
		private DNode previous, next;

		public DNode(int data) {
			this.data = data;
			this.previous = null;
			this.next = null;
		}

		public int getData() {
			return data;
		}

		public DNode getPrevious() {
			return previous;
		}

		public DNode getNext() {
			return next;
		}

		public void setData(int data) {
			this.data = data;
		}

		public void setPrevious(DNode previous) {
			this.previous = previous;
		}

		public void setNext(DNode next) {
			this.next = next;
		}

	}

	// Constructor of List
	public DoublyLinkedList() {
		// After initialization, these values are initially null since list empty.
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// Getters
	public DNode getHead() {
		return head;
	}

	public DNode getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}

	// Methods
	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	/*
	 * OTHER IMPLEMENTATIONS OF isEmpty {return this.head == null;} {return
	 * this.tail ==null;}
	 */
	// Time Complexity O(1)
	public void addFirst(DNode n) {
		if (head == null) {
			head = n;
			tail = n;
			size++;
		} else {
			n.setNext(head);
			head.setPrevious(n);
			head = n;
			size++;
		}

	}

	// Time Complexity O(1)
	public void addLast(DNode n) {
		if (tail == null) {
			head = n;
			tail = n;
			size++;
		} else {
			n.setPrevious(tail);
			tail.setNext(n);
			tail = n;
			size++;
		}
	}

	// Time Complecity O(size)
	public void insert(DNode after, DNode n) throws Exception {
		if (head == null) {
			throw new Exception("DNode can not be added next to DNode 'after' since List is empty.");
		}

		else {
			DNode pos = head;

			while (pos != null && pos != after) {
				pos = pos.getNext();
			}

			if (pos == null) {
				throw new Exception("DNode 'after' not found in the list.");
			}

			if (after == tail) {
				addLast(n);
				return; // If n is added to last, all work has done. Method must be interrupted.
			}

			DNode nodeAfter_n = pos.getNext();
			nodeAfter_n.setPrevious(n);
			n.setPrevious(pos);
			n.setNext(nodeAfter_n);
			pos.setNext(n);
			size++;
		}
	}
	
	/*O(size) is the best time complexity for returning whole data since iterating through each DNode is a must. However, make it more efficient,
	 * instead of Arraylist, as implemented on below code, Array might be used since the size of Array (# of data) already known.
	 */
	public int[] returnAllData() {
		DNode pos = head;
		int[] arrayOfData = new int[size];
		for (int i = 0; i<size;i++) {
			arrayOfData[i] = pos.getData();
			pos = pos.getNext();
		}
		return arrayOfData;
	}
}
