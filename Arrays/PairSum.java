package Arrays;
import java.util.Scanner;

public class PairSum {
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

    public static int pairSum(int arr[]) {
        int n = 10;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // 2 8 10 5 -2 5
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == n){
                    count++;
                }
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int totalPairsEqualToSum = pairSum(arr);
        System.out.println(totalPairsEqualToSum);
    }
}
