package Arrays;
// incomplete
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
        int sum = 0;
        int n = 10;
        for (int i = 0; i < arr.length - 1; i++) {
            // 2 8 10 5 -2 5
            
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int totalPairsEqualToSum = pairSum(arr);
        System.out.println(totalPairsEqualToSum);
    }
}
