package Stack.Queue;

public class TestClass {
	public static void main(String[] args) throws Exception {
		
		Stack stack = new Stack();
		Node n1 = new Node("a");
		Node n2 = new Node("b");
		Node n3 = new Node("c");
		Node n4 = new Node("d");
		Node n5 = new Node("e");

		try {
			System.out.println("######################### Normal Stack #####################");
			stack.push(n1);
			stack.push(n2);
			stack.push(n3);
			stack.push(n4);
			stack.push(n5);

			for (String data : stack.returnAllData()) {
				System.out.print(data + " | ");
			}
			System.out.println();

			System.out.println("Popped item: " + stack.pop().getItem());

			for (String data : stack.returnAllData()) {
				System.out.print(data + " | ");
			}
			System.out.println();
			System.out.println(stack.isEmpty());

			System.out.println();
		} catch (Exception e) {
			System.out.print(e);
		} finally {
			System.out.println("######################### End of Normal Stack #####################");
		}
		
		 try {
				System.out.println("######################### Normal Queue #####################");

	            // Create a new queue
	            Queue queue = new Queue();
	            System.out.println("Queue created. Is empty? " + queue.isEmpty()); // Expected: true
	            System.out.println("Queue size: " + queue.getSize()); // Expected: 0

	            // Create nodes to enqueue
	            Node node1 = new Node("A");
	            Node node2 = new Node("B");
	            Node node3 = new Node("C");

	            // Enqueue nodes
	            queue.enqueue(node1);
	            System.out.println("Enqueued 1. Queue size: " + queue.getSize()); // Expected: 1
	            queue.enqueue(node2);
	            System.out.println("Enqueued 2. Queue size: " + queue.getSize()); // Expected: 2
	            queue.enqueue(node3);
	            System.out.println("Enqueued 3. Queue size: " + queue.getSize()); // Expected: 3

	            // Dequeue nodes
	            queue.dequeue();
	            System.out.println("Dequeued 1. Queue size: " + queue.getSize()); // Expected: 2
	            queue.dequeue();
	            System.out.println("Dequeued 2. Queue size: " + queue.getSize()); // Expected: 1

	            // Check if the queue is empty after some dequeues
	            System.out.println("Is the queue empty? " + queue.isEmpty()); // Expected: false

	            // Dequeue the last node
	            queue.dequeue();
	            System.out.println("Dequeued 3. Queue size: " + queue.getSize()); // Expected: 0
	            System.out.println("Is the queue empty? " + queue.isEmpty()); // Expected: true

	            // Try to dequeue from an empty queue to see if an exception is thrown
	            try {
	                queue.dequeue();
	            } catch (Exception e) {
	                System.out.println(e.getMessage()); // Expected: "Queue is empty!"
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
				System.out.println("######################### Normal Queue #####################");
			}
		
		

	}

}
