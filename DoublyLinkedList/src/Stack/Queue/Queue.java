package Stack.Queue;

//Both head and tail are storing since dequeing is from head, queing is from tail.
public class Queue {
	protected Node back, end;
	protected int size;

	public Queue() {
		this.size = 0;
		back = null;
		end = null;
	}

	public void enqueue(Node n) {
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

	public void dequeue() throws Exception {
		if (back == null) {
			throw new Exception("Queue is empty!");
		}
		if(back == end) {
			back =null;
			end = null;
			size--;
		}

		else {
			back = back.getNext();
			size--;
			
		}

	}
	public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
	
}