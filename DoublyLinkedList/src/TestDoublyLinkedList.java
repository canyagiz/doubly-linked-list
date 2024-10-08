public class TestDoublyLinkedList {
    public static void main(String[] args) {
        try {
            DoublyLinkedList list = new DoublyLinkedList();
            DoublyLinkedList.DNode node1 = list.new DNode(1);
            DoublyLinkedList.DNode node2 = list.new DNode(2);
            DoublyLinkedList.DNode node3 = list.new DNode(3);
            
            list.addFirst(node1);
            list.addLast(node2);
            list.insert(node1, node3); // Insert 3 after 1

            // Print the list for verification
            int[] arr = list.returnAllData();
            for (int data : arr) {
            	System.out.print(data + " | ");
            }
            // Expected output: 1 3 2
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
