package Arrays;
// incomplete
import java.util.*;

public class FindUnique {
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

    public static int findUniqueNumber(int arr[]) {
        // int uniqueNumber = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (condition) {

        // }
        // }
        // }
        // return uniqueNumber;
        int uniqueNumber = 0;
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (visited[i] == false) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (x == arr[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (!isDuplicate)
                uniqueNumber = x;
            }
        }

        return uniqueNumber;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int uniqueNumber = findUniqueNumber(arr);
        System.out.println(uniqueNumber);
    }
}
