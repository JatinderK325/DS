package TwoDArrays;

import java.util.Scanner;

public class LargestRowOrCol {
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

    public static void largestSum(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;
        int largestRowSum = Integer.MIN_VALUE;
        int largestColSum = Integer.MIN_VALUE;

        // getting largest sum from columns.
        int colIndex = 0;
        for (int j = 0; j < cols; j++) { //cols
            int colSum = 0;
            for (int i = 0; i < rows; i++) { //rows
                colSum = colSum + arr[i][j];
            }
            if(colSum > largestColSum){
                largestColSum = colSum;
                colIndex = j;
            }
        }
        // getting largest sum from rows.
        int rowIndex = 0;
        for (int i = 0; i < rows; i++) { //rows
            int rowSum = 0;
            for (int j = 0; j < cols; j++) { //cols
                rowSum = rowSum + arr[i][j];
            }    
            if(rowSum > largestRowSum){
                largestRowSum = rowSum;
                rowIndex = i;
            }
            
        }

        if(largestColSum > largestRowSum){
            System.out.println("Column" + " " + colIndex + " " + largestColSum);
        }
        else if(largestRowSum >= largestColSum){
            System.out.println("Row" + " " + rowIndex + " " + largestRowSum);
        }
        
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        print2DArray(arr);
        largestSum(arr);
    }
}
