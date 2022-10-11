package Arrays;
import java.util.*;

public class SwapAlternate {

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        System.out.println("Enter the elements");
        int array[] = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] swapElements(int arr[]){
        for (int i = 0; i < arr.length; i=i+2) {
            int element = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = element;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int newArray[] = swapElements(arr);
        System.out.println(Arrays.toString(newArray));
    }
}