package LinkedLists.AppendLastN_nodesToFirst;

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

    // Appending the N nodes(elements) to the front of the list.
    public static Node<Integer> appendList(Node<Integer> head, int noOfElemToAppendToFront){
        Node<Integer> temp = head;
        // counting elems(that we need to append) starting from tail
        int count = 0;  // assume number of elements in a list
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        System.out.println("count = " + count);
    
        int startAppending = count - noOfElemToAppendToFront;
        System.out.println("From where we start appending list = " + startAppending);
        Node<Integer> temp1 = head;
        int i = 1;
        while(i < startAppending + 1){
            temp1 = temp1.next;
            i++;
        }
        Node<Integer> temp2 = temp1.next; // i == j
        Node<Integer> temp3 = temp1.next; 

        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = head;
        temp1.next = null;
        return temp3;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = appendList(head, 3);
        print(head);
    }
}
