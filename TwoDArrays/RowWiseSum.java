package TwoDArrays;

import java.util.Scanner;

public class RowWiseSum {
    public static int[][] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = s.nextInt();
        System.out.println("Enter number of columns");
        int cols = s.nextInt();
        int input[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at "+i+" row "+j+" columns");
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void print2DArray(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rowWiseSum(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) { //rows
            int sum = 0;
            for (int j = 0; j < cols; j++) { //cols
                sum = sum + arr[i][j];
            }    
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        print2DArray(arr);
        rowWiseSum(arr);
    }
}
