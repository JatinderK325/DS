package TwoDArrays;

import java.util.Scanner;

public class PrintLikeAWave {
    public static int[][] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = s.nextInt();
        System.out.println("Enter number of columns");
        int cols = s.nextInt();
        int input[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at " + i + " row " + j + " columns");
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void printLikeAWave(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            if (j % 2 != 0) {
                for (int i = rows-1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        printLikeAWave(arr);
    }
}
