package LinkedListPractice.MergeTwoLL;

import java.util.LinkedList;
import java.util.Scanner;

public class MergeTwoLL {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null; // head is null initially.
        Node<Integer> head2 = null, tail2 = null; // head1 is null initially.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements for list 1");
        int data = s.nextInt(); // taking elements from user

        while(data != -1){ // taking elements from user until user gives -1
            // creating node for user's entered elements
            Node<Integer> newNode = new Node<>(data);
            if(head == null){ // for first node
                head = newNode;
                tail = newNode;
            }
            else{ 
                tail.next = newNode; // means we will put new element's reference at the tail's next part(last node's next).
                tail = newNode; // or tail = tail.next; // updating tail becoz new element has inserted and that will be our new tail.
            }

            data = s.nextInt(); // setting data step by step that is entered by user.
        }

        // Taking elements for List 2
        System.out.println("Enter elements for list 2");
        int data2 = s.nextInt(); // taking elements from user

        while(data2 != -1){ // taking elements from user until user gives -1
            // creating node for user's entered elements
            Node<Integer> newNode2 = new Node<>(data);
            if(head2 == null){ // for first node
                head2 = newNode2;
                tail2 = newNode2;
            }
            else{ 
                tail2.next = newNode2; // means we will put new element's reference at the tail's next part(last node's next).
                tail2 = newNode2; // or tail = tail.next; // updating tail becoz new element has inserted and that will be our new tail.
            }

            data2 = s.nextInt(); // setting data step by step that is entered by user.
        }
      
        Node<Integer> mergedList = null;
        

        return mergedList;
    }
    public static void print(Node <Integer> head){
        // Printing linked list
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; // setting head to the next node's address that is stored in node1' s next part initially.
        }
    }

    public static void main(String[] args) {
       Node<Integer> finalHead = takeInput();
       print(finalHead);
    }
}
