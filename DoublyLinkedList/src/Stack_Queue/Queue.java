package Stack_Queue;

//Both head and tail are storing since dequeing is from head, queing is from tail.
public class Queue<T> {
	protected Node<T> back, end;
	protected int size;

	public Queue() {
		this.size = 0;
		back = null;
		end = null;
	}

	public void enqueue(Node<T> n) {
		if (end == null) {
			back = n;
			end = n;
			size++;
		} else {
			end.setNext(n);
			end = n;
			size++;
		}
	}

	public T dequeue() throws Exception {
		if (back == null) {
			throw new Exception("Queue is empty!");
		}
		if(back == end) {
			Node<T> n = back;
			back =null;
			end = null;
			size--;
			return n.getItem();
		}

		else {
			Node<T> n = back;
			back = back.getNext();
			size--;
			return n.getItem();
			
		}

	}
	public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
	
}