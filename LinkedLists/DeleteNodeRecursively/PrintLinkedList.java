package LinkedLists.DeleteNodeRecursively;

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

    // deleting node recursively 40: 10 20 30 40 50
    // o/p: 10 20 30 50
    public static Node<Integer> deleteNodeRecursively(Node<Integer> head, int pos){
        if(pos == 0){ 
            return head.next;
        }
        if(head == null){
            return head;
        }
        // else if pos > 0
        head.next = deleteNodeRecursively(head.next, pos-1);
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = deleteNodeRecursively(head, 3);
        print(head);
    }
}
