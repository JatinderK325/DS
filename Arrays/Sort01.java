package Arrays;

public class Sort01 {
    public static void sort01(int arr[]){
        // selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int indexOfMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    indexOfMin = j;
                }
            }
            if(indexOfMin != i){
                arr[indexOfMin] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        int input[] = { 0, 1, 1, 0, 1, 0, 1 };
        sort01(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        
    }
}
