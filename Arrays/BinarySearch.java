package Arrays;

public class BinarySearch {
    public static int binarySearch(int array[], int elementToSearch) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (elementToSearch == array[mid]) {
                return mid;
            } else if (elementToSearch > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int input[] = { 2, 4, 5, 8, 9, 15, 21, 28 };
        int index = binarySearch(input, 8);
        System.out.println(index);
    }
}
