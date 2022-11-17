package LinkedLists.Introduction;

public class LinkedListUse {
    public static void main(String[] args) {
        // creating node means we need to make object of the class.
        Node<Integer> node1 = new Node<>(10); // node1
        System.out.println(node1.data); // node1 data
        System.out.println(node1.next); // node1 pointer(to the next node)
        Node<Integer> node2 = new Node<Integer>(20); // node2
        // linking nodes: means node1 will hold the address of second node of a list in its next part i.e node1 = (data | next(node2 address))
        node1.next = node2;
        System.out.println(node2); // Node@6b95977 - address of node2
        System.out.println(node1.next); // Node@6b95977 - address of node2.
    }
}
