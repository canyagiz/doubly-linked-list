package GeeksForGeeksLinkedListQuestions;

import Stack_Queue.Node;
import Stack_Queue.Queue;
import Stack_Queue.Stack;

public class TestClass {
	public static void main(String[] args) throws Exception {

		System.out.println("######################### Singular Linked List ########################");
		SingularLinkedList s_list = new SingularLinkedList();
		SingularLinkedList.Node n1_s = s_list.new Node(1);
		SingularLinkedList.Node n2_s = s_list.new Node(2);
		SingularLinkedList.Node n3_s = s_list.new Node(3);
		SingularLinkedList.Node n4_s = s_list.new Node(4);
		SingularLinkedList.Node n5_s = s_list.new Node(5);
		SingularLinkedList.Node n6_s = s_list.new Node(6);
		SingularLinkedList.Node n7_s = s_list.new Node(7);

		s_list.addFirst(n1_s);
		s_list.addAfter(n1_s, n2_s);
		s_list.addAfter(n2_s, n3_s);
		s_list.addAfter(n3_s, n4_s);
		s_list.addAfter(n4_s, n5_s);
		s_list.addAfter(n5_s, n6_s);
		s_list.addLast(n7_s);

		for (Object data : s_list.returnAllData()) {
			System.out.print(data + " | ");
		}
		System.out.println();

		System.out.println("Middlest data of list: " + s_list.middleData());

		int testValue = 3;
		System.out.println("occurance rate of " + testValue + " is: " + s_list.occurenceRate(testValue));

		System.out.println();
		
		System.out.println("List is gonna be reversed, list before reversed \n");
		for (Object data : s_list.returnAllData()) {
			System.out.print(data + " | ");
		}
		System.out.println("\nList after reversed:\n");
		s_list.reverseLinkedList();
		for (Object data : s_list.returnAllData()) {
			System.out.print(data + " | ");
		}
		
		System.out.println();
		System.out.println("\n######################### Doubly Linked List ########################");
		System.out.println();
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyLinkedList.Node n1 = list.new Node(1);
		DoublyLinkedList.Node n2 = list.new Node(2);
		DoublyLinkedList.Node n3 = list.new Node(3);
		DoublyLinkedList.Node n4 = list.new Node(4);
		DoublyLinkedList.Node n5 = list.new Node(5);
		DoublyLinkedList.Node n6 = list.new Node(6);
		DoublyLinkedList.Node n7 = list.new Node(7);
		DoublyLinkedList.Node n8 = list.new Node(8);
		DoublyLinkedList.Node n9 = list.new Node(9);
		DoublyLinkedList.Node n10 = list.new Node(5);

		list.addFirst(n1);
		list.insert(n1, n2);
		list.insert(n2, n3);
		list.insert(n3, n4);
		list.insert(n4, n5);
		list.insert(n5, n6);
		list.insert(n6, n7);
		list.insert(n7, n8);
		list.addLast(n9);
		list.insert(n7, n10);

		for (int data : list.returnAllData()) {
			System.out.print(data + " | ");
		}

		System.out.println();

		System.out.println("Middlest data of list: " + list.middleData());

		// int testValue =5;
		System.out.println("occurance rate of " + testValue + " is: " + list.occurenceRate(testValue));

		DoublyLinkedList.Node testNode = n3;
		DoublyLinkedList.Node testNode2 = n9;
		System.out.println("Is node" + testNode.getData() + " in there: " + list.isNodeThere(testNode));
		System.out.println("Is node" + testNode2.getData() + " in there: " + list.isNodeThere(testNode2));

		System.out.println(
				"\n########################### TESTS OF CIRCULAR LINKED LIST WHICH IS CHILD CLASS OF DOUBLY L. LIST ############################\n");

		// Initiliation of Circular Doubly Linked List
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();

		// Instead of creating new nodes, the previously created nodes gonna be used
		// since both list types are using same node type.

		// clist.insert(n1, n2); throws List is empty! Exception.
		clist.addFirst(n1);
		clist.insert(n1, n2);
		clist.insert(n2, n3);
		clist.insert(n3, n4);
		clist.addLast(n6);
		clist.insert(n4, n5);

		for (int data : clist.returnAllData()) {
			System.out.print(data + " | ");
		}

		System.out.println();

		int testValueClist = 5;

		System.out.println("Middlest data of list: " + clist.middleData());

		System.out.println("occurance rate of " + testValueClist + ": " + clist.occurenceRate(testValueClist));

		DoublyLinkedList.Node testNodeClist = n3;
		DoublyLinkedList.Node testNodeClist2 = n7;

		System.out.println("Is node" + testNodeClist.getData() + " in there: " + clist.isNodeThere(testNodeClist));
		System.out.println("Is node" + testNodeClist2.getData() + " in there: " + clist.isNodeThere(testNodeClist2));
		
		System.out.println("\n############### STACK ####################\n");

		try {
			Stack<Integer> intStack = new Stack<>();
			intStack.push(new Node<>(1));
			intStack.push(new Node<>(2));
			intStack.push(new Node<>(3));
			System.out.println("Kuyruktan çıkarılan: " + intStack.pop().getItem()); // 1
			System.out.println("Kuyruktan çıkarılan: " + intStack.pop().getItem()); // 2
			System.out.println("Kuyruktan çıkarılan: " + intStack.pop().getItem()); // 3

		}catch(Exception e) {
			System.out.println("Hata: " + e.getMessage());
		}
		
		System.out.println("\n############### QUEUE ####################\n");

		try {
            Queue<Integer> intQueue = new Queue<>();
            intQueue.enqueue(new Node<>(1));
            intQueue.enqueue(new Node<>(2));
            intQueue.enqueue(new Node<>(3));
            System.out.println("Kuyruktan çıkarılan: " + intQueue.dequeue()); // 1
            System.out.println("Kuyruktan çıkarılan: " + intQueue.dequeue()); // 2
            System.out.println("Kuyruktan çıkarılan: " + intQueue.dequeue()); // 3

            Queue<String> stringQueue = new Queue<>();
            stringQueue.enqueue(new Node<>("Hello"));
            stringQueue.enqueue(new Node<>("World"));
            System.out.println("Kuyruktan çıkarılan: " + stringQueue.dequeue()); // Hello
            System.out.println("Kuyruktan çıkarılan: " + stringQueue.dequeue()); // World

        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

	}

}
