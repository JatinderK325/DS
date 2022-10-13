package Arrays;

import java.util.Scanner;

public class TripletSum {
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

    public static int tripletSum(int arr[]) {
        int n = 10;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // 2 8 10 5 -2 5
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k]  == n){
                        count++;
                    }
                }
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int totalTripletsEqualToSum = tripletSum(arr);
        System.out.println(totalTripletsEqualToSum);
    }
}

