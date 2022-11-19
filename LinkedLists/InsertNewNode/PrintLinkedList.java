package LinkedLists.InsertNewNode;

import java.util.Scanner;

public class PrintLinkedList {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null; // head is null initially.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements");
        int data = s.nextInt(); // taking elements from user

        while(data != -1){ // taking elements from user until user gives -1
            // creating node for user's entered elements
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode; // means we will put new element's reference at the tail's next part(last node's next).
                tail = newNode; // or tail = tail.next; // updating tail becoz new element has inserted and that will be our new tail.
            }
            data = s.nextInt(); // setting data step by step that is entered by user.
        }
        return head;
    }

    public static void print(Node <Integer> head){
        // Printing linked list
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; // setting head to the next node's address that is stored in node1' s next part initially.
        }
    }

    // inserting new node: 10 20 30
    // o/p: 10 20 80 30
    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
        // creating a new node for insertion of new element
        Node<Integer> newNode = new Node<>(data);
        // Reaching pos through iterations where we need to insert new element.
        if(pos == 0){
            // means if we want to insert element at 0 pos
            newNode.next = head; // newNode will be at index 0 if pos == 0
            return newNode;
        }
        // else if pos > 0
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) { // iteration till pos - 1
            temp = temp.next;// moving head
            i++;
        }
        // when reach pos - 1 i.e (2 - 1 = 1) becoz we need to insert new element after 1 means at pos(index) 2.
        newNode.next = temp.next; // setting new element after pos 1 and before pos 3 so new element's next would point to element that will come after this new element.
        temp.next = newNode; // giving address of new element in order to insert it at pos 2 after pos 1.
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insert(head, 80, 2);
        print(head);
    }
}
