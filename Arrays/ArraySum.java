package Arrays;

import java.util.Scanner;

public class ArraySum {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = s.nextInt();
        System.out.println("Enter the elements of an array");
        int arr[] = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int calculateSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int sumOfElements = calculateSum(arr);
        System.out.println(sumOfElements);
    }
}
