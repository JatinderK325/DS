package LinkedListClass;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        // Phle apa kuch linked list bnai, nodes bnaiyan pr by default, sade kol linked list class hundi aa jinu apa use kr sakde aa sare operations li. Linked list class makes an object for us and provide various funstions to use.
        LinkedList<Integer> li = new LinkedList<>();
        // for adding elements in list
        li.add(10);
        li.add(30);
        li.add(50);
        li.add(100);
        // for replacing
        li.set(1, 300);
        li.addFirst(1000); // adding element at the beginning.
        li.addLast(2000); // adding element at the last.

        for (int i = 0; i < li.size(); i++) {
            System.out.print( li.get(i)+ " ");
        }
    }
}
