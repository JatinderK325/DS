package LinkedLists.PallindromeLL;

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

    public static boolean pallindrome(Node<Integer> head, Node<Integer> finalHead){
        Node<Integer> temp = head;
        Node<Integer> temp1 = finalHead;
        if(head == null){
            return true;
        }
        if(temp.data == temp1.data){
            return true;
        }
        else{
            return false;
        }
    }
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
        Node<Integer> finalhead = reverseLL(head);
        boolean ans = pallindrome(head, finalhead);
        System.out.println(ans);
    }
}
