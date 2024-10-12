package Stack_Queue;


public class FixedStacksWithArrays {
	private String[] s;
	private int size = 0; // count of element in stack
	private int capacity;

	public FixedStacksWithArrays(int capacity) {
		this.capacity = capacity;
		s = new String[capacity];
	}

	protected class Node {
		protected Node next;
		protected String item;

		public Node(String item) {
			this.next = null;
			this.item = item;
		}

		public Node getNext() {
			return next;
		}

		public String getItem() {
			return item;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setItem(String item) {
			this.item = item;
		}

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(String item) {
        if (size == s.length) {
            resize(2 * s.length);
        }
        s[size++] = item; // S[N] = item; N++;
    }

	public String pop() throws Exception {
		if (size == 0) {
			throw new Exception("No element to pop!");
		} 
		else {
			if(size == s.length / 4) {
				resize(s.length/2);
			}
			String item = s[--size]; // 0 1 2 3 4 5 6 7 8 (pop 9) size=10 s[10] = 9 = item
			s[size] = null; // s[9] = 8 , N = N-1
			return item;
		}

	}
	public void resize(int newCapacity) {
		String[] copy = new String[newCapacity];
		for (int i =0; i<size; i++) {
			copy[i] = s[i];
		}
		this.capacity = newCapacity;
		s = copy;
	}
	

}
