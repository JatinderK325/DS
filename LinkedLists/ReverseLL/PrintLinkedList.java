package LinkedLists.ReverseLL;

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
            if(head == null){ // for first node
                head = newNode;
                tail = newNode;
            }
            else{ // if sec, 3rd....
                /* 
                // making links between nodes
                Node<Integer> temp = head;
                // this is for reaching that node with which we will insert our new node i.e for example at element 2's next, we are inserting reference for 3 element .
                while(temp.next != null){
                    temp = temp.next; // moving temp
                }
                temp.next  = newNode; // if temp.next == null
                */
                // OR
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

    // reversing list recursively
    public static Node<Integer> reverseLL(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> finalHead = reverseLL(head.next);
        Node<Integer> temp = finalHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return finalHead;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = reverseLL(head);
        print(head);
    }
}
