package LinkedLists.Print_ithNodeData;

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
            else{ 
                tail.next = newNode; // means we will put new element's reference at the tail's next part(last node's next).
                tail = newNode; // or tail = tail.next; // updating tail becoz new element has inserted and that will be our new tail.
            }

            data = s.nextInt(); // setting data step by step that is entered by user.
        }
        return head;
    }

    // printing the element on ith node
    public static void printithNodeData(Node <Integer> head, int pos){
        int i = 0;
        Node<Integer> temp = head;
        while(i <= pos){
            if(i == pos){
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
            i++;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printithNodeData(head, 3);
    }
}
