package Arrays;

import java.util.*;

public class FindDuplicate {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        System.out.println("Enter the elements");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int duplicate(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int duplicate = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (duplicate == arr[j]) {
                    return duplicate;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int duplicate = duplicate(arr);
        System.out.println(duplicate);
    }
}
