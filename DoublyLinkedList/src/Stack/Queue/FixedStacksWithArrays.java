package Stack.Queue;


public class FixedStacksWithArrays {
	private String[] s;
	private int N = 0; // count of element in stack
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
		return N == 0;
	}

	public void push(String item) {
        if (N == s.length) {
            resize(2 * s.length);
        }
        s[N++] = item; // S[N] = item; N++;
    }

	public String pop() throws Exception {
		if (N == 0) {
			throw new Exception("No element to pop!");
		} 
		else {
			if(N == s.length / 4) {
				resize(s.length/2);
			}
			String item = s[N]; // 0 1 2 3 4 5 6 7 8 (pop 9) N=10 s[10] = 9 = item
			s[N--] = null; // s[9] = 8 , N = N-1
			return item;
		}

	}
	public void resize(int newCapacity) {
		String[] copy = new String[newCapacity];
		for (int i =0; i<N; i++) {
			copy[i] = s[i];
		}
		this.capacity = newCapacity;
		s = copy;
	}
	

}
