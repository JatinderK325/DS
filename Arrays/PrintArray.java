package Arrays;

import java.util.Scanner;

public class PrintArray {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        System.out.println("Enter the elements of the array");
        int input[] = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void printArray(int input[]) {
        int size = input.length;
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        printArray(arr);
    }
}
