package ObjectOrientedProgramming.Recursion;

public class QuickSortWithRecursion {
    public static void quickSort(int arr[], int sI, int eI) {
        if (sI >= eI) {
            return;
        }
        int pivotPosition = partition(arr, sI, eI);
        // part1
        quickSort(arr, sI, pivotPosition - 1);
        // part2
        quickSort(arr, pivotPosition + 1, eI);
    }

    public static int partition(int arr[], int sI, int eI) {
        int pivot = arr[sI];
        int count = 0;
        for (int i = sI+1; i <= eI; i++) {
            if(arr[i] <= pivot){
                count++;
            }
        }
        int pivotPosition = sI + count;
        int temp = arr[sI];
        arr[sI] = arr[pivotPosition];
        arr[pivotPosition] = temp;
        
        int j = sI;
        int k = eI;
        while(j < pivotPosition && k > pivotPosition){
            if(arr[j] <= pivotPosition){
                j++;
            }
            if(arr[k] > pivotPosition){
                k--;
            }
            if(arr[j] > pivotPosition && arr[k] <= pivotPosition){
                int temp_ = arr[j];
                arr[j] = arr[k];
                arr[k] = temp_;
                j++;
                k--;
            }
        }
        return pivotPosition;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,8,9,1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
