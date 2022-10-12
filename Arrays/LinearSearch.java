package Arrays;

import java.util.*;

public class LinearSearch {
    public static int[] takeInput(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int findElement(int array[], Scanner sc) {
        int searchElement = sc.nextInt();
        int index = -1 ;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == searchElement){
                index = i;
            }
            else{
                index = -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array and ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of an array");
        int array[] = takeInput(arr, s);
        System.out.println("Enter the element you want to search");
        int elementIndex = findElement(array, s);
        System.out.println(elementIndex);
    }
}
