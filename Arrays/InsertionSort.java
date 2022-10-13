package Arrays;
public class InsertionSort {
    public static void insertionSort(int arr[]) {
        // insertion sort in ASC
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];

                j--;
            }
            arr[j + 1] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 13, 4, 1, 3, 6, 28 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
