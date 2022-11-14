package ObjectOrientedProgramming.Recursion;

public class BinarySearchRecursion {
    public static int binarySearch(int arr[], int elementToFind, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if(elementToFind == arr[mid]){
            return mid;
        }
        else if(elementToFind < arr[mid]){
            return binarySearch(arr, elementToFind, start, mid-1);
        }
        else{
            return binarySearch(arr, elementToFind, mid+1, end);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 8 };
        int elementToFind = 5;
        int start = 0;
        int end = arr.length - 1;
        int ans = binarySearch(arr, elementToFind, start, end);
        System.out.println(ans);
    }
}
