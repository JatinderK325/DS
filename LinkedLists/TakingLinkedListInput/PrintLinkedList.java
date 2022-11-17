package LinkedLists.TakingLinkedListInput;

import java.util.Scanner;

public class PrintLinkedList {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null; // head is null initially.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements");
        int data = s.nextInt(); // taking elements from user

        while(data != -1){ // taking elements from user until user gives -1
            // creating node for user's entered elements
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
            }
            else{
                // making links between nodes
                Node<Integer> temp = head;
                while(temp.next != null){
                    temp = temp.next; // moving temp
                }
                temp.next  = newNode;
            }
            data = s.nextInt();
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
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }
}
