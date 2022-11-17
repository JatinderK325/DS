package Arraylists.Introduction;

import java.util.ArrayList;

public class ArraylistIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // by default it creates capacity for 10 elements, then it expands acc to user's requirements
        
        list.add(12);
        list.add(20);
        list.add(24);
        list.add(50);
        list.add(2, 100); // will add 100 at index 2 and element that is already on index 2 will move to 3, element on index 3 will move to 4 and so on.
        list.set(1, 200); // it will replace element '20' with '200'.
        // if we want to replace in an array: arr[1] = 200;
        // list.remove(1); // will remove element from index 4.
        System.out.println(list.size()); // to get size of a array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        // for-each loop: iterate on elements not on indices
        for (int elem : list) {
            System.out.print(elem + " ");
        }

    }
}
