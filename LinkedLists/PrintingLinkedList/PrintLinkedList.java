package LinkedLists.PrintingLinkedList;

public class PrintLinkedList {
    public static void print(Node <Integer> head){
        // Printing linked list
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; // setting head to the next node's address that is stored in node1' s next part initially.
        }
    }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        node1.next = node2; // storing address of node2 in node1' s next part.
        node2.next = node3;

        Node<Integer> head = node1; // node1 is a head initially.
        // while (head != null) {
        //     System.out.print(head.data + " ");
        //     head = head.next; // setting head to the next node's address that is stored in node1' s next part initially.
        // }
        print(head);
    }
}
