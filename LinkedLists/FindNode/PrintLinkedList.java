package LinkedLists.FindNode;

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

    // returning the index of an element that we are finding in the list.
    public static int findNode(Node<Integer> head, int eleToFind){
        int index = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            if(eleToFind == temp.data){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        int index = findNode(head, 6);
        System.out.println(index);
    }
}
