package Stack.Queue;

public class Node{
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
