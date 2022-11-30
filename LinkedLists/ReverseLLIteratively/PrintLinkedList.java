package LinkedLists.ReverseLLIteratively;

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

    // reversing list with iterative method
    public static Node<Integer> reverseLL(Node<Integer> head){
        Node<Integer> curr = head; // 1
        Node<Integer> prev = null;  // prev of head i.e prev of 1
        Node<Integer> temp;
        // 1 2 3 4 5 
        while (curr != null) {
            temp = curr.next; // store curr.next in temp means curr = 1 so store curr.next i.e 2 in temp
            curr.next = prev; // now point curr.next to prev element in list i.e point 2 to 1
            prev = curr; // make prev = curr i.e moving prev in the list
            curr = temp; // make curr = temp i.e moving curr in the list
        }
        return prev;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = reverseLL(head);
        print(head);
    }
}
