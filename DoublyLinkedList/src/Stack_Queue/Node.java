package Stack_Queue;

public class Node<T>{
	protected Node next;
	protected T item;
	
	public Node(T item) {
		this.next = null;
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public T getItem() {
		return item;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
