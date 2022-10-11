package Arrays;

import java.util.*;

public class ArrangeNumbers {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        int input[] = new int[size];
        int end = size - 1;
        // int start = 0 , end = size-1;
        // while(start<=end) {
        //     for (int i = 1; i <= size; i++) {
        //         if (i % 2 != 0) {
        //             arr[start++] = i;
        //         }
        //         else{
        //             arr[end--] = i;
        //         }
        //     }
        // }
        for (int start = 0; start <= end; start++) {
            for (int i = 1; i <= size; i++) {
                if (i % 2 != 0) {
                    input[start++] = i;
                } else {
                    input[end--] = i;
                }
            }
        }
        return input;

    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(Arrays.toString(arr));
    }
}
